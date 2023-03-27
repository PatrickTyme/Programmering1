package Opgave1;

public class ArrayTestv3 {
    public static void main(String[] args) {
        int[] t = {4,6,7,2,3};
        //int[] t = {4,6,8,2,6};
        boolean ulige = hasUneven(t);
        System.out.print(ulige);
    }
    public static boolean hasUneven(int[] t) {
        for (int i = 0; i < t.length; i++) {
            if (t[i] % 2 != 0) {
                return true;
            }
        }
        return false;
    }
}
