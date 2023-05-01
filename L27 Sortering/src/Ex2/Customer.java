package Ex2;

import java.util.ArrayList;

public class Customer implements Comparable<Customer> {
        private final String name;
        private final int score;
        ArrayList<Customer> customers = new ArrayList<>();

        public Customer(String name, int score) {
            this.name = name;
            this.score = score;
        }


    public int compareTo(Customer other) {
        return this.name.compareTo(other.name);
    }
    public void addCustomer(Customer customer) {
            customers.add(customer);
    }
}
