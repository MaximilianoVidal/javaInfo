package calculator;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class App {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //calculate();
        //myname();
        //divisor();
        triangle();
        //twoWords();
    }

    public static void calculate() {
        System.out.println("ingrese un numero...");

        int number1 = scanner.nextInt();
        System.out.println("ingrese otro numero...");
        int number2 = scanner.nextInt();
        int result = number1 + number2;
        if (result % 2 == 0) System.out.println("el resultado es" + result + "par");
        else System.out.println("el resultado" + result + " es impar");
    }

    public static void myname() {
        List<String> name = Arrays.asList("m", "a", "x", "i", " ", "v", "i", "d", "a", "l");
        name.forEach(System.out::print);
    }

    public static void divisor() {
        System.out.println("Ingrese dos números:");
        int number1 = scanner.nextInt(), number2 = scanner.nextInt();
        System.out.println(number1 + number2);
        if (number1 % number2 == 0) System.out.println("es divisible");
        else System.out.println("no es divisible");
    }

    public static void triangle() {
        int n = 5;
        IntStream.range(0, n).forEach(i -> {
            IntStream.range(0, n - i -1).forEach(j -> System.out.print(" "));
            IntStream.range(0, i).forEach(j -> System.out.print("* "));
            System.out.println();
        });
    }

    public static void twoWords() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de su mascota y despues el de la ultima pelicula que vio:");
        String mascota = scanner.next();
        String pelicula = scanner.next();

        System.out.println("nombre de la proxima bebida: " + (mascota) + (pelicula));

       /* Set<String> palabras = new HashSet<>(List.of(scanner.next(), scanner.next()));
        System.out.println("Las palabras ingresadas son:");
        sout("la proxima bebida\n");
        palabras.forEach(System.out::println)
        */
    }
}


