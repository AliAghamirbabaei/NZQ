package ViewModel.Report;

import Model.Account;
import Model.AccountReport;
import Model.Transaction.Paid;
import Model.Transaction.PrePaid;
import Model.Transaction.Transaction;
import Model.Transaction.TransactionType;

import java.util.ArrayList;

public class TransactionFilter {

    private final ArrayList<Account> accounts;
    private final ArrayList<Paid> paids;
    private final ArrayList<PrePaid> prePaids;

    public TransactionFilter(ArrayList<Account> accounts, ArrayList<Paid> paids, ArrayList<PrePaid> prePaids) {
        this.accounts = accounts;
        this.paids = paids;
        this.prePaids = prePaids;
    }

    public ArrayList<Paid> getDailyPaidTransactions(int fromDay, int toDay) {
        ArrayList<Paid> result = new ArrayList<>();
        // Check is user wants to get range of date or single day
        if (toDay == 0) {
            // Getting transactions of a day
            for (Paid paid : paids) {
                if (paid.getTime().getDay() == fromDay) {
                    result.add(paid);
                }
            }
        } else {
            // Getting transactions of a days
            for (Paid paid : paids) {
                if (paid.getTime().getDay() >= fromDay && paid.getTime().getDay() <= toDay) {
                    result.add(paid);
                }
            }
        }
        return result;
    }
    
    public ArrayList<PrePaid> getDailyPrePaidTransactions(int fromDay, int toDay) {
        ArrayList<PrePaid> result = new ArrayList<>();
        // Check is user wants to get range of date or single day
        if (toDay == 0) {
            for (PrePaid prePaid : prePaids) {
                if (prePaid.getTime().getDay() == fromDay) {
                    result.add(prePaid);
                }
            }
        } else {
            for (PrePaid prePaid : prePaids) {
                if (prePaid.getTime().getDay() >= fromDay && prePaid.getTime().getDay() <= toDay) {
                    result.add(prePaid);
                }
            }
        }
        return result;
    }
    
    // ---------------------------------------------------------

    public ArrayList<Paid> getMonthlyPaidTransactions(int year, int fromMonth, int toMonth) {
        ArrayList<Paid> result = new ArrayList<>();
        if (toMonth == 0) {
            for (Paid paid : paids) {
                if (paid.getTime().getYear() == year
                        && paid.getTime().getMonth() == fromMonth) {
                    result.add(paid);
                }
            }
        } else {
            for (Paid paid : paids) {
                if (paid.getTime().getYear() == year
                        && paid.getTime().getMonth() >= fromMonth
                        && paid.getTime().getMonth() <= toMonth) {
                    result.add(paid);
                }
            }
        }
        return result;
    }
    
    public ArrayList<PrePaid> getMonthlyPrePaidTransactions(int year, int fromMonth, int toMonth) {
        ArrayList<PrePaid> result = new ArrayList<>();
        if (toMonth == 0) {
            for (PrePaid prePaid : prePaids) {
                if (prePaid.getTime().getYear() == year
                        && prePaid.getTime().getMonth() == fromMonth) {
                    result.add(prePaid);
                }
            }
        } else {
            for (PrePaid prePaid : prePaids) {
                if (prePaid.getTime().getYear() == year
                        && prePaid.getTime().getMonth() >= fromMonth
                        && prePaid.getTime().getMonth() <= toMonth) {
                    result.add(prePaid);
                }
            }
        }
        return result;
    }

    // ---------------------------------------------------------
    
    public ArrayList<Paid> getYearlyPaidTransactions(int fromYear, int toYear) {
        ArrayList<Paid> result = new ArrayList<>();
        if (toYear == 0) {
            for (Paid paid : paids) {
                if (paid.getTime().getYear() == fromYear) {
                    result.add(paid);
                }
            }
        } else {
            for (Paid paid : paids) {
                if (paid.getTime().getYear() >= fromYear
                        && paid.getTime().getYear() <= toYear) {
                    result.add(paid);
                }
            }
        }
        return result;
    }
    
    public ArrayList<PrePaid> getYearlyPrePaidTransactions(int fromYear, int toYear) {
        ArrayList<PrePaid> result = new ArrayList<>();
        if (toYear == 0) {
            for (PrePaid prePaid : prePaids) {
                if (prePaid.getTime().getYear() == fromYear) {
                    result.add(prePaid);
                }
            }
        } else {
            for (PrePaid prePaid : prePaids) {
                if (prePaid.getTime().getYear() >= fromYear
                        && prePaid.getTime().getYear() <= toYear) {
                    result.add(prePaid);
                }
            }
        }
        return result;
    }
    
    // ---------------------------------------------------------

    public ArrayList<Paid> getPaidTransactionsWithPriceRange(int from, int to) {
        ArrayList<Paid> result = new ArrayList<>();
        for (Paid paid : paids) {
            if (paid.getPrice() >= from && paid.getPrice() <= to) {
                result.add(paid);
            }
        }
        return result;
    }
    
    public ArrayList<PrePaid> getPrePaidTransactionsWithPriceRange(int from, int to) {
        ArrayList<PrePaid> result = new ArrayList<>();
        for (PrePaid prePaid : prePaids) {
            if (prePaid.getPrice() >= from && prePaid.getPrice() <= to) {
                result.add(prePaid);
            }
        }
        return result;
    }
    
    // ---------------------------------------------------------

    public ArrayList<Paid> getPaidTransactionsTypes(TransactionType transactionType) {
        ArrayList<Paid> result = new ArrayList<>();
        for (Paid paid : paids) {
            if (paid.getTransactionType() == transactionType) {
                result.add(paid);
            }
        }
        return result;
    }
    
    public ArrayList<PrePaid> getPrePaidTransactionsTypes(TransactionType transactionType) {
        ArrayList<PrePaid> result = new ArrayList<>();
        for (PrePaid prePaid : prePaids) {
            if (prePaid.getTransactionType() == transactionType) {
                result.add(prePaid);
            }
        }
        return result;
    }
    
    // ---------------------------------------------------------
    
    public ArrayList<Paid> getPaidTransactionOfAAccount(int accountId) {
        ArrayList<Paid> result = new ArrayList<>();
        for(Paid paid: paids) {
            if (accountId == paid.getAccountId()) {
                result.add(paid);
            }
        }
        return result;
    }
    
    public ArrayList<PrePaid> getPrePaidTransactionOfAAccount(int accountId) {
        ArrayList<PrePaid> result = new ArrayList<>();
        for(PrePaid prePaid: prePaids) {
            if (accountId == prePaid.getAccountId()) {
                result.add(prePaid);
            }
        }
        return result;
    }
}
