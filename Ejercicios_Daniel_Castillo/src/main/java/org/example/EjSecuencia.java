package org.example;

import java.util.Scanner;

public class EjSecuencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // Solicitar al usuario un número válido
        do {
            System.out.print("Introduce un número entero positivo para ver la secuencia de Fibonacci: ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Número inválido. Debes introducir un número entero positivo.");
            }
        } while (n <= 0);

        System.out.print("Secuencia de Números: ");

        // Variables para los dos primeros términos de la secuencia
        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            // Calcular el siguiente número en la secuencia
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }

        scanner.close();
    }
}
