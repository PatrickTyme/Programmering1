package Opgave1;

public class ArrayTest {

    public static void main(String[] args) {
        int[] t = {4,6,7,2,3};
        System.out.print("The sum of the array is: " + sum(t));
    }
    public static int sum(int[] t) {
        int sum = 0;
        for (int i = 0; i < t.length; i++) {
            sum += t[i];

        }
        return sum;
    }
}
