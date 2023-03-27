package Opgave1;
import java.util.Scanner;

public class Opg1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count;
        System.out.println("How many inputs do you want to make? ");
        count = input.nextInt();
        System.out.println("Input numbers between 1 & 99");
        int max = 0, min = 100, even = 0, odd = 0;
        for (int number = 1,  i = 0; i < count; i++) {
            number = input.nextInt();
            if (number > max) {
                max = number;
            }
            if (number < min && number != 0) {
                min = number;
            }
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }

        }
        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
        System.out.println("Amount of even numbers: " + even);
        System.out.println("Amount of odd numbers: " + odd);


    }

    }

