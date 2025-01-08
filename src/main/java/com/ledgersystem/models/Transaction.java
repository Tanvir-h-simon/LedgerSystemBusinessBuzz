package com.ledgersystem.models;

import java.time.LocalDate;

public class Transaction {
    private LocalDate date;
    private String description;
    private double debit;
    private double credit;
    private double balance;

    // Constructor, getters, setters
    public Transaction(LocalDate date, String description, double debit, double credit, double balance) {
        this.date = date;
        this.description = description;
        this.debit = debit;
        this.credit = credit;
        this.balance = balance;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getDebit() {
        return debit;
    }

    public void setDebit(double debit) {
        this.debit = debit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
