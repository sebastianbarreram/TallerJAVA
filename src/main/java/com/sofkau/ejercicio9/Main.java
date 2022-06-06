package com.sofkau.ejercicio9;

import java.util.Scanner;

import com.sofkau.ownlogger.OwnLogger;

/**
 * Esta clase es la solución al ejercicio 9 de java
 * 
 * @author Sebastian Barrera Marín
 * @version 1.0.0 04/06/2022
 */
public class Main {
    public static final OwnLogger consola = new OwnLogger();

    public static void main(String[] args) {
        String texto = "La sonrisa sera la mejor arma contra la tristeza.";
        cambiarLetra(texto, "a", "e");
    }

    /**
     * Esta funcion cambia la letra1 por la letra2 del texto frase, muestra en
     * consola la frase con el cambio y pide ingresar por consola una frase
     * adicional
     * 
     * @param frase  texto que se desea modificar
     * @param letra1 letra que se deasea cambiar
     * @param letra2 letra que por la que se va a cambiar letra1
     */
    public static void cambiarLetra(String frase, String letra1, String letra2) {
        String fraseModificada = frase.replace(letra1, letra2);
        consola.printInfo(fraseModificada);
        try (Scanner scanner = new Scanner(System.in)) {

            consola.printInfo("Ingrese una frase adicional: ");
            String fraseAdicional = scanner.nextLine();
            consola.printInfo(frase + fraseAdicional);
            consola.printInfo(fraseModificada + fraseAdicional);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
