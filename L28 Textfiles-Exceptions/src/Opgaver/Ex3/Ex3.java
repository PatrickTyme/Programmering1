package Opgaver.Ex3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        File out = new File("L28 Textfiles-Exceptions/src/Opgaver/Ex3/PosOutput.txt");
        boolean nextNumber = true;
        try (PrintWriter writer = new PrintWriter(out)){
            while (nextNumber) {
                for (int i = 0; i <= 100; i++) {
                    if (i % 2 == 1) {
                        writer.println(i);
                        System.out.println(i);
                    } if (i == 100) {
                        nextNumber = false;
                    }
                }
            }
        } catch (FileNotFoundException ex) {

        }
    }
}


