package jedi2.CaballeroJedi;

import java.util.Arrays;

public class threeArreglos {
    public static void main(String[] args) {

        int [] a1= {1,23,3,4,5,6,7,8};
        int [] a2= {9,10,11,12,13,14};
        int [] a3= new int[a1.length/2+a2.length/2];
        int index=0;
        for(int i : a1) {
            if (index <=a2.length/2) {
                a3[index] = i;
                index++;
            }
        }
        for(int i : a2) {
            if (index <a3.length) {
                a3[index] = i;
                index++;
            }
        }

        System.out.println(Arrays.toString(a3));


    }
}
