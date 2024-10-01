package org.example;

import java.util.Scanner;

public class Ejercicio_3 {
        public static void  Ejercicio3() {
            // Usamos scanner para solicitar el monbre de la persona y swu edad para posteriormente deducir si puede votar
            Scanner scanner = new Scanner(System.in);

            System.out.print("Introduce tu nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Hola " + nombre + ". Introduce tu edad: ");
            int edad = scanner.nextInt();

            if (edad >= 18) {
                System.out.println("Enhorabuena " + nombre + ". Puedes votar.");
            }
            else {
                System.out.println("Lo siento " + nombre + ". No puedes votar.");
            }

            scanner.close();
        }
}


