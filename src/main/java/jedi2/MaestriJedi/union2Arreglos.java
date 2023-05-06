package jedi2.MaestriJedi;

import java.util.Arrays;

public class union2Arreglos {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5, 6, 7, 8, 9}, a2 = {10, 11, 12, 13, 14, 15};
        int[] a3 = new int[a1.length + a2.length];
        int position = 0;

        for(int e: a1) {
            a3[position] = e;
            position++;
        }
        for(int e: a2) {
            a3[position] = e;
            position++;
        }
        System.out.println(Arrays.toString(a3));

    }
}