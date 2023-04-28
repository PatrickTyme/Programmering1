package Ex2;
    public class Customer implements Comparable<Customer> {
        private final String name;
        private final int score;

        public Customer(String name, int score) {
            this.name = name;
            this.score = score;
        }


    public int compareTo(Customer other) {
        return this.name.compareTo(other.name);
    }
}
