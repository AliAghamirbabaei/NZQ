package ViewModel.Report;

import Model.Date;
import Model.Transaction.Paid;
import Model.Transaction.PrePaid;
import Model.Transaction.PrePaidStatus;
import Model.Transaction.TransactionType;
import NZQ.Model.Chart.BalanceModel;

import java.util.ArrayList;

public class DebtCreditReport {

    private final ArrayList<Paid> paids;
    private final ArrayList<PrePaid> prePaids;

    public DebtCreditReport(ArrayList<Paid> paids, ArrayList<PrePaid> prePaids) {
        this.paids = paids;
        this.prePaids = prePaids;
    }

    public ArrayList<BalanceModel> generatePaidDateRange() {
        ArrayList<BalanceModel> result = new ArrayList<>();

        int sumCredit = 0;
        Date lastPaidDate = new Date(0,0,0,0,0);
        TransactionType transactionType;

        for (Paid paid : paids) {
            if (lastPaidDate.getYear() == 0 && lastPaidDate.getMonth() == 0 && lastPaidDate.getDay() == 0) {
                lastPaidDate = paid.getTime();
            }

            if (paid.getTime().getDay() == lastPaidDate.getDay()) {
                sumCredit += paid.getPrice();
                transactionType = paid.getTransactionType();
            } else {
                result.add(new BalanceModel(sumCredit, paid.getTime(), paid.getTransactionType()));
                sumCredit = 0;
                sumCredit += paid.getPrice();
                transactionType = paid.getTransactionType();
            }
        }

        return result;
    }

    //    public ArrayList<Integer> generateDailyDebt() {
//        ArrayList<Integer> result = new ArrayList<>();
//        Date currentDate = Date.getCurrentDate();
//        for (Paid paid : paids) {
//            if (paid.getTime().getYear() == currentDate.getYear()
//                    && paid.getTime().getMonth() == currentDate.getMonth()
//                    && paid.getTime().getDay() == currentDate.getDay()
//                    && paid.getTransactionType() == TransactionType.DEBT) {
//                result.add(paid.getPrice());
//            }
//        }
//        return result;
//    }
//
//    public ArrayList<Integer> generateMonthlyDebt(int year, int month) {
//        ArrayList<Integer> result = new ArrayList<>();
//        for (Paid paid : paids) {
//            if (paid.getTime().getYear() == year
//                    && paid.getTime().getMonth() == month
//                    && paid.getTransactionType() == TransactionType.DEBT) {
//                result.add(paid.getPrice());
//            }
//        }
//        return result;
//    }
//
//    public ArrayList<Integer> generateYearlyDebt(int year) {
//        ArrayList<Integer> result = new ArrayList<>();
//        for (Paid paid : paids) {
//            System.out.println(paid.getTime().getYear());
//            if (paid.getTime().getYear() == year
//                    && paid.getTransactionType() == TransactionType.DEBT) {
//                result.add(paid.getPrice());
//            }
//        }
//        return result;
//    }
//
//    public ArrayList<Integer> generateDailyCredit() {
//        ArrayList<Integer> result = new ArrayList<>();
//        Date currentDate = Date.getCurrentDate();
//        for (PrePaid prePaid : prePaids) {
//            if (prePaid.getTime().getYear() == currentDate.getYear()
//                    && prePaid.getTime().getMonth() == currentDate.getMonth()
//                    && prePaid.getTime().getDay() == currentDate.getDay()
//                    && prePaid.getTransactionType() == TransactionType.CREDIT) {
//                result.add(prePaid.getPrice());
//            }
//        }
//        return result;
//    }
//
//    public ArrayList<Integer> generateMonthlyCredit(int year, int month) {
//        ArrayList<Integer> result = new ArrayList<>();
//        for (PrePaid prePaid : prePaids) {
//            if (prePaid.getTime().getYear() == year
//                    && prePaid.getTime().getMonth() == month
//                    && prePaid.getTransactionType() == TransactionType.CREDIT) {
//                result.add(prePaid.getPrice());
//            }
//        }
//        return result;
//    }
//
//    public ArrayList<Integer> generateYearlyCredit(int year) {
//        ArrayList<Integer> result = new ArrayList<>();
//        for (PrePaid prePaid : prePaids) {
//            if (prePaid.getTime().getYear() == year
//                    && prePaid.getTransactionType() == TransactionType.CREDIT) {
//                result.add(prePaid.getPrice());
//            }
//        }
//        return result;
//    }
//
    public int getVertex() {
        if (!prePaids.isEmpty()) {
            int sum = 0;
            int sumOfAllPrePaids = 0;
            for (PrePaid prePaid : prePaids) {
                if (prePaid.isPrePaidPassed() == PrePaidStatus.NO) {
                    sum += prePaid.getPrice() * Date.getDifferentBetweenTwoDates(prePaid.getTime().toString(), Date.getCurrentDate().toString());
                    sumOfAllPrePaids += prePaid.getPrice();
                }
            }
            int result = sum / sumOfAllPrePaids;
            if (result < 0) {
                return Math.abs(result);
            } else {
                return result;
            }
        }
        return -1;
    }

    public int getSumOfDebts() {
        int sum = 0;

        for (Paid paid : paids) {
            if (paid.getTransactionType() == TransactionType.DEBT) {
                sum += paid.getPrice();
            }
        }
        return sum;
    }

    public int getSumOfCredits() {
        int sum = 0;

        for (Paid paid : paids) {
            if (paid.getTransactionType() == TransactionType.CREDIT) {
                sum += paid.getPrice();
            }
        }
        return sum;
    }
}
