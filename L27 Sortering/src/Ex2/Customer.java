package Ex2;

import java.util.ArrayList;

public class Customer implements Comparable<Customer> {
        private final String name;
        ArrayList<Customer> customers = new ArrayList<>();

        public Customer(String name) {
            this.name = name;

        }

    public String getName() {
        return name;
    }

    public int compareTo(Customer other) {
        return this.name.compareTo(other.name);
    }
    public void addCustomer(Customer customer) {
            customers.add(customer);
    }
}
