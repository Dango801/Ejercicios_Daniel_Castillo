package org.example;

import java.util.Random;

public class ejcontra {
    public static void main(String[] args) {
        // Cadena de caracteres permitidos
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        // Longitud de la contraseña que queremos generar
        int longitudContrasena = 12; // Puedes cambiar la longitud aquí

        // Crear un StringBuilder para construir la contraseña
        StringBuilder contrasena = new StringBuilder();

        // Crear una instancia de Random
        Random random = new Random();

        // Generar la contraseña
        for (int i = 0; i < longitudContrasena; i++) {
            int indice = random.nextInt(caracteres.length()); // Elegir un índice aleatorio
            contrasena.append(caracteres.charAt(indice)); // Agregar el carácter correspondiente
        }

        // Mostrar la contraseña generada
        System.out.println("Contraseña generada: " + contrasena.toString());
    }
}
