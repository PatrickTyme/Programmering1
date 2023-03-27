package Opgave1;

import java.util.Arrays;
public class Opg1Ex1 {
    public static void main(String[] args) {
        // A
        int[] a = new int[10];
        System.out.println("a: " + Arrays.toString(a));

        // B
        int[] b = {2, 44, -23, 99, 8, -5, 7, 10, 20, 30};
        System.out.println("b: " + Arrays.toString(b));

        // C
        int[] c = new int[10];
        for (int i = 0; i < 10; i++)
         c[i] = i;
        System.out.println("c: " + Arrays.toString(c));

        // D
        int[] d = new int[10];
        for (int i = 0; i < 10; i++)
            d[i] = 2 * i + 2;
        System.out.println("d: " + Arrays.toString(d));

        // E
        int[] e = new int[10];
        for (int i = 0; i < 10; i++)
            e[i] = (i + 1) * (i + 1);
        System.out.println("e: " + Arrays.toString(e));

        // F
        int[] f = new int[10];
        for (int i = 0; i < 10; i++)
            f[i] = (i % 2);
        System.out.println("f: " + Arrays.toString(f));

        // G
        int[] g = new int[10];
        for (int i = 0; i < 10; i++)
            g[i] = i % 5;
        System.out.println("g: " + Arrays.toString(g));

        // H
        int[] h = new int[10];
        for (int i = 0; i < 10; i++)
            h[i] = i * 2 + i % 2;
        System.out.println("h: " + Arrays.toString(h));

    }
}
