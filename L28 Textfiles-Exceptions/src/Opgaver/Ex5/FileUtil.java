package Opgaver.Ex5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileUtil {
    public int max(String filename) {
        File f = new File(filename);
        int highest = 0;
        try {
            Scanner scan = new Scanner(f);
            while (scan.hasNextInt()) {
                try {
                    int number = scan.nextInt();
                    if (highest < number) {
                        highest = number;
                    }
                } catch (InputMismatchException e) {
                    scan.nextLine();
                    System.out.println("Not an integer");
                }
            }

        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
        if (highest == 0) {
            throw new RuntimeException("Det lort");
        }
        return highest;
    }

    public int min(String filename) {
        File f = new File(filename);
        int lowest = max(filename);
        try {
            Scanner scan = new Scanner(f);
            while (scan.hasNextInt()) {
                try {
                    int number = scan.nextInt();
                    if (lowest > number) {
                        lowest = number;
                    }
                } catch (InputMismatchException e) {
                    scan.nextLine();
                    System.out.println("Not an integer");
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
        return lowest;
    }

    public double gennemsnit(String filename) throws IOException {
        File f = new File(filename); //IO exception er input output exception og bliver kun kastet hvis der er noget.
        double medium = 0;
        int count = 0;
        try {
            Scanner scan = new Scanner(f);
            {
                while (scan.hasNextInt()) {
                    try {
                        int number = scan.nextInt();
                        medium += number;
                        count++;
                    } catch (InputMismatchException e) {
                        scan.nextLine();
                        System.out.println("Not an integer");
                    }
                }
            }

        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
        return medium / count;
    }
}

