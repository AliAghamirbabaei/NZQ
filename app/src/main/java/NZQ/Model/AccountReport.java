package Model;

import Model.Transaction.TransactionType;

public class AccountReport {
    String name;
    Date date;
    int price;
    String description;
    TransactionType transactionType;

    public AccountReport(String name, Date date, int price, String description, TransactionType transactionType) {
        this.name = name;
        this.date = date;
        this.price = price;
        this.description = description;
        this.transactionType = transactionType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    @Override
    public String toString() {
        return "AccountReport{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", transactionType=" + transactionType +
                '}';
    }
}
