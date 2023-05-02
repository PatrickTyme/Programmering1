package Opgaver.Ex2;

import java.util.Arrays;

public class Ex2Test {
    public static void main(String[] args) {
        int[] l1 = {2,4,6,8,10,12,14};
        int[] l2 = {1,2,4,5,6,9,12,17};

        sharedNumbers(l1, l2);
        System.out.print(Arrays.toString(sharedNumbers(l1, l2)));

    }
    /**
     * Return a sorted array containing all elements
     * shared by l1 and l2.
     * The returned array must have no empty entries.
     * Pre: l1 and l2 are sorted and have no empty entries.
     */
    public static int[] sharedNumbers (int[] l1, int[] l2) {
        int[] result = new int[l1.length + l2.length];
        int i1 = 0;
        int i2 = 0;
        int j = 0;
        while (i1 < l1.length && i2 < l2.length) {
            if (l1[i1] < l2[i2]) {
                i1++;
            } else if (l1[i1] > l2[i2]) {
                i2++;
            } else {
                result[j] = l1[i1];
                i1++;
                i2++;
                j++;
            }
        }
        return Arrays.copyOf(result, j);
    }
}