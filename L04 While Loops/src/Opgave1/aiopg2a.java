package Opgave1;

public class aiopg2a {
    public static void main(String[] args) {

        printPowersOfTwo();
            }

            public static void printPowersOfTwo() {
                int result = 1;
                int i = 0;
                while (i < 20) {
                    result *= 2;
                    i++;
                    System.out.println(result + " " + i);
                }
            }
        }

