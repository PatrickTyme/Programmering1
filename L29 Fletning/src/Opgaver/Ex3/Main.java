package Opgaver.Ex3;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        Customer c1 = new Customer("Dylan", "Bob");
        Customer c2 = new Customer("Bennington", "Chester");
        Customer c3 = new Customer("Dion", "Celine");
        Customer c4 = new Customer("Cyrus", "Miley");
        Customer c5 = new Customer("Mane", "Gucci");

        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        customers.add(c4);
        customers.add(c5);
        selectionSortArrayList(customers);
        Customer[] cust = { c1, c2, c5 };
        selectionSortArray(cust);

        ArrayList<Customer> resultCostumers = goodCustomers(customers, cust);
        System.out.print("All customers: " + customers);
        System.out.println();
        System.out.println("-----");
        System.out.print("Bad customers: " + Arrays.toString(cust));
        System.out.println();
        System.out.println("-----");
        System.out.print("Good customers: " + resultCostumers);



    }
    /**
     * Return a sorted ArrayList containing all customers
     * from l1 that are not in l2.
     * Pre: l1 and l2 are sorted and l2 has no empty
     * entries.
     */
    public static ArrayList<Customer> goodCustomers(ArrayList<Customer> l1, Customer[] l2) {
        ArrayList<Customer> result = new ArrayList<>(l1);
        int i1 = 0;
        int i2 = 0;
            while (i1 < l1.size() && i2 < l2.length) {
                if (l1.get(i1).compareTo(l2[i2]) < 0) {
                    i1++;
                } else if (l1.get(i1).compareTo(l2[i2]) > 0) {
                    i2++;
                } else {
                    result.remove(l1.get(i1));
                    i1++;
                    i2++;
                }
            }
            return result;
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
    public static void selectionSortArray(Customer[] str) {
        for (int i = 0; i < str.length-1; i++) {
            int indexOfMin = i;
            for (int j = i+1; j < str.length; j++) {
                if (str[j].compareTo(str[indexOfMin]) < 0) {
                    indexOfMin = j;
                }
            }
            if (indexOfMin != i) {
                Customer temp = str[i];
                str[i] = str[indexOfMin];
                str[indexOfMin] = temp;
            }
        }
    }
}
