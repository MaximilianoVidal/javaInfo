package jedi2.MaestriJedi;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class palindromo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese una palabra: \n");
        String palabra = scanner.nextLine();

        char[] wordToArray = palabra.toCharArray();

        List<Character> word1 = new ArrayList<>();
        for (char letter : wordToArray) {
            word1.add(letter);
        }
        List<Character> words2 = new ArrayList<>(word1);
        Collections.reverse(words2);

        boolean equals= word1.equals(words2);
        System.out.println("es un palindromo? "+equals);
    }

}

