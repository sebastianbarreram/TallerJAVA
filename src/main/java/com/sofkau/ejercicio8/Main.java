package com.sofkau.ejercicio8;

import java.util.Scanner;

import com.sofkau.ownlogger.OwnLogger;

/**
 * Esta clase es la solución al ejercicio 8 de java
 * 
 * @author Sebastian Barrera Marín
 * @version 1.0.0 04/06/2022
 */
public class Main {
    public static final OwnLogger consola = new OwnLogger();

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            consola.printInfo("Ingrese un dia de la semana: ");
            String dia = scanner.nextLine();
            validarDia(dia);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * Esta funcion muestra en consola si el dia es laboral o no
     * 
     * @param dia dia de la semana que se quiere evaluar
     */
    public static void validarDia(String dia) {
        switch (dia.toLowerCase()) {
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                consola.printInfo(dia + " es un dia laboral");
                break;
            case "sabado":
            case "domingo":
                consola.printInfo(dia + " no es un dia laboral");
                break;
            default:
                consola.printInfo("No se ingreso un dia valido");
                break;
        }
    }

}
