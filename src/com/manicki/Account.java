package com.manicki;

public abstract class Account {
    private String customerName;
    private String customerLastName;
    private String accountNumber;
    private double accountStatus;

    public Account(String customerName, String customerLastName, String acoountNumber, double accountStatus){
        this.customerName = customerName;
        this.customerLastName = customerLastName;
        this.accountNumber = acoountNumber;
        this.accountStatus = accountStatus;
    }

    public void openAccount(String customerName, String customerLastName, String accountNumber) {

    };

    public void closeAccount(String accountNumber){

    };
}
