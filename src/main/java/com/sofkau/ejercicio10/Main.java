package com.sofkau.ejercicio10;

import java.util.Scanner;

import com.sofkau.ownlogger.OwnLogger;

/**
 * Esta clase es la solución al ejercicio 10 de java
 * 
 * @author Sebastian Barrera Marín
 * @version 1.0.0 04/06/2022
 */
public class Main {
    public static final OwnLogger consola = new OwnLogger();

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            consola.printInfo("Ingrese una frase adicional: ");
            String frase = scanner.nextLine();
            consola.printInfo(frase);
            cambiarLetra(frase, " ", "");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * Esta funcion cambia la letra1 por la letra2 del texto frase, muestra en
     * consola la frase con el cambio
     * 
     * @param frase  texto que se desea modificar
     * @param letra1 string que se deasea cambiar
     * @param letra2 string que por la que se va a cambiar letra1
     */
    public static void cambiarLetra(String frase, String letra1, String letra2) {
        String fraseModificada = frase.replace(letra1, letra2);
        consola.printInfo(fraseModificada);
    }

}
