package main;

import java.util.Scanner;

public class Promedio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double c1, c2, c3, promedio;

        System.out.print("Ingrese la primera calificación: ");
        c1 = sc.nextDouble();

        System.out.print("Ingrese la segunda calificación: ");
        c2 = sc.nextDouble();

        System.out.print("Ingrese la tercera calificación: ");
        c3 = sc.nextDouble();

        promedio = (c1 + c2 + c3) / 3;

        System.out.println("El promedio es: " + promedio);

        sc.close();
    }
}