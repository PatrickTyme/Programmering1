package Opgave1;

public class opg2aforloop {
    public static void main(String[] args) {

        printPowersOfTwo();
    }

    public static void printPowersOfTwo() {
        for (int result = 1, i = 0; i <= 20; result *= 2, i++) {

            System.out.println(result + " " + i);
        }
    }
}