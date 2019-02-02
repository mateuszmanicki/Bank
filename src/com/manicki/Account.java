package com.manicki;

import java.math.BigDecimal;

public abstract class Account {
    private String customerName;
    private String customerLastName;
    private String accountNumber;
    private double accountStatus;       //BigDecimal - do operacji na walutach
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
        System.out.println("Pay In = " + value);
        this.accountStatus += value;
    }

    public void payOut(double value) {
        this.accountStatus -= value;
    }

    public abstract AccountType getAccountType();

    @Override
    public String toString() {
        return this.accountNumber;
    }

    public double getAccountStatus(){
        return this.accountStatus;
    }

    public void getLoan(int percent, double valueOfLoan, short lengthOfLoan) {
        System.out.println("Klient " + this.toString() +
                " wziął pożyczkę na " + lengthOfLoan +
                "miesiące w wysokości " + (int) valueOfLoan + " na procent: " + percent);
    }

    public boolean Debit(double debit){
        System.out.println("Hello world!");
        return (debit < accountStatus);
    }
}
