package Opgave4;

import java.util.ArrayList;
import java.util.Collections;

public class Ex4Test {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        }
    // A method that switches the first and last element in the ArrayList (assume size >= 1)
    public void swapFirstLastElements(ArrayList<Integer> list) {
        int temp = list.get(0);
        list.set(0, list.get(list.size() - 1));
        list.set(list.size() - 1, temp);
    }
    public void replaceAllEvenWithZero() {

    }


}
