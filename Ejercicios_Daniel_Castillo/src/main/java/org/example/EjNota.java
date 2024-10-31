package org.example;

import java.util.Scanner;

public class EjNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una nota numérica (0-10): ");
        int nota = scanner.nextInt();

        String resultado;

        switch (nota) {
            case 0, 1, 2, 3, 4:
                resultado = "INSUFICIENTE";
                break;
            case 5:
                resultado = "SUFICIENTE";
                break;
            case 6:
                resultado = "BIEN";
                break;
            case 7, 8:
                resultado = "NOTABLE";
                break;
            case 9, 10:
                resultado = "SOBRESALIENTE";
                break;
            default:
                resultado = "No válido";
                break;
        }

        System.out.println("Equivalencia cualitativa: " + resultado);

        scanner.close();
    }
}

