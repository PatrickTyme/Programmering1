package Opgave10_7;

import java.time.LocalDate;
import java.util.Scanner;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private LocalDate dateCreated;

    private static final int NUM_ACCOUNTS = 10;
    private Account[] accounts;

    public Account() {
        accounts = new Account[NUM_ACCOUNTS];
        for (int i = 0; i < NUM_ACCOUNTS; i++) {
            accounts[i] = new Account(i, 100);
        }
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



    public void run() {
        Scanner input = new Scanner(System.in);
        boolean runProgram = true;
        while (runProgram) {
            System.out.print("Enter an ID: ");
            int id = input.nextInt();

            boolean enterID = (id >= 0 && id < accounts.length);
            while (!enterID) {
                System.out.println("Invalid ID, try again...");
                System.out.print("Enter an ID: ");
                id = input.nextInt();
                enterID = (id >= 0 && id < accounts.length);
            }

            boolean quitMenu = false;
            int choice = 0;

            while (!quitMenu) {
                System.out.println("\nMain menu");
                System.out.println("1: Check balance");
                System.out.println("2: Withdraw");
                System.out.println("3: Deposit");
                System.out.println("4: Exit");
                System.out.print("Enter a choice: ");
                choice = input.nextInt();

                if (choice == 1) {
                    System.out.println("The balance is " + accounts[id].getBalance() + "\n");
                } else if (choice == 2) {
                    System.out.print("Enter withdrawal amount: ");
                    int withdrawAmount = input.nextInt();
                    accounts[id].withdraw(withdrawAmount);
                    System.out.println("Withdrawal successful.\n");
                } else if (choice == 3) {
                    System.out.print("Enter deposit amount: ");
                    int depositAmount = input.nextInt();
                    accounts[id].deposit(depositAmount);
                    System.out.println("Deposit successful.\n");
                } else if (choice == 4) {
                    quitMenu = true;
                } else {
                    System.out.println("Invalid choice, try again...\n");
                }
            }

            if (choice == 4) {
                runProgram = true;
            }
        }
    }

    public static void main(String[] args) {
        Account manager = new Account();
        manager.run();
    }
}

