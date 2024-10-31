package org.example;

import java.util.Scanner;

public class EjSueldos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sueldoMaximo = 0;
        int sueldosMayorMil = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Introduce el sueldo " + i + ": ");
            double sueldo = scanner.nextDouble();

            // Comprobar si el sueldo es mayor que el sueldo máximo registrado
            if (sueldo > sueldoMaximo) {
                sueldoMaximo = sueldo;
            }

            // Contar sueldos mayores a 1.000€
            if (sueldo > 1000) {
                sueldosMayorMil++;
            }
        }

        System.out.println("El sueldo más alto es: " + sueldoMaximo + "€");
        System.out.println("Cantidad de sueldos mayores a 1.000€: " + sueldosMayorMil);

        scanner.close();
    }
}

