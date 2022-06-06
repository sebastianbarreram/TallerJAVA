package com.sofkau.ejercicio14;

import java.util.Scanner;

import com.sofkau.ownlogger.OwnLogger;

/**
 * Esta clase es la solución al ejercicio 14 de java
 * 
 * @author Sebastian Barrera Marín
 * @version 1.0.0 04/06/2022
 */
public class Main {
    public static final OwnLogger consola = new OwnLogger();

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            consola.printInfo("Ingrese un numero: ");
            int numero = Integer.parseInt(scanner.nextLine());
            contarDesde(numero);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Esta funcion muestra en la consola los numeros desde el numero inicio hasta
     * 1000 de dos en dos
     * 
     * @param inicio numero desde el cual se comienza a mostrar numeros
     */
    public static void contarDesde(int inicio) {
        int fin = 1000;
        while (inicio <= fin) {
            consola.printInfo(String.valueOf(inicio));
            inicio += 2;
        }
    }

}
