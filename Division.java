package main;

import java.util.Scanner;

public class Division {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1, num2, division;

        System.out.print("Ingrese el primer número: ");
        num1 = sc.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        num2 = sc.nextDouble();

        division = num1 / num2;

        System.out.println("La división es: " + division);

        sc.close();
    }
}
