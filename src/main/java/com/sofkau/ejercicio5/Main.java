package com.sofkau.ejercicio5;

import com.sofkau.ownlogger.OwnLogger;

/**
 * Esta clase es la solución al ejercicio 5 de java
 * 
 * @author Sebastian Barrera Marín
 * @version 1.0.0 04/06/2022
 */
public class Main {
    public static final OwnLogger consola = new OwnLogger();

    public static void main(String[] args) {
        numerosPares();
        consola.printInfo("------------------------------------------------");
        numerosImpares();
    }

    /**
     * Esta funcion muestra en consola los numeros pares del 1 al 100 usando la el
     * ciclo while
     */
    public static void numerosPares() {
        int contador = 1;
        consola.printInfo("Numeros pares:");
        while (contador <= 100) {
            if (contador % 2 == 0) {
                consola.printInfo(String.valueOf(contador));
            }
            contador++;
        }
    }

    /**
     * Esta funcion muestra en consola los numeros impares del 1 al 100 usando la el
     * ciclo while
     */
    public static void numerosImpares() {
        int contador = 1;
        consola.printInfo("Numeros impares:");
        while (contador <= 100) {
            if (contador % 2 != 0) {
                consola.printInfo(String.valueOf(contador));
            }
            contador++;
        }
    }

}
