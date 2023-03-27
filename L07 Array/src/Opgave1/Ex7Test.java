package Opgave1;
import java.util.Arrays;
public class Ex7Test {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(numbers));
        switchFirstAndLast(numbers);
        System.out.println("Swapped Array: " + Arrays.toString(numbers));
        replaceEvenWithZero(numbers);
        System.out.println("Modified Array: " + Arrays.toString(numbers));
    }

    public static void switchFirstAndLast(int[] numbers) {
        if (numbers.length < 2) {
            return;
        }
        int tempNumber = numbers[0];
        numbers[0] = numbers[numbers.length - 1];
        numbers[numbers.length - 1] = tempNumber;
    }
    public static void replaceEvenWithZero(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                numbers[i] = 0;
            }
        }
    }
}

