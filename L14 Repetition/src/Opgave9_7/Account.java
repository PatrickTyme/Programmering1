package Opgave9_7;

import java.time.LocalDate;
import java.time.LocalTime;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private LocalDate dateCreated;


    public Account() {
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = LocalDate.now();
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate() / 100;
    }

    public void withdraw(int withdrawAmount) {
        this.balance -= withdrawAmount;
    }
    public void deposit(int depositAmount) {
        this.balance += depositAmount;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }
}
