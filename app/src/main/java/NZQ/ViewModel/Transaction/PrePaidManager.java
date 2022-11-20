package ViewModel.Transaction;

import Model.Date;
import Model.Transaction.Paid;
import Model.Transaction.PrePaid;
import Model.Transaction.PrePaidStatus;
import Model.Transaction.TransactionType;
import Repository.PrePaidFileManager;

import java.util.ArrayList;
import java.util.List;

public class PrePaidManager implements Transactable {

    public ArrayList<PrePaid> prePaids = new ArrayList<>();

    public PrePaidManager() {
        init();
    }

    public void add(int id, int accountId, Date time, String description, int price, TransactionType transactionType) {
        prePaids.add(new PrePaid(id, accountId, time, description, price, transactionType, PrePaidStatus.NO));
    }

    public void edit(int id, int accountId, Date time, String description, int price, TransactionType transactionType) {
        PrePaid prePaidElements = prePaids.get(id - 1);
        prePaidElements.setId(id);
        prePaidElements.setAccountId(accountId);
        prePaidElements.setTime(time);
        prePaidElements.setDescription(description);
        prePaidElements.setPrice(price);
        prePaids.set(id - 1, prePaidElements);
    }

    public void delete(int id) {
        System.out.println(prePaids.size());
        prePaids.remove(id - 1);
        System.out.println(prePaids.size());
        for (int i = id; i <= prePaids.size(); i++) {
            PrePaid element = prePaids.get(i - 1);
            edit(element.getId() - 1,
                    element.getAccountId(),
                    element.getTime(),
                    element.getDescription(),
                    element.getPrice(),
                    element.getTransactionType());
        }
    }

    public void deleteTransactionsByAccountId(int accountId) {
        for (PrePaid prePaid : prePaids) {
            if (prePaid.getAccountId() == accountId) {
                delete(prePaid.getId());
            }
        }
    }

    public void save() {
        PrePaidFileManager.saveData(prePaids);
    }

    public void reloadData() {
        prePaids.clear();
        init();
    }

    public void checkPrePaidsDeadline(PaidManager paidManager) {
        for (PrePaid prePaid : prePaids) {
            if (Date.isDeadlinePassed(prePaid.getTime()) && prePaid.isPrePaidPassed() == PrePaidStatus.NO) {
                prePaid.setPrePaidPassed(PrePaidStatus.YES);
                paidManager.add(paidManager.paids.size() + 1, prePaid.getAccountId(), prePaid.getTime(), prePaid.getDescription(), prePaid.getPrice(), prePaid.getTransactionType());
                prePaids.set(prePaid.getId() - 1, prePaid);
            }
        }
        paidManager.save();
        save();
    }

    private void init() {
        List<String[]> data = PrePaidFileManager.loadData();
        if (data != null) {
            for (String[] record : data) {
                if (record != null) {
                    readAllFieldsFromFile(
                            Integer.parseInt(record[0]),
                            Integer.parseInt(record[1]),
                            Date.stringToDate(record[2]),
                            record[3],
                            Integer.parseInt(record[4]),
                            stringToTransactionType(record[5]),
                            stringToPrePaidStatus(record[6]));
                }
            }
        }
    }

    private void readAllFieldsFromFile(int id, int accountId, Date time, String description, int price, TransactionType transactionType, PrePaidStatus prePaidStatus) {
        prePaids.add(new PrePaid(id, accountId, time, description, price, transactionType, prePaidStatus));
    }

    private TransactionType stringToTransactionType(String name) {
        return TransactionType.findByName(name);
    }

    private PrePaidStatus stringToPrePaidStatus(String name) {
        return PrePaidStatus.findByName(name);
    }

}
