package com.ledgersystem.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import com.ledgersystem.models.User;

public class DashboardController {
    @FXML private Label welcomeLabel;
    @FXML private Label balanceLabel;
    @FXML private Label savingsLabel;
    @FXML private Label loanLabel;

    private User currentUser;

    public void initialize() {
        // Initialize dashboard data
    }

    public void setUser(User user) {
        this.currentUser = user;
        updateDashboard();
    }

    private void updateDashboard() {
        welcomeLabel.setText("Welcome, " + currentUser.getName());
        balanceLabel.setText(String.format("$%.2f", currentUser.getBalance()));
        savingsLabel.setText(String.format("$%.2f", currentUser.getSavings()));
        loanLabel.setText(String.format("$%.2f", currentUser.getLoan()));
    }

    @FXML
    private void showDebit() {
        // Implement debit screen navigation
    }

    @FXML
    private void showCredit() {
        // Implement credit screen navigation
    }

    @FXML
    private void showHistory() {
        // Implement history screen navigation
    }

    @FXML
    private void showSavings() {
        // Implement savings screen navigation
    }

    @FXML
    private void showLoan() {
        // Implement loan screen navigation
    }

    @FXML
    private void showInterestCalculator() {
        // Implement calculator screen navigation
    }

    @FXML
    private void handleLogout() {
        // Implement logout functionality
    }
}