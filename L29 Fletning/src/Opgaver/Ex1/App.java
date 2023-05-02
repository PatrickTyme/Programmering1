package Opgaver.Ex1;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Customer> l1 = new ArrayList<>();
        ArrayList<Customer> l2 = new ArrayList<>();

        l1.add(new Customer("Dickow", "Elvis"));
        l1.add(new Customer("Mogensen", "John"));
        l1.add(new Customer("Krebs", "Poul"));

        l2.add(new Customer("Sørensen", "Lis"));
        l2.add(new Customer("Boel", "Hanne"));
        l2.add(new Customer("Dickow", "Tina"));

        selectionSortArrayList(l1);
        selectionSortArrayList(l2);

        ArrayList<Customer> result = mergeAllCustomers(l1, l2);

        for (Customer c : result) {
            System.out.println(c.getLastName() + ", " + c.getFirstName());
        }
    }

    public static void selectionSortArrayList(ArrayList<Customer> customers) {
        for (int i = 0; i < customers.size()-1; i++) {
            int indexOfMin = i;
            for (int j = i+1; j < customers.size(); j++) {
                if (customers.get(j).compareTo(customers.get(indexOfMin)) < 0) {
                    indexOfMin = j;
                }
            }
            if (indexOfMin != i) {
                Customer temp = customers.get(i);
                customers.set(i, customers.get(indexOfMin));
                customers.set(indexOfMin, temp);
            }
        }
    }
    public static ArrayList<Customer> mergeAllCustomers(ArrayList<Customer> l1, ArrayList<Customer> l2) {
        ArrayList<Customer> result = new ArrayList<>();
        int i1 = 0;
        int i2 = 0;
        while (i1 < l1.size() && i2 < l2.size()) {
            if (l1.get(i1).compareTo(l2.get(i2)) <= 0) {
                // l1's tal er mindst
                result.add(l1.get(i1));
                i1++;
            } else {
                // l2's tal er mindst
                result.add(l2.get(i2));
                i2++;
            }
        }
        // tøm den liste der ikke er tom
        while (i1 < l1.size()) {
            result.add(l1.get(i1));
            i1++;
        }
        while (i2 < l2.size()) {
            result.add(l2.get(i2));
            i2++;
        }
        return result;
    }
}
