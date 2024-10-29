package org.example;

import java.util.Random;
import java.util.Scanner;

public class ejrandomnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Solicitar el rango mínimo y máximo
        System.out.print("Ingrese el rango mínimo: ");
        int min = scanner.nextInt();

        System.out.print("Ingrese el rango máximo: ");
        int max = scanner.nextInt();

        // Validar que mínimo es menor que máximo
        while (min >= max) {
            System.out.println("El mínimo debe ser menor que el máximo. Intente de nuevo.");
            System.out.print("Ingrese el rango mínimo: ");
            min = scanner.nextInt();

            System.out.print("Ingrese el rango máximo: ");
            max = scanner.nextInt();
        }

        // Solicitar cuántos números aleatorios quiere
        System.out.print("¿Cuántos números aleatorios desea generar? ");
        int cantidad = scanner.nextInt();

        // Generar y mostrar los números aleatorios
        System.out.println("Números aleatorios generados:");
        for (int i = 0; i < cantidad; i++) {
            int numeroAleatorio = random.nextInt((max - min + 1)) + min; // Generar número aleatorio en el rango
            System.out.println(numeroAleatorio);
        }

        scanner.close(); // Cerrar el escáner
    }
}

