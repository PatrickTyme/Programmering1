package Opgave1;

public class Opg1b {
    public static void main(String[] args) {
        /* b) Lav en klasse med en main metode().
        Programmer i main() metoden en while-løkke, som summerer alle kvadrattal
        mellem 1 og 100.
        (Bemærk, at kvadratet skal være <= 100. Resultatet skal være 385.) */
        double sum = 0;
        int i = 0;
        while (Math.pow(i,2) <= 100) {
            sum += Math.pow(i,2);
            i++;
            System.out.println("The sum is: " + sum);
        }
    }
}
