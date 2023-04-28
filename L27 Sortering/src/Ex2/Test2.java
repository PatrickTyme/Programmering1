package Ex2;

import java.util.ArrayList;
import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        String[] str = { "Hanne", "Kurt", "Janus", "Mikael" };

        ArrayList<String> str2 = new ArrayList<>();
        str2.add("Hanne");
        str2.add("Mikael");
        str2.add("Janus");
        str2.add("Kurt");

        selectionSortArray(str);
        System.out.println(Arrays.toString(str));
    }

    //Write two selection sort methods. The first must take an array String[] as parameter, the
    //second must take an ArrayList<Customer> as parameter. Make your own Customer class that
    //has a compareTo(Customer): int method (you decide how customers are compared).
    //Test your methods

    public static void selectionSortArray(String[] str) {
        for (int i = 0; i < str.length-1; i++) {
            int indexOfMin = i;
            for (int j = i+1; j < str.length; j++) {
                if (str[j].compareTo(str[indexOfMin]) < 0) {
                    indexOfMin = j;
                }
            }
            if (indexOfMin != i) {
                String temp = str[i];
                str[i] = str[indexOfMin];
                str[indexOfMin] = temp;
            }
        }
    }

    public void selectionSortArrayList(ArrayList<Customer> customers) {
        for (int i = 0; i < customers.size()-1; i++) {
            int indexOfMin = i;
            for (int j = i+1; j < customers.size(); j++) {
                if (customers.get(j).compareTo(customers.get(indexOfMin)) > 0) {
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
    //public void selectionSort(int[] arr) {
    //// arr has a sorted part followed by an unsorted part
    //// i is the index of the first number in the unsorted part
    //for (int i = 0; i < arr.length - 1; i++) {
    //int indexOfMin = i;
    //for (int j = i + 1; j < arr.length; j++) {
    //if (arr[j] < arr[indexOfMin]) {
    //indexOfMin = j;
    //}
    //}
    //if (indexOfMin != i) {
    //int temp = arr[i];
    //arr[i] = arr[indexOfMin];
    //arr[indexOfMin] = temp;
    //}
    //}
    //}
}
