package jedi2.IniciadoJedi;

import java.util.Scanner;

public class numeroParImpar {
    private static Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) {
            boolean i= true;
            while(i){
                try {
                    System.out.println("ingrese un numero: ");
                    int number = scanner.nextInt();
                    if (number % 2 == 0) {
                        System.out.println("es par");
                    } else System.out.println("es impar");

                }catch (Exception e) {
                    System.out.println("formato invalido");
                    i=false;
                }

            }
    }
}
