package com.sofkau.ejercicio7;

import java.util.Scanner;

import com.sofkau.ownlogger.OwnLogger;

/**
 * Esta clase es la solución al ejercicio 7 de java
 * 
 * @author Sebastian Barrera Marín
 * @version 1.0.0 04/06/2022
 */
public class Main {
    /**
     * Esta funcion valida que un numero ingresado sea mayor o igual a cero y lo
     * muestra en consola. Pide ingresarlo hasta que se cumpla la condicion
     */
    public static void main(String[] args) {
        OwnLogger consola = new OwnLogger();
        try (Scanner scanner = new Scanner(System.in)) {
            int numero;
            do {
                consola.printInfo("Ingrese el numero que desea validar: ");
                numero = Integer.parseInt(scanner.nextLine());
            } while (numero < 0);
            consola.printInfo("El numero que se ingreso fue: " + numero);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    }

}
