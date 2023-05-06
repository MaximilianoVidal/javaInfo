package jedi2.IniciadoJedi;

import java.util.ArrayList;
import java.util.Scanner;

public class amigosName {
    static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("amigosName");
        ArrayList <String> list = new ArrayList<>();
        System.out.println("ingrese la cantidad de amigos ");
        int amountOfFriends = scanner.nextInt();

        for(int i=0; i<=amountOfFriends; i++){
            System.out.println("ingrese el nombre de su amigo");
            String amigo = scanner.nextLine();
            list.add(amigo);
        }
        list.forEach(System.out::println);

    }

}
