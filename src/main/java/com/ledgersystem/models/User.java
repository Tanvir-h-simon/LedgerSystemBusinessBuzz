package com.ledgersystem.models;

public class User {
    private String name;
    private String email;
    private String password;
    private double balance;
    private double savings;
    private double loan;

    // Constructor, getters, setters
    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.balance = 0;
        this.savings = 0;
        this.loan = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getSavings() {
        return savings;
    }

    public void setSavings(double savings) {
        this.savings = savings;
    }

    public double getLoan() {
        return loan;
    }

    public void setLoan(double loan) {
        this.loan = loan;
    }
}