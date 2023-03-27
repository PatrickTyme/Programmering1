package Opgave1;
import java.util.Scanner;

public class Exercise5 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[] numbers = new int[10];
            int evenCount = 0;
            int oddCount = 0;

            System.out.println("Enter ten numbers: ");
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = input.nextInt();

                if (numbers[i] % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }

            System.out.println("Number of even numbers: " + evenCount);
            System.out.println("Number of odd numbers: " + oddCount);
        }
    }
