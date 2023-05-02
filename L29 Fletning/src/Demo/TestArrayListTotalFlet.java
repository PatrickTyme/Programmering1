package Demo;

import java.util.ArrayList;

public class TestArrayListTotalFlet {

    /**
     * Returnerer en sorteret ArrayList, der indeholder
     * alle elementer fra s1 og s2.
     * Pre: s1 og s2 er sorterede.
     */
    public static ArrayList<Integer> flet(ArrayList<Integer> s1, ArrayList<Integer> s2) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        // flet sålænge der er noget i begge lister
        int i1 = 0;
        int i2 = 0;
        while (i1 < s1.size() && i2 < s2.size()) {
            if (s1.get(i1) <= s2.get(i2)) {
                // s1's tal er mindst
                result.add(s1.get(i1));
                i1++;
            } else {
                // s2's tal er mindst
                result.add(s2.get(i2));
                i2++;
            }
        }
        // tøm den liste der ikke er tom
        while (i1 < s1.size()) {
            result.add(s1.get(i1));
            i1++;
        }
        while (i2 < s2.size()) {
            result.add(s2.get(i2));
            i2++;
        }
        return result;
    }

}
