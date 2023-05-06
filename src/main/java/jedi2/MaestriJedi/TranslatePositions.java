package jedi2.MaestriJedi;

import java.util.Arrays;
import java.util.Scanner;

public class TranslatePositions {
    static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args){

        int[] numbers= new int[10];

        System.out.println ("input index: ");
        int index = scanner.nextInt();

        System.out.println("input the value to replace");
        int value = scanner.nextInt();

        numbers[index] = value;

        System.out.println("the number of characters to change is: ");
        int expectedIndex = scanner.nextInt();
        boolean inRange = index + expectedIndex <= numbers.length;
        if (inRange) {
            for (int i = index; i < numbers.length; i++) {
                numbers[i] = value;

            }
        }else System.out.println("expected index is out of range");

    System.out.println(Arrays.toString(numbers));
    }
}



