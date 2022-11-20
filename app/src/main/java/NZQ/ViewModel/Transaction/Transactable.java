package ViewModel.Transaction;

import Model.Date;
import Model.Transaction.TransactionType;

public interface Transactable {
    void add(int id, int accountId, Date time, String description, int price, TransactionType transactionType);

    void edit(int id, int accountId, Date time, String description, int price, TransactionType transactionType);

    void delete(int id);
    void deleteTransactionsByAccountId(int accountId);

    void save();
    void reloadData();

    private void init() {
    }

    private TransactionType stringToTransactionType(String name) {
        return null;
    }
}
