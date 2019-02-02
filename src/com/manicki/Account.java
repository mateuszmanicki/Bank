package com.manicki;

public abstract class Account {
    private String customerName;
    private String customerLastName;
    private String accountNumber;
    private double accountStatus;
    private boolean accountOpen;
    private AccountType accountType;

    public Account(String customerName, String customerLastName, String acoountNumber, double accountStatus, AccountType accountType) {
        this.customerName = customerName;
        this.customerLastName = customerLastName;
        this.accountNumber = acoountNumber;
        this.accountStatus = accountStatus;
        this.accountOpen = true;
        this.accountType = accountType;
    }

    public void openAccount() {
        this.accountOpen = true;
    };

    public void closeAccount(String accountNumber){
        this.accountOpen = false;
    };

    public void payIn(double value) {
        this.accountStatus += value;
    }

    public void payOut(double value) {
        this.accountStatus -= value;
    }

    public abstract AccountType getAccountType();

    @Override
    public String toString() {
        return super.toString();
    }
}
