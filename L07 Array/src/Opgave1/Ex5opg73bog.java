package Opgave1;
import java.util.Scanner;
public class Ex5opg73bog {

        public static void main(String[] args) {
            int[] count = new int[50]; // Initialize an array to store the counts of integers (from 0 to 50)
            Scanner input = new Scanner(System.in);
            int number = -1;

            while (number != 0) {
                System.out.print("Enter an integer between 1 and 50 (0 to stop): ");
                number = input.nextInt();
                if (number >= 1 && number < 50) {
                    count[number]++;
                } else if (number != 0) {
                    System.out.println("Invalid input!");
                }
            }

            System.out.println("Occurrence of each integer between 1 and 50:");
            for (int i = 1; i < 50; i++) {
                if (count[i] == 1) {
                    System.out.printf("%d occurs 1 time\n", i);
                } else if (count[i] > 1) {
                    System.out.printf("%d occurs %d times\n", i, count[i]);
                }
            }
        }
    }

