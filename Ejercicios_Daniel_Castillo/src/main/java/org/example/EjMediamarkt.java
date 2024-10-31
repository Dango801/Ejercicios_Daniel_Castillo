package org.example;

import java.util.Scanner;

public class EjMediamarkt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número de meses de financiación: ");
        int meses = scanner.nextInt();

        int pagoMensual = 10;
        int totalAPagar = 0;

        for (int i = 1; i <= meses; i++) {
            System.out.println("Mes " + i + ": " + pagoMensual + "€");
            totalAPagar += pagoMensual;
            pagoMensual *= 2; // Duplicamos el pago cada mes
        }

        System.out.println("Total a pagar: " + totalAPagar + "€");

        scanner.close();
    }
}

