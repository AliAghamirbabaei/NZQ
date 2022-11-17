package Repository;

import Model.Transaction.PrePaid;
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

public class PrePaidFileManager {
    private static final String PRE_PAID_FILE_PATH = "prepaid.csv";

    public static void saveData(ArrayList<PrePaid> prePaids) {
        PrePaidFileWriter.saveData(prePaids);
    }

    public static List<String[]> loadData() {
        return PrePaidFileReader.readAllLines();
    }

    private static class PrePaidFileWriter {
        private static final String[] PRE_PAID_HEADER_RECORD = {"شناسه", "نام", "زمان", "توضیحات", "مبلغ", "طرف حساب", "آیا وصول شده؟"};

        static void saveData(List<PrePaid> records) {
            try {
                File myObj = new File(PrePaidFileManager.PRE_PAID_FILE_PATH);
                if (myObj.createNewFile()) {
                    Writer writer = Files.newBufferedWriter(Paths.get(PrePaidFileManager.PRE_PAID_FILE_PATH));
                    CSVWriter csvWriter = new CSVWriter(writer);

                    csvWriter.writeNext(PRE_PAID_HEADER_RECORD);

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

        static void overrideFile(List<PrePaid> newRecords) {
            try {
                Writer writer = Files.newBufferedWriter(Paths.get(PrePaidFileManager.PRE_PAID_FILE_PATH));
                CSVWriter csvWriter = new CSVWriter(writer);

                csvWriter.writeNext(PRE_PAID_HEADER_RECORD);

                String[] formattedPrePaid = new String[7];
                for (PrePaid prePaid : newRecords) {
                    formattedPrePaid[0] = Integer.toString(prePaid.getId());
                    formattedPrePaid[1] = Integer.toString(prePaid.getAccountId());
                    formattedPrePaid[2] = prePaid.getTime().toString();
                    formattedPrePaid[3] = prePaid.getDescription();
                    formattedPrePaid[4] = Integer.toString(prePaid.getPrice());
                    formattedPrePaid[5] = prePaid.getTransactionType().getName();
                    formattedPrePaid[6] = String.valueOf(prePaid.isPrePaidPassed());
                    csvWriter.writeNext(formattedPrePaid);
                }
                csvWriter.close();
                writer.close();
            } catch (IOException e) {
                System.out.print("Error: ");
                e.printStackTrace();
            }
        }
    }

    private static class PrePaidFileReader {
        static List<String[]> readAllLines() {
            try {
                File file = new File(PRE_PAID_FILE_PATH);
                if (file.exists()) {
                    Reader reader = Files.newBufferedReader(Paths.get(PrePaidFileManager.PRE_PAID_FILE_PATH));
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