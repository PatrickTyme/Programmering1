package Opgaver.Ex4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
            File out = new File("L28 Textfiles-Exceptions/src/Opgaver/Ex4/PosInput.txt");

            try (Scanner scanner = new Scanner(System.in);
                 PrintWriter writer = new PrintWriter(out)) {
                System.out.println("Indtast positive tal. (Afslut med -1)");
                boolean finished = false;
                while (!finished) {
                    try {
                        int i = scanner.nextInt();
                        if (i == -1) {
                            finished = true;
                        } else if (i != -1 && i < 0) {
                            System.out.println("The number is of incorrect value");
                            System.out.println();
                            scanner.nextLine();
                        } else {
                            System.out.println("Typed in: " + i);
                            System.out.println();
                            writer.println(i);
                        }
                    } catch (InputMismatchException ex) {
                        System.out.println("The number is of incorrect value");
                        System.out.println();
                        scanner.nextLine();
                    }
                }
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            }

            System.out.println("End of program ");

        }
}
