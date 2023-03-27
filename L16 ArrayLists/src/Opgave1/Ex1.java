package Opgave1;

import java.util.ArrayList;

public class Ex1 {
    public static void main(String[] args) {
        // 1) Make an arraylist of type string
        ArrayList<String> names = new ArrayList<>();
        // 2) add names
        names.add("Hans");
        names.add("Viggo");
        names.add("Jens");
        names.add("Bente");
        names.add("Bent");
        // 3) print the size of the list
        System.out.println("3)");
        System.out.println(names.size());
        // 4) Add Jane to index 2
        System.out.println("4)");
        names.add(2, "Jane");
        // 5) Print elements in the list
        System.out.println("5)");
        System.out.println(names);
        // 6) Remove element at index 1
        names.remove(1);
        // 7) add Pia to the front of the list
        names.add(0, "Pia");
        // 8) add Ib to the rear of the list
        names.add("Ib");
        // 9) Print the size of the list
        System.out.println("9)");
        System.out.println(names.size());
        // 10) Replace the element of index 2 with Hansi
        names.add(2, "Hansi");
        // 11) print the size
        System.out.println("11)");
        System.out.println(names.size());
        // 12) print the elements
        System.out.println("12)");
        System.out.println(names);
        // 13) traverse the list with a for statement and print the length of each element
        System.out.println("13)");
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            System.out.println(i + ": " + name + " " + name.length());
        }
        // 14) traverse with a for-each statement and print the length of each element
        System.out.println("14)");
        for (String name : names) {
            System.out.println(name + " " + name.length());
        }
        System.out.println();



    }
}
