package org.example;

import java.util.Random;

public class ejdados {
    public static void main(String[] args) {
        // Crear una instancia de Random
        Random random = new Random();

        // Generar dos números aleatorios entre 1 y 6
        int dado1 = random.nextInt(6) + 1; // Genera un número entre 1 y 6
        int dado2 = random.nextInt(6) + 1;

        // Calcular la suma total
        int sumaTotal = dado1 + dado2;

        // Mostrar los resultados
        System.out.println("Resultado del Dado 1: " + dado1);
        System.out.println("Resultado del Dado 2: " + dado2);
        System.out.println("Suma total: " + sumaTotal);
    }
}
