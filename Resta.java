package main;

import java.util.Scanner;

public class Resta {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2, resta;

        System.out.print("Ingrese el primer número: ");
        num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        num2 = sc.nextInt();

        resta = num1 - num2;

        System.out.println("La resta es: " + resta);
   
    sc.close(); 
    }
}
