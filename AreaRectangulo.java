package main;

import java.util.Scanner;

public class AreaRectangulo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double base, altura, area;

        System.out.print("Ingrese la base: ");
        base = sc.nextDouble();

        System.out.print("Ingrese la altura: ");
        altura = sc.nextDouble();

        area = base * altura;

        System.out.println("El área es: " + area);

        sc.close();
    }
}