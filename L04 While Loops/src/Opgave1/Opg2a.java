package Opgave1;

public class Opg2a {
    public static void main(String[] args) {
        /* a) Lav en klasse med en main() metode.
        Tilføj til klassen en metode printPowersOfTwo(), der udskriver alle potenser af
        2 fra 2*0 til 2*20.
        (Bemærk, at metodens returtype er void, de den ikke returnerer noget.)
        Kald metoden i main() metoden.
        OBS: Metoden må ikke bruge Math.pow(a,b).  */

    }
    public static void printPowersOfTwo() {
        int result = 1;
        int i = 0;
        while (i <= 20) {
            result *= 2;
            i++;
        }
    }
}
