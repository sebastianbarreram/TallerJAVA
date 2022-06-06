package com.sofkau.ejercicio2;

import java.util.Scanner;

import com.sofkau.ownlogger.OwnLogger;

/**
 * Esta clase es la solución al ejercicio 2 de java
 * 
 * @author Sebastian Barrera Marín
 * @version 1.0.0 04/06/2022
 */
public class Main {
    public static void main(String[] args) {
        OwnLogger consola = new OwnLogger();
        try (Scanner scanner = new Scanner(System.in)) {
            consola.printInfo("Ingrese el primer numero que desea comparar: ");
            int numero1 = Integer.parseInt(scanner.nextLine());
            consola.printInfo("Ingrese el segundo numero que desea comparar: ");
            int numero2 = Integer.parseInt(scanner.nextLine());
            String mensaje = comparacionNumeros(numero1, numero2);

            consola.printInfo(mensaje);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    /**
     * Esta funcion compara dos numeros e indica cual es mayor de los dos, tambien
     * indica si son iguales
     * 
     * @param numero1 el primer numero que se desea comparar
     * @param numero2 el segundo numero que se desea comparar
     * @return string con la comparacion de numeros
     */
    public static String comparacionNumeros(int numero1, int numero2) {
        if (numero1 > numero2) {
            return "El numero1 " + numero1 + " es mayor que el numero2 " + numero2;
        } else if (numero1 < numero2) {
            return "El numero2 " + numero2 + " es mayor que el numero1 " + numero1;
        } else {
            return "Los numeros son iguales";
        }
    }

}
