package com.sofkau.ejercicio6;

import com.sofkau.ownlogger.OwnLogger;

/**
 * Esta clase es la solución al ejercicio 6 de java
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
     * ciclo for
     */
    public static void numerosPares() {
        consola.printInfo("Numeros pares:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                consola.printInfo(String.valueOf(i));
            }
        }
    }

    /**
     * Esta funcion muestra en consola los numeros impares del 1 al 100 usando la el
     * ciclo for
     */
    public static void numerosImpares() {
        consola.printInfo("Numeros impares:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                consola.printInfo(String.valueOf(i));
            }
        }
    }

}
