package ex2student;

public class Employee {
    // The name of the employee.
    String name;
    // Whether the employee is a trainee or not.
    boolean trainee;
    int age;

    /** Create an employee. */
    public Employee(String name, boolean trainee, int age) {
        this.name = name;
        this.trainee = true;
        this.age = age;
    }
    public void birthday() {
        this.age++;
    }

    @Override
    public String toString() {
        return String.format("Employee(%s, %s, %d)", name, trainee, age);
    }

    /** Print a description of the employee. */
    public void printEmployee() {
        int index = name.lastIndexOf(" ");
        System.out.println("*******************");
        System.out.println("First name: " + (name.substring(0,index)));
        System.out.println("Last name: " + (name.substring(index+1)));
        System.out.println("Trainee: " + trainee);
        System.out.println("Age: " + age);
        System.out.println("*******************");
    }
}
