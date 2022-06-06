package com.sofkau.ejercicio11;

import java.util.Scanner;

import com.sofkau.ownlogger.OwnLogger;

/**
 * Esta clase es la solución al ejercicio 11 de java
 * 
 * @author Sebastian Barrera Marín
 * @version 1.0.0 04/06/2022
 */
public class Main {
    public static final OwnLogger consola = new OwnLogger();

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            consola.printInfo("Ingrese una frase: ");
            String frase = scanner.nextLine();
            consola.printInfo("La longitud de la frase es: " + frase.length());
            contarString(frase, 'a');
            contarString(frase, 'e');
            contarString(frase, 'i');
            contarString(frase, 'o');
            contarString(frase, 'u');

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Esta funcion cuenta cuantas veces aparece el caracter letra en una frase
     * 
     * @param frase frase de la que se desea contar algun caracter
     * @param letra caracter que se desea saber cuantas veces aparece en al frase
     */
    public static void contarString(String frase, char letra) {
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == (letra)) {
                contador++;
            }
        }
        consola.printInfo(
                "el caracter \"" + letra + "\" se encuentra en la frase \" " + frase +
                        "\" " + contador + " veces");
    }

}
