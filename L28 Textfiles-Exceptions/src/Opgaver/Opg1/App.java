package Opgaver.Opg1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        try {
            Scanner scanner = new Scanner(System.in);
            int index = -1;
            while (index < 0 || index > 9) {
                    System.out.println("Type in an index (0..9): ");
                    index = scanner.nextInt();
                if (index > 9 || index < 0) {
                    System.out.println("Index out of bounds. Enter an index between 0 & 9");
                } else {
                    System.out.printf("Prime at index %d is %d", index, primes[index]);
                }
            }
        } catch (InputMismatchException ex) {
            System.out.println("Input was not an integer");
        }
    }
}