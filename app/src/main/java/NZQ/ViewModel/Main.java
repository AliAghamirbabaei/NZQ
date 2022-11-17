package ViewModel;

import Model.Date;
import Model.Transaction.TransactionType;
import ViewModel.Report.DebtCreditReport;
import ViewModel.Transaction.PaidManager;
import ViewModel.Transaction.PrePaidManager;

import java.text.ParseException;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        AccountManager accountManager = new AccountManager();
        PaidManager paidManager = new PaidManager();
        PrePaidManager prePaidManager = new PrePaidManager();


//        for (int i = 0; i < 10; i++) {
//            accountManager.add(accountManager.accounts.size() + 1, "Ali", "12312413", "asdsef", "12334", "asdasd");
//        }
////        //***********************************************************************
//        for (int i = 0; i < 10; i++) {
//            Random rand = new Random();
//            TransactionType type;
//            if (rand.nextInt(10) >= 5) {
//                type = TransactionType.DEBT;
//            }else {
//                type = TransactionType.CREDIT;
//            }
//
//            paidManager.add(
//                    paidManager.paids.size() + 1,
//                    rand.nextInt(accountManager.accounts.size()),
//                    new Date(rand.nextInt(30), 11, 2022, 3, 24),
//                    "نقدی",
//                    rand.nextInt(10000), type);
//        }
////2022-11-14
//
//        //***********************************************************************
//        for (int i = 0; i < 10; i++) {
//            Random rand = new Random();
//            TransactionType type;
//            if (rand.nextInt(10) >= 5) {
//                type = TransactionType.DEBT;
//            }else {
//                type = TransactionType.CREDIT;
//            }
//
//            prePaidManager.add(
//                    prePaidManager.prePaids.size() + 1,
//                    rand.nextInt(accountManager.accounts.size()),
//                    new Date(rand.nextInt(30), 11, 2022, 3, 24),
//                    "چک",
//                    rand.nextInt(10000), type);
//        }

//        prePaidManager.checkPrePaidsDeadline(paidManager);
//
//        paidManager.save();
//        prePaidManager.save();
//        accountManager.save();
//        paidManager.reloadData();
        //***********************************************************************

        //DebtCreditReport debtCreditReport = new DebtCreditReport(paidManager.paids, prePaidManager.prePaids);
//        System.out.println(debtCreditReport.generateYearlyDebt(2020));
//        System.out.println(debtCreditReport.generateYearlyCredit(2020));

       // TransactionFilter transactionFilter = new TransactionFilter(paidManager.paids, prePaidManager.prePaids);
       // System.out.println(transactionFilter.getYearlyTransaction(2022, 0));

    }
}
