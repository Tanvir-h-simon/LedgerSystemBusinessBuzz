package com.ledgersystem.services;

import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.util.List;

public class CsvStorageService {
    private static final String USER_CSV = "users.csv";
    private static final String TRANSACTION_CSV = "transactions.csv";

    public void saveUser(User user) {
        try (CSVWriter writer = new CSVWriter(new FileWriter(USER_CSV, true))) {
            String[] data = {
                    user.getId(),
                    user.getName(),
                    user.getEmail(),
                    user.getPassword()
            };
            writer.writeNext(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveTransaction(Transaction transaction) {
        try (CSVWriter writer = new CSVWriter(new FileWriter(TRANSACTION_CSV, true))) {
            String[] data = {
                    transaction.getDate().toString(),
                    transaction.getDescription(),
                    String.valueOf(transaction.getAmount()),
                    transaction.getType()
            };
            writer.writeNext(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}