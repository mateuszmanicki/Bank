package com.manicki;

import java.math.BigDecimal;

public class PersonalAccount extends Account {

    public PersonalAccount(String customerName, String customerLastName, String acoountNumber, double accountStatus, AccountType accountType) {
        super(customerName, customerLastName, acoountNumber, accountStatus, accountType);
    }

    @Override
    public AccountType getAccountType() {
        return AccountType.PERSONAL;
    }
}
