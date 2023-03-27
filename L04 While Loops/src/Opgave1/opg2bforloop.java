package Opgave1;
import java.util.Scanner;
public class opg2bforloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input value A: ");
        int a = input.nextInt();
        System.out.println("Input value B: ");
        int b = input.nextInt();
        System.out.println(sumEvenInts(a, b));
    }

    public static int sumEvenInts(int a, int b) {
        int result = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                result += i;
            }
        }
        return result;
    }
}
