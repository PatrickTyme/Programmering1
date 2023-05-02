package Demo;

import java.util.ArrayList;

public class TestArrayListGenerelFlet {
    /**
     * Returnerer en sorteret ArrayList, der kun indeholder
     * de elementer, der findes både i s1 og s2.
     * Pre: s1 og s2 er sorterede.
     */
    public ArrayList<Integer> intersection(
            ArrayList<Integer> s1, ArrayList<Integer> s2) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int i1 = 0;
        int i2 = 0;
        while (i1 < s1.size() && i2 < s2.size()) {
            if (s1.get(i1) < s2.get(i2)) {
                i1++;
            } else if (s1.get(i1) > s2.get(i2)) {
                i2++;
            } else {
                result.add(s1.get(i1));
                i1++;
                i2++;
            }
        }
        return result;
    }
}
