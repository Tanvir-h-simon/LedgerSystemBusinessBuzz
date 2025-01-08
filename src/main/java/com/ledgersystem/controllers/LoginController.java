package com.ledgersystem.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;

public class LoginController {
    @FXML private TextField emailField;
    @FXML private PasswordField passwordField;
    @FXML private Label messageLabel;

    @FXML
    private void handleLogin(ActionEvent event) {
        String email = emailField.getText();
        String password = passwordField.getText();

        // Add login logic here
        messageLabel.setText("Login functionality will be implemented");
    }

    @FXML
    private void handleRegister(ActionEvent event) {
        // Add registration navigation logic here
        messageLabel.setText("Register functionality will be implemented");
    }
}