package ViewModel.Transaction;

import Repository.PaidFileManager;
import Model.Transaction.TransactionType;

import Model.Date;
import Model.Transaction.Paid;

import java.util.ArrayList;
import java.util.List;

public class PaidManager implements Transactable {
    public ArrayList<Paid> paids = new ArrayList<>();

    public PaidManager() {
        init();
    }

    public void add(int id, int accountId, Date time, String description, int price, TransactionType transactionType) {
        paids.add(new Paid(id, accountId, time, description, price, transactionType));
    }

    public void edit(int id, int accountId, Date time, String description, int price, TransactionType transactionType) {
        Paid paidElement = paids.get(id - 1);
        paidElement.setId(id);
        paidElement.setAccountId(accountId);
        paidElement.setTime(time);
        paidElement.setDescription(description);
        paidElement.setPrice(price);
        paidElement.setTransactionType(transactionType);
        paids.set(id - 1, paidElement);
    }

    public void delete(int id) {
        System.out.println(paids.size());
        paids.remove(id - 1);
        System.out.println(paids.size());
        for (int i = id; i <= paids.size(); i++) {
            Paid element = paids.get(i - 1);
            edit(element.getId() - 1,
                    element.getAccountId(),
                    element.getTime(),
                    element.getDescription(),
                    element.getPrice(),
                    element.getTransactionType());
        }
    }

    public void save() {
        PaidFileManager.saveData(paids);
    }
    public void reloadData() {
        paids.clear();
        init();
    }

    private void init() {
        List<String[]> data = PaidFileManager.loadData();
        if (data != null) {
            for (String[] record : data) {
                if (record != null) {
                    add(
                            Integer.parseInt(record[0]),
                            Integer.parseInt(record[1]),
                            Date.stringToDate(record[2]),
                            record[3],
                            Integer.parseInt(record[4]),
                            stringToTransactionType(record[5]));
                }
            }
        }
    }

    private TransactionType stringToTransactionType(String name) {
        return TransactionType.findByName(name);
    }
}
