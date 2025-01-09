package com.ledgersystem.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.io.IOException;

public class DashboardController {
    @FXML private Label balanceLabel;
    @FXML private Label savingsLabel;
    @FXML private Label loanLabel;
    @FXML private TableView<Transaction> transactionTable;

    @FXML
    public void initialize() {
        updateLabels();
        setupTable();
    }

    private void updateLabels() {
        // Update balance, savings, and loan labels
    }

    @FXML
    private void handleDebit() {
        Dialog<ButtonType> dialog = createTransactionDialog("Debit");
        // Handle debit transaction
    }

    @FXML
    private void handleCredit() {
        Dialog<ButtonType> dialog = createTransactionDialog("Credit");
        // Handle credit transaction
    }

    private Dialog<ButtonType> createTransactionDialog(String type) {
        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.setTitle(type + " Transaction");

        GridPane grid = new GridPane();
        TextField amountField = new TextField();
        TextField descriptionField = new TextField();

        grid.add(new Label("Amount:"), 0, 0);
        grid.add(amountField, 1, 0);
        grid.add(new Label("Description:"), 0, 1);
        grid.add(descriptionField, 1, 1);

        dialog.getDialogPane().setContent(grid);
        dialog.getDialogPane().getButtonTypes().addAll(ButtonType.OK, ButtonType.CANCEL);

        return dialog;
    }

    // Add other handler methods...
}