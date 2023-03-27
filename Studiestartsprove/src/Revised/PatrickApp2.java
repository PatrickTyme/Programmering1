package Revised;

import java.util.Scanner;

public class PatrickApp2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Indtast navn: ");
            String name = input.nextLine();
            System.out.println("Indtast løn: ");
            int løn = input.nextInt();
            System.out.println("Indtast alder: ");
            int age = input.nextInt();

            System.out.println(name + " din nye løn er: " + lønStigning(age, løn));
        }
        
        public static double lønStigning(int age, double løn) {
            double newLøn = 0;
            if (age >= 50) {
                newLøn = løn * 1.1;
            } else if (age < 35) {
                newLøn = løn * 1.05;
            } else {
                newLøn = løn * 1.08;
            }

            return newLøn;
        }
    }

