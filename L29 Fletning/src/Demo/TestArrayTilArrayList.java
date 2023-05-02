package Demo;

import java.util.ArrayList;

public class TestArrayTilArrayList {
    /**
     * Returnerer en sorteret ArrayList, der indeholder
     * alle elementer fra s1 og s2.
     * Pre: s1 og s2 er sorterede.
     */
    public ArrayList<Integer> flet(int[] s1, int[] s2) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        // flet sålænge der er noget i begge arrays
        int i1 = 0;
        int i2 = 0;
        while (i1 < s1.length && i2 < s2.length) {
            if (s1[i1] < s2[i2]) {
                // s1's tal er mindst
                result.add(s1[i1]);
                i1++;
            } else {
                // s2's tal er mindst
                result.add(s2[i2]);
                i2++;
            }
        }
        // tøm det array der ikke er tomt
        while (i1 < s1.length) {
            result.add(s1[i1]);
            i1++;
        }
        while (i2 < s2.length) {
            result.add(s2[i2]);
            i2++;
        }
        return result;
    }
}
