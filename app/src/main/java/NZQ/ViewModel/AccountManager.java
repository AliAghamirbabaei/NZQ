package ViewModel;

import Model.Account;
import Repository.AccountFileManager;

import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class AccountManager {
    public ArrayList<Account> accounts = new ArrayList<>();

    public AccountManager() {
        init();
    }

    public void add(int id, String name, String nationalCode, String address, String tell, String email) {
        accounts.add(new Account(id, name, nationalCode, address, tell, email));
    }

    public void edit(int id, String name, String nationalCode, String address, String tell, String email) {
        Account accountElement = accounts.get(id - 1);
        accountElement.setId(id);
        accountElement.setName(name);
        accountElement.setNationalCode(nationalCode);
        accountElement.setAddress(address);
        accountElement.setTell(tell);
        accountElement.setEmail(email);
        accounts.set(id - 1, accountElement);
    }

    public void delete(int id) {
        System.out.println(accounts.size());
        accounts.remove(id - 1);
        System.out.println(accounts.size());
        for (int i = id; i <= accounts.size(); i++) {
            Account element = accounts.get(i - 1);
            edit(element.getId() - 1,
                    element.getName(),
                    element.getNationalCode(),
                    element.getAddress(),
                    element.getTell(),
                    element.getEmail());
        }
    }

    public void save() {
        AccountFileManager.saveData(accounts);
    }

    public Account findById(int id) {
        return accounts.get(id - 1);
    }

    private void init() {
        List<String[]> data = AccountFileManager.loadData();
        if (data != null) {
            for (String[] record : data) {
                if (record != null) {
                    add(Integer.parseInt(record[0]), record[1], record[2], record[3], record[4], record[5]);
                }
            }
        }
    }
}
