package jedi2.IniciadoJedi;

import java.util.Scanner;

public class typeOfNumber {
    static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("pick a number: ");
        int i= scanner.nextInt();
        if (i >0) System.out.println("es positivo");
        else if (i < 0) System.out.println("numero negativo");
        else System.out.println("the number is 0");


    }
}
