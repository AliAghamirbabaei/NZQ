package Model.Transaction;

import Model.Date;

public class Paid extends Transaction{

    public Paid(int id, int accountId, Date time, String description, int price, TransactionType transactionType) {
        super(id, accountId, time, description, price, transactionType);
    }
}
