package Opgave1;
import java.util.Arrays;
public class ArrayTestv2 {
    public static void main(String[] args) {
        int[] a = {4,6,7,2,3};
        int[] b = {4,6,8,2,6};
        int[] sum = sumArrays(a, b);
        System.out.print("The sum of the array is: " + Arrays.toString(sum));
    }
    public static int[] sumArrays(int[] a, int[] b) {
        int maxLength = (a.length > b.length) ? a.length : b.length;
        int[] sum = new int[maxLength];
        for (int i = 0; i < maxLength; i++) {
            sum[i] += a[i] + b[i];
        }
        return sum;
    }
}
