package Demo;

public class TestArrayTilArray {
    /**
     * Returnerer et sorteret array, der indeholder
     * alle elementer fra s1 og s2.
     * Pre: s1 og s2 er sorterede.
     */
    public int[] flet(int[] s1, int[] s2) {
        int[] result = new int[s1.length + s2.length];
        // flet sålænge der er noget i begge arrays
        int i1 = 0;
        int i2 = 0;
        int j = 0;
        while (i1 < s1.length && i2 < s2.length) {
            if (s1[i1] < s2[i2]) {
                // s1's tal er mindst
                result[j] = s1[i1];
                i1++;
                j++;
            } else {
                // s2's første tal er mindst
                result[j] = s2[i2];
                i2++;
                j++;
            }
        }
        // tøm det array der ikke er tomt
        while (i1 < s1.length) {
            result[j] = s1[i1];
            i1++;
            j++;
        }
        while (i2 < s2.length) {
            result[j] = s2[i2];
            i2++;
            j++;
        }
        return result;
    }
}
