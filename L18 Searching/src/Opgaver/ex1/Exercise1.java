package Opgaver.ex1;

import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        int[] numbers = {12, 4, 8, 2, 7, 24, 11, 8, 10};


        boolean found = linearSearchArray(numbers);
        System.out.printf("Does the array contain uneven numbers?: %b \n", found);
        System.out.println();
    }

    public static boolean linearSearchArray(int[] arr) {
        boolean found = false;
        int i = 0;
        while (!found && i < arr.length) {
            int k = arr[i];
            if (k % 2 != 0)
                found = true;
            else
                i++;
        }
        return found;
    }
}
