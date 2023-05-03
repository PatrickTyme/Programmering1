package Opgaver.Ex5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileUtilTest {
    public static void main(String[] args) {
        FileUtil f1 = new FileUtil();
        FileUtil f2 = new FileUtil();

        String file1 = "L28 Textfiles-Exceptions/src/Opgaver/Ex5/Tital.txt";
        String file2 = "L28 Textfiles-Exceptions/src/Opgaver/Ex5/MangeTal.txt";

        System.out.println(f1.max(file1));
        System.out.println(f1.min(file1));
        try {
            System.out.println(f1.gennemsnit(file1));
        } catch (IOException io) {
            System.err.println(io);
        }

        System.out.println(f2.max(file2));
        System.out.println(f2.min(file2));
        try {
            System.out.println(f2.gennemsnit(file2));
        } catch (IOException io) {
            System.err.println(io);
        }

    }
}
