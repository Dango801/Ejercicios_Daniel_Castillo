package org.example;

import java.util.Scanner;

public class Ejpotencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la base (número real, puede ser positivo o negativo): ");
        double base = scanner.nextDouble();

        System.out.print("Introduce el exponente (entero positivo): ");
        int exponente = scanner.nextInt();

        if (exponente < 0) {
            System.out.println("El exponente debe ser un número entero positivo.");
        } else {
            double resultado = 1;

            for (int i = 0; i < exponente; i++) {
                resultado *= base;
            }

            System.out.println("El resultado de " + base + " elevado a la " + exponente + " es: " + resultado);
        }

        scanner.close();
    }
}
