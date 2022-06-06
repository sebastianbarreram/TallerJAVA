package com.sofkau.ejercicio12;

import java.util.Scanner;

import com.sofkau.ownlogger.OwnLogger;

/**
 * Esta clase es la solución al ejercicio 12 de java
 * 
 * @author Sebastian Barrera Marín
 * @version 1.0.0 04/06/2022
 */
public class Main {
    public static final OwnLogger consola = new OwnLogger();

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            consola.printInfo("Ingrese la primer palabra: ");
            String palabra1 = scanner.nextLine();
            consola.printInfo("Ingrese la segunda palabra: ");
            String palabra2 = scanner.nextLine();
            compararPalabras(palabra1, palabra2);
            compararPalabras(palabra2, palabra1);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Esta funcion busca cada letra de la palabra1 en la palabra y muestra si hay
     * diferencias
     * 
     * @param palabra1 palabra cuyas letras seran buscadas en palabra2
     * @param palabra2 palabra en donde se buscaran las letras de la palabra1
     */
    public static void compararPalabras(String palabra1, String palabra2) {
        StringBuilder diferenciasSB = new StringBuilder();
        String diferencias = "";
        int cuentaLetraIgual;
        for (int i = 0; i < palabra1.length(); i++) {
            cuentaLetraIgual = 0;
            for (int j = 0; j < palabra2.length(); j++) {
                if (palabra1.charAt(i) == palabra2.charAt(j)) {
                    cuentaLetraIgual++;
                }
            }
            if (cuentaLetraIgual == 0) {
                diferenciasSB.append(palabra1.charAt(i));
            }
            diferencias = diferenciasSB.toString();
        }
        if (palabra1.equals(palabra2)) {
            consola.printInfo("Las palabras son iguales");
        } else if (diferencias.equals("")) {
            consola.printInfo("Las letras de la palabra \"" + palabra1 + "\" estan en la palabra \""
                    + palabra2 + "\" pero en desorden");
        } else {
            consola.printInfo("Las letras que estan en la palabra \"" + palabra1 +
                    "\" pero no estan en la palabra \"" + palabra2 + "\" son: " + diferencias);

        }
    }

}
