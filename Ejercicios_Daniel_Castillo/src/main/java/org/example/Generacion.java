package org.example;

import java.util.Scanner;
import java.time.LocalDateTime;

public class Generacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDateTime hoy = LocalDateTime.now();
        int anioActual = hoy.getYear();

        System.out.println("Selecciona el modo de ejecución:");
        System.out.println("1. Ingresar año de nacimiento");
        System.out.println("2. Ingresar edad");

        int modo = -1;
        if (scanner.hasNextInt()) {
            modo = scanner.nextInt();
        } else {
            System.out.println("Entrada inválida. Debe ser un número entero.");
            scanner.close();
            return;
        }

        switch (modo) {
            case 1:
                System.out.println("Introduce tu año de nacimiento (ej. 1990): ");
                String anioNacimientoStr = scanner.next();
                int anioNacimiento;

                try {
                    anioNacimiento = Integer.parseInt(anioNacimientoStr);
                    if (anioNacimiento < 1900 || anioNacimiento > anioActual) {
                        System.out.println("Año de nacimiento inválido. Debe estar entre 1900 y " + anioActual);
                    } else {
                        mostrarGeneracion(anioNacimiento);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Entrada no válida. Debe ser un número entero.");
                }
                break;

            case 2:
                System.out.println("Introduce tu edad (ej. 30): ");
                if (scanner.hasNextInt()) {
                    int edad = scanner.nextInt();
                    if (edad < 0) {
                        System.out.println("Edad inválida. Debe ser un número mayor o igual a 0.");
                    } else {
                        int anioNacimientoCalculado = anioActual - edad;
                        mostrarGeneracion(anioNacimientoCalculado);
                    }
                } else {
                    System.out.println("Entrada no válida. Debe ser un número entero.");
                }
                break;

            default:
                System.out.println("Opción no válida. Debe ser 1 o 2.");
                break;
        }

        scanner.close();
    }

    private static void mostrarGeneracion(int anioNacimiento) {
        if (anioNacimiento >= 1900 && anioNacimiento <= 1927) {
            System.out.println("Sin Generación bautizada.");
        } else if (anioNacimiento >= 1928 && anioNacimiento <= 1944) {
            System.out.println("Generación Silent.");
        } else if (anioNacimiento >= 1945 && anioNacimiento <= 1964) {
            System.out.println("Baby Boomers.");
        } else if (anioNacimiento >= 1965 && anioNacimiento <= 1981) {
            System.out.println("Generación X.");
        } else if (anioNacimiento >= 1982 && anioNacimiento <= 1994) {
            System.out.println("Generación Y o Millennials.");
        } else if (anioNacimiento >= 1995 && anioNacimiento <= 2009) {
            System.out.println("Generación Z o Centennials.");
        } else {
            System.out.println("Año de nacimiento fuera de rango.");
        }
    }
}
