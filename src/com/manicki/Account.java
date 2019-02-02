package com.manicki;

import java.math.BigDecimal;

public abstract class Account {
    private String customerName;
    private String customerLastName;
    private String accountNumber;
    private BigDecimal accountStatus;
    private boolean accountOpen;
    private AccountType accountType;

    public Account(String customerName, String customerLastName, String acoountNumber, BigDecimal accountStatus, AccountType accountType) {
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

    public void payIn(BigDecimal value) {
        System.out.println("Pay In = " + value);
        this.accountStatus.add(value);
    }

    public void payOut(BigDecimal value) {
        this.accountStatus.subtract(value);
    }

    public abstract AccountType getAccountType();

    @Override
    public String toString() {
        return this.accountNumber;
    }

    public BigDecimal getAccountStatus(){
        return this.accountStatus;
    }
}
