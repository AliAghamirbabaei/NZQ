package Model.Transaction;
import Model.Date;

import java.io.Serializable;

public class Transaction implements Serializable {
    private int id;
    private int accountId;
    private Date time;
    private String description;
    private int price;
    private TransactionType transactionType;

    public Transaction(int id, int accountId, Date time, String description, int price, TransactionType transactionType) {
        this.id = id;
        this.accountId = accountId;
        this.time = time;
        this.description = description;
        this.price = price;
        this.transactionType = transactionType;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", accountId=" + accountId +
                ", time=\n" + time +
                "\n, description='" + description + '\'' +
                ", price=" + price +
                ", transactionType=" + transactionType +
                '}';
    }
}
