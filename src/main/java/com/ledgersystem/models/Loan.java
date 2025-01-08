package com.ledgersystem.models;

import java.time.LocalDate;

public class Loan {
    private final double principal;
    private final double interestRate;
    private final int repaymentPeriod;
    private double outstandingBalance;
    private String status;
    private final LocalDate createdAt;

    public Loan(double principal, double interestRate, int repaymentPeriod) {
        this.principal = principal;
        this.interestRate = interestRate;
        this.repaymentPeriod = repaymentPeriod;
        this.outstandingBalance = calculateTotalRepayment();
        this.status = "active";
        this.createdAt = LocalDate.now();
    }

    public double calculateTotalRepayment() {
        return principal + (principal * interestRate * repaymentPeriod / 12);
    }

    public double getMonthlyInstallment() {
        return calculateTotalRepayment() / repaymentPeriod;
    }

    // Getters and setters


    public double getPrincipal() {
        return principal;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public int getRepaymentPeriod() {
        return repaymentPeriod;
    }

    public double getOutstandingBalance() {
        return outstandingBalance;
    }

    public void setOutstandingBalance(double outstandingBalance) {
        this.outstandingBalance = outstandingBalance;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void makePayment(double amount) {
        outstandingBalance -= amount;
        if (outstandingBalance <= 0) {
            status = "repaid";
        }
    }
}