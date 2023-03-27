package Opgave3;

public class PersonApp {
    public static void main(String[] args) {
        Person p1 = new Person("Mathias Skriver", "Grundtvigs Hus Kollegiet");


        p1.monthlySalary = 2500;
        p1.printPerson();
        p1.yearlySalary();

        System.out.println("Test: " + p1);
        }
    }

