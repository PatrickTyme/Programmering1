package Opgave1;
import java.util.Scanner;
public class Opg2b {
    public static void main(String[] args) {
        /* b) Lav en klasse med en main() metode.
        Tilføj til klassen en metode sumEvenInts(int a, int b), der returnerer summen af
        alle lige tal mellem a og b.
        (Resultatet af sumEvenInts(7, 24) er 144.)
        Kald metoden i main() metoden. Grænserne a og b skal indlæses fra
        tastaturet. */
        Scanner input = new Scanner(System.in);
        System.out.println("Input value A: ");
        int a = input.nextInt();
        System.out.println("Input value B: ");
        int b = input.nextInt();
        System.out.println(sumEvenInts(a, b));
    }

    public static int sumEvenInts(int a, int b) {
        int result = 0;
        int i = a;
        while (i <= b) {
            if (i % 2 == 0) {
                result += i;
            }
            i++;
        }
        return result;
    }
}
