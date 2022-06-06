package com.sofkau.ejercicio3;

import java.util.Scanner;

import com.sofkau.ownlogger.OwnLogger;

/**
 * Esta clase es la solución al ejercicio 3 de java
 * 
 * @author Sebastian Barrera Marín
 * @version 1.0.0 04/06/2022
 */
public class Main {
    public static void main(String[] args) {
        OwnLogger consola = new OwnLogger();
        try (Scanner scanner = new Scanner(System.in)) {
            consola.printInfo("Ingrese el radio: ");
            double radio = Double.parseDouble(scanner.nextLine());
            String mensaje = areaCirculo(radio);

            consola.printInfo(mensaje);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    /**
     * Esta funcion calcula el area de un circulo segun el radio indicado
     * 
     * @param radio el radio del circulo
     * @return string con el area del circulo
     */
    public static String areaCirculo(double radio) {
        double area = Math.PI * Math.pow(radio, 2);
        return "El area del circulo de radio " + radio + " es " + area;
    }

}
