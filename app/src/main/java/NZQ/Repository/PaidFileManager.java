package Repository;

import Model.Transaction.Paid;
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

public class PaidFileManager {
    private static final String PAID_FILE_PATH = "paid.csv";

    public static void saveData(ArrayList<Paid> paids) {
        PaidFileWriter.saveData(paids);
    }

    public static List<String[]> loadData() {
        return PaidFileReader.readAllLines();
    }

    private static class PaidFileWriter {
        private static final String[] PAID_HEADER_RECORD = {"شناسه", "نام", "زمان", "توضیحات", "مبلغ", "طرف حساب"};

        static void saveData(List<Paid> records) {
            try {
                File myObj = new File(PaidFileManager.PAID_FILE_PATH);
                if (myObj.createNewFile()) {
                    Writer writer = Files.newBufferedWriter(Paths.get(PaidFileManager.PAID_FILE_PATH));
                    CSVWriter csvWriter = new CSVWriter(writer);

                    csvWriter.writeNext(PAID_HEADER_RECORD);

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

        static void overrideFile(List<Paid> newRecords) {
            try {
                Writer writer = Files.newBufferedWriter(Paths.get(PaidFileManager.PAID_FILE_PATH));
                CSVWriter csvWriter = new CSVWriter(writer);

                csvWriter.writeNext(PAID_HEADER_RECORD);

                String[] formattedPaid = new String[6];
                for (Paid paid : newRecords) {
                    formattedPaid[0] = Integer.toString(paid.getId());
                    formattedPaid[1] = Integer.toString(paid.getAccountId());
                    formattedPaid[2] = paid.getTime().toString();
                    formattedPaid[3] = paid.getDescription();
                    formattedPaid[4] = Integer.toString(paid.getPrice());
                    formattedPaid[5] = paid.getTransactionType().getName();
                    csvWriter.writeNext(formattedPaid);
                }
                csvWriter.close();
                writer.close();
            } catch (IOException e) {
                System.out.print("Error: ");
                e.printStackTrace();
            }
        }
    }

    private static class PaidFileReader {
        static List<String[]> readAllLines() {
            try {
                File file = new File(PAID_FILE_PATH);
                if (file.exists()) {
                    Reader reader = Files.newBufferedReader(Paths.get(PaidFileManager.PAID_FILE_PATH));
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