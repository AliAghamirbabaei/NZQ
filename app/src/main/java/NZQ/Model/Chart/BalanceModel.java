/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
package NZQ.Model.Chart;

import Model.Date;
import Model.Transaction.TransactionType;

/**
 *
 * @author aliaghamirbabaei
 */
public class BalanceModel {
    private int price;
    private Date date;
    private TransactionType transactionType;

    public BalanceModel(int price, Date date, TransactionType transactionType) {
        this.price = price;
        this.date = date;
        this.transactionType = transactionType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }
}
