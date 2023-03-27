package Opgave1;

public class Opg1aforloop {
    public static void main(String[] args) {
        for (int i = 2, sum = 0; i <= 100;) {
            sum += i;
            i += 2;
            System.out.println("The sum is: " + sum);
        }

    }
}
