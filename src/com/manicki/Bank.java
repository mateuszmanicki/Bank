package com.manicki;

import java.math.BigDecimal;

public class Bank {
    public static void main(String[] args) {
        PersonalAccount personalAccount =
                new PersonalAccount(
                        "Mat",
                        "Man",
                        "26 0001 0002 0003 0004 0005 0006",
                        BigDecimal.valueOf(0),
                        AccountType.PERSONAL);

        CompanyAccount companyAccount =
                new CompanyAccount(
                        "Mat",
                        "Man",
                        "26 0001 0002 0003 0004 0005 0006",
                        BigDecimal.valueOf(0),
                        AccountType.COMPANY, 691008586,
                        "jakis tam");

        personalAccount.payIn(BigDecimal.valueOf(100));
        System.out.println("Stan konta " + personalAccount.toString() + " = " + personalAccount.getAccountStatus());
    }
}
