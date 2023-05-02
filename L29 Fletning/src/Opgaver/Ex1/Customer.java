package Opgaver.Ex1;

import java.util.ArrayList;


public class Customer implements Comparable<Customer> {
    private final String firstName;
    private final String lastName;

    public Customer(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public int compareTo(Customer other) {
        int result = this.lastName.compareTo(other.lastName);
        if (result == 0) {
            result = this.firstName.compareTo(other.firstName);
        }
        return result;
    }
}
