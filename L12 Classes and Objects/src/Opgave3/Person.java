package Opgave3;

public class Person {
    String name;
    String address;
    int monthlySalary;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public Person(String name, String address, int monthlySalary) {
        this(name, address);
        this.monthlySalary = monthlySalary;
    }
    public void yearlySalary() {
        double rate = monthlySalary * 0.25;
        this.monthlySalary = (int) (monthlySalary * 12 + rate);
        System.out.println("Yearly Salary is: " + monthlySalary);
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %d kr", name, address, monthlySalary);
    }
    public void printPerson() {
        System.out.println("*******************");
        System.out.println("First name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("Monthly Salary: " + this.monthlySalary + " kr");
        System.out.println("*******************");
    }
}
