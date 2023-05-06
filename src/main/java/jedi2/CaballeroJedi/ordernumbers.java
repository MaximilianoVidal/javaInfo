package jedi2.CaballeroJedi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ordernumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Float> numbers = new ArrayList<>();
        System.out.println("ingrese un numero o la x para salir: ");
        while (scanner.hasNextFloat()){
            Float num= scanner.nextFloat();
            numbers.add(num);

        }
        for(float e: numbers) {
            System.out.println(e);
        }
        Collections.sort(numbers);
        numbers.forEach(System.out::println);


        }

    }

