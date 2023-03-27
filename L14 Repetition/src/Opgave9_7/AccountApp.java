package Opgave9_7;

import java.sql.SQLOutput;

public class AccountApp {
    public static void main(String[] args) {
        Account a1 = new Account(1122, 20000);
        a1.setAnnualInterestRate(4.5);
        System.out.printf("Account: %d\n", a1.getId(), " balance: $ %.1f\n", a1.getBalance());
        a1.withdraw(2500);
        System.out.printf("Balance is now: $ %.1f\n", a1.getBalance());
        a1.deposit(3000);
        System.out.printf("Balance is now: $ %.1f\n", a1.getBalance());
        System.out.println();
        System.out.println("Account info:");
        System.out.printf("Balance: $ %.1f\n", a1.getBalance());
        System.out.printf("Monthly Interest: %.1f\n", a1.getMonthlyInterest());
        System.out.printf("Date of account creation: %s\n", a1.getDateCreated());
    }
}
