package Opgaver.Ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        ArrayList<Integer> tal = new ArrayList<>();
        String fileName = "L28 Textfiles-Exceptions/src/Opgaver/Ex1/Ex1text.txt";
        File in = new File(fileName);
        try (Scanner scanner = new Scanner(in)) {
            while (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                tal.add(i);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found!");
            e.printStackTrace();
        }
        Collections.reverse(tal);
        for (int num : tal) {
            System.out.print(num + " ");
        }

    }
}
