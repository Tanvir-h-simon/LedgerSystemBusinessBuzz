package com.ledgersystem.services;

import javafx.application.Platform;
import javafx.scene.control.Alert;
import java.time.LocalDate;

public class ReminderService {
    public void checkLoanDue(Loan loan) {
        LocalDate dueDate = loan.getDueDate();
        if (LocalDate.now().plusDays(7).isAfter(dueDate)) {
            Platform.runLater(() -> showReminderAlert(loan));
        }
    }

    private void showReminderAlert(Loan loan) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Loan Payment Reminder");
        alert.setHeaderText("Upcoming Loan Payment");
        alert.setContentText("Your loan payment of $" +
                loan.getMonthlyPayment() + " is due on " +
                loan.getDueDate());
        alert.show();
    }
}