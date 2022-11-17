package Model.Transaction;

import Model.Date;

public class PrePaid extends Transaction {
    private PrePaidStatus isPrePaidPassed;
    public PrePaid(int id, int accountId, Date time, String description, int price, TransactionType transactionType, PrePaidStatus isPrePaidPassed) {
        super(id, accountId, time, description, price, transactionType);
        this.isPrePaidPassed = isPrePaidPassed;
    }

    public PrePaidStatus isPrePaidPassed() {
        return isPrePaidPassed;
    }

    public void setPrePaidPassed(PrePaidStatus prePaidPassed) {
        isPrePaidPassed = prePaidPassed;
    }
}
