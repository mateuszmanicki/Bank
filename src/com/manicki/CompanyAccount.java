package com.manicki;

import java.math.BigDecimal;

public class CompanyAccount extends Account {
    private long nip;
    private String regon;

    public CompanyAccount(String customerName, String customerLastName, String acoountNumber, double accountStatus, AccountType accountType, long nip, String regon) {
        super(customerName, customerLastName, acoountNumber, accountStatus, accountType);
        this.nip = nip;
        this.regon = regon;
    }

    @Override
    public AccountType getAccountType() {
        return AccountType.COMPANY;
    }

    @Override
    public String toString() {
        return super.toString() + ", nip = " + this.nip + ", regon = " + this.regon;
    }
}
