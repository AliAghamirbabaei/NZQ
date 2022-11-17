package ViewModel.Report;

import Model.Date;
import Model.Transaction.Paid;
import Model.Transaction.PrePaid;
import Model.Transaction.Transaction;

import java.util.ArrayList;

public class TransactionFilter {
    private final ArrayList<Paid> paids;
    private final ArrayList<PrePaid> prePaids;

    public TransactionFilter(ArrayList<Paid> paids, ArrayList<PrePaid> prePaids) {
        this.paids = paids;
        this.prePaids = prePaids;
    }

    public ArrayList<Transaction> getDailyTransaction(int fromDay, int toDay) {
        ArrayList<Transaction> result = new ArrayList<>();
        // Check is user wants to get range of date or single day
        if (toDay == 0) {
            // Getting transactions of a day
            for (Paid paid : paids) {
                if (paid.getTime().getDay() == fromDay) {
                    result.add(paid);
                }
            }

            for (PrePaid prePaid : prePaids) {
                if (prePaid.getTime().getDay() == fromDay) {
                    result.add(prePaid);
                }
            }
        } else {
            // Getting transactions of a days
            for (Paid paid : paids) {
                if (paid.getTime().getDay() >= fromDay && paid.getTime().getDay() <= toDay) {
                    result.add(paid);
                }
            }

            for (PrePaid prePaid : prePaids) {
                if (prePaid.getTime().getDay() >= fromDay && prePaid.getTime().getDay() <= toDay) {
                    result.add(prePaid);
                }
            }
        }
        return result;
    }

    public ArrayList<Transaction> getMonthlyTransaction(int year, int fromMonth, int toMonth) {
        ArrayList<Transaction> result = new ArrayList<>();
        if (toMonth == 0){
            for (Paid paid : paids) {
                if (paid.getTime().getYear() == year &&
                        paid.getTime().getMonth() == fromMonth) {
                    result.add(paid);
                }
            }

            for (PrePaid prePaid : prePaids) {
                if (prePaid.getTime().getYear() == year &&
                        prePaid.getTime().getMonth() == fromMonth) {
                    result.add(prePaid);
                }
            }
        } else {
            for (Paid paid : paids) {
                if (paid.getTime().getYear() == year &&
                        paid.getTime().getMonth() >= fromMonth &&
                        paid.getTime().getMonth() <= toMonth) {
                    result.add(paid);
                }
            }

            for (PrePaid prePaid : prePaids) {
                if (prePaid.getTime().getYear() == year &&
                        prePaid.getTime().getMonth() >= fromMonth &&
                        prePaid.getTime().getMonth() <= toMonth) {
                    result.add(prePaid);
                }
            }
        }
        return result;
    }

    public ArrayList<Transaction> getYearlyTransaction(int fromYear, int toYear) {
        ArrayList<Transaction> result = new ArrayList<>();
        if (toYear == 0) {
            for (Paid paid : paids) {
                if (paid.getTime().getYear() == fromYear) {
                    result.add(paid);
                }
            }

            for (PrePaid prePaid : prePaids) {
                if (prePaid.getTime().getYear() == fromYear) {
                    result.add(prePaid);
                }
            }
        } else {
            for (Paid paid : paids) {
                if (paid.getTime().getYear() >= fromYear &&
                        paid.getTime().getYear() <= toYear) {
                    result.add(paid);
                }
            }

            for (PrePaid prePaid : prePaids) {
                if (prePaid.getTime().getYear() >= fromYear &&
                        prePaid.getTime().getYear() <= toYear) {
                    result.add(prePaid);
                }
            }
        }
        return result;
    }
}
