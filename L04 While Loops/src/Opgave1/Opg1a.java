package Opgave1;

public class Opg1a {
    public static void main(String[] args) {
        /* a) Lav en klasse med en main() metode.
        Programmer i main() metoden en while-løkke, som summerer alle lige tal
        mellem 2 og 100 (begge inklusive).
        (Resultatet skal være 2550.) */
        int i = 2;
        int sum = 0;
        while (i <= 100) {
            sum += i;
            i += 2;
        }
        System.out.println("The sum is: " + sum);
    }
}
