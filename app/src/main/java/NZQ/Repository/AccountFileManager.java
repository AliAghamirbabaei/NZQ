package Repository;

import Model.Account;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;


import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class AccountFileManager {
    private static final String ACCOUNTS_FILE_PATH = "accounts.csv";

    public static void saveData(ArrayList<Account> accounts) {
        AccountFileWriter.saveData(accounts);
    }

    public static List<String[]> loadData() {
        return AccountFileReader.readAllLines();
    }

    private static class AccountFileWriter {
        private static final String[] ACCOUNTS_HEADER_RECORD = {"شناسه", "نام", "کد ملی", "آدرس", "تلفن", "ایمیل"};

        static void saveData(List<Account> records) {
            try {
                File myObj = new File(AccountFileManager.ACCOUNTS_FILE_PATH);
                if (myObj.createNewFile()) {
                    Writer writer = Files.newBufferedWriter(Paths.get(AccountFileManager.ACCOUNTS_FILE_PATH));
                    CSVWriter csvWriter = new CSVWriter(writer);

                    csvWriter.writeNext(ACCOUNTS_HEADER_RECORD);

                    csvWriter.close();
                    writer.close();
                    overrideFile(records);
                } else {
                    System.out.println("File already exists.");
                    overrideFile(records);
                }
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }

        static void overrideFile(List<Account> newRecords) {
            try {
                Writer writer = Files.newBufferedWriter(Paths.get(AccountFileManager.ACCOUNTS_FILE_PATH));
                CSVWriter csvWriter = new CSVWriter(writer);

                csvWriter.writeNext(ACCOUNTS_HEADER_RECORD);

                String[] formattedAccount = new String[6];
                for (Account account : newRecords) {
                    formattedAccount[0] = Integer.toString(account.getId());
                    formattedAccount[1] = account.getName();
                    formattedAccount[2] = account.getNationalCode();
                    formattedAccount[3] = account.getAddress();
                    formattedAccount[4] = account.getTell();
                    formattedAccount[5] = account.getEmail();
                    csvWriter.writeNext(formattedAccount);
                }
                csvWriter.close();
                writer.close();
            } catch (IOException e) {
                System.out.print("Error: ");
                e.printStackTrace();
            }
        }
    }

    private static class AccountFileReader {
        static List<String[]> readAllLines() {
            try {
                File file = new File(AccountFileManager.ACCOUNTS_FILE_PATH);
                if (file.exists()) {
                    Reader reader = Files.newBufferedReader(Paths.get(AccountFileManager.ACCOUNTS_FILE_PATH));
                    CSVReader csvReader = new CSVReader(reader);
                    csvReader.skip(1);
                    return csvReader.readAll();
                } else {
                    return null;
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            return null;
        }
    }
}