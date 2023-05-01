package Opgaver.Ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        String fileName = "L28 Textfiles-Exceptions/src/Opgaver/Ex1/Ex1text.txt";
        File in = new File(fileName);
        try (Scanner scanner = new Scanner(in)) {
            int sum = 0;
            while (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println(i * 2);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }
    }
    }

