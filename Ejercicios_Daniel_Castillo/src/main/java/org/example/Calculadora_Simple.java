package org.example;

import java.util.Scanner;

public class Calculadora_Simple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bienvenida al usuario
        System.out.println("¡Bienvenido a la calculadora simple!");

        try {
            // Pedir el primer operando
            System.out.print("Introduce el primer operando (int): ");
            int operando1 = Integer.parseInt(scanner.nextLine());

            // Pedir el signo de la operación
            System.out.print("Introduce el signo de la operación (+, -, /, x, R): ");
            String operacion = scanner.nextLine();

            // Inicializar el segundo operando
            int operando2 = 0;
            if (!operacion.equals("R")) {
                System.out.print("Introduce el segundo operando (int): ");
                operando2 = Integer.parseInt(scanner.nextLine());
            }

            // Variable para el resultado
            double resultado = 0;

            // Realizar la operación
            switch (operacion) {
                case "+":
                    resultado = operando1 + operando2;
                    break;
                case "-":
                    resultado = operando1 - operando2;
                    break;
                case "x":
                    resultado = operando1 * operando2;
                    break;
                case "/":
                    if (operando2 != 0) {
                        resultado = (double) operando1 / operando2;
                    } else {
                        System.out.println("Error: No se puede dividir entre cero.");
                        return;
                    }
                    break;
                case "R":
                    if (operando1 < 0) {
                        System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
                        return;
                    }
                    resultado = Math.sqrt(operando1);
                    break;
                default:
                    System.out.println("Error: Operación no válida.");
                    return;
            }

            // Mostrar el resultado
            System.out.println("El resultado es: " + resultado);
        } catch (NumberFormatException e) {
            System.out.println("Error: Entrada no válida. Por favor, introduce un número entero.");
        } finally {
            scanner.close();
        }
    }
}
