package ViewModel.Report;

import Model.Account;
import Model.AccountReport;
import Model.Transaction.Paid;
import Model.Transaction.PrePaid;

import java.util.ArrayList;

public class AccountReportManager {
    private final ArrayList<Account> accounts;
    private final ArrayList<Paid> paids;
    private final ArrayList<PrePaid> prePaids;

    public AccountReportManager(ArrayList<Account> accounts, ArrayList<Paid> paids, ArrayList<PrePaid> prePaids) {
        this.accounts = accounts;
        this.paids = paids;
        this.prePaids = prePaids;
    }

    public ArrayList<AccountReport> getTransactionOfAAccount(int accountId) {
        ArrayList<AccountReport> result = new ArrayList<>();
        for(Paid paid: paids) {
            if (accountId == paid.getAccountId()) {
                result.add(
                        new AccountReport(accounts.get(accountId-1).getName(),
                        paid.getTime(),
                        paid.getPrice(),
                        paid.getDescription(),
                        paid.getTransactionType()));

            }
        }

        for(PrePaid prePaid: prePaids) {
            if (accountId == prePaid.getAccountId()) {
                result.add(
                        new AccountReport(accounts.get(accountId-1).getName(),
                                prePaid.getTime(),
                                prePaid.getPrice(),
                                prePaid.getDescription(),
                                prePaid.getTransactionType()));
            }
        }
        return result;
    }
}
