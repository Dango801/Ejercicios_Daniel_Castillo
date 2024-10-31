package org.example;

import java.util.Scanner;

public class EjEdadesAlturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número de alumnos (N): ");
        int n = scanner.nextInt();

        int sumaEdades = 0;
        int sumaAlturas = 0;
        int mayoresDe18 = 0;
        int masDe175cm = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Introduce la edad del alumno " + i + ": ");
            int edad = scanner.nextInt();
            System.out.print("Introduce la altura del alumno " + i + " (en cm): ");
            int altura = scanner.nextInt();

            // Acumular las edades y alturas
            sumaEdades += edad;
            sumaAlturas += altura;

            // Contar mayores de 18 años
            if (edad > 18) {
                mayoresDe18++;
            }

            // Contar alumnos que miden más de 175 cm
            if (altura > 175) {
                masDe175cm++;
            }
        }

        // Calcular edad y altura media
        double edadMedia = (double) sumaEdades / n;
        double alturaMedia = (double) sumaAlturas / n;

        System.out.println("Edad media de los alumnos: " + edadMedia);
        System.out.println("Altura media de los alumnos: " + alturaMedia + " cm");
        System.out.println("Cantidad de alumnos mayores de 18 años: " + mayoresDe18);
        System.out.println("Cantidad de alumnos que miden más de 175 cm: " + masDe175cm);

        scanner.close();
    }
}

