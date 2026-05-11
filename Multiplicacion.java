package main;

import java.util.Scanner;

public class Multiplicacion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2, resultado;

        System.out.print("Ingrese un número: ");
        num1 = sc.nextInt();

        System.out.print("Ingrese otro número: ");
        num2 = sc.nextInt();

        resultado = num1 * num2;

        System.out.println("Resultado: " + resultado);
        
        sc.close();
    }
}