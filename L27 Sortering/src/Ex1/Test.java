package Ex1;

import java.util.ArrayList;
import java.util.Arrays;

import static Ex1.Test.bubbleSort;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("Hanne");
        str.add("Kurt");
        str.add("Mikael");
        str.add("Janus");

        bubbleSort(str);

        // Write a bubble sort method that can sort an ArrayList<String> containing strings.
        // Test your method in a test class with a main method
    }
    public static void bubbleSort(ArrayList<String> str) {
        String temp;
        for (int i = str.size()-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (str.get(j).compareTo(str.get(j + 1)) > 0) {
                    temp = str.get(j);
                    str.set(j, str.get(j + 1));
                    str.set(j + 1, temp);

                }
            }

        }
        System.out.println(str);
    }


//    public void bubbleSort(int[] arr) {
//        // arr has an unsorted part followed by a sorted part,
//        // i is the index of the last number in the unsorted part
//        for (int i = arr.length-1; i > 0; i--) {
//            // bubble the biggest number in the unsorted part up to index i
//            for (int j = 0; j < i; j++) {
//                if (arr[j] > arr[j+1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
            }


