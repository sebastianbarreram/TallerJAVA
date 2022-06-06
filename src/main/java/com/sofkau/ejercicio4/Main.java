package com.sofkau.ejercicio4;

import java.util.Scanner;

import com.sofkau.ownlogger.OwnLogger;

/**
 * Esta clase es la solución al ejercicio 4 de java
 * 
 * @author Sebastian Barrera Marín
 * @version 1.0.0 04/06/2022
 */
public class Main {
    public static void main(String[] args) {
        OwnLogger consola = new OwnLogger();
        try (Scanner scanner = new Scanner(System.in)) {
            consola.printInfo("Ingrese el precio del producto: ");
            double precio = Double.parseDouble(scanner.nextLine());
            String mensaje = precioFinalConIva(precio);

            consola.printInfo(mensaje);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    /**
     * Esta funcion calcula el precio de un producto incluyendo el iva
     * 
     * @param precio el precio del producto sin iva
     * @return string con el precio del producto con iva
     */
    public static String precioFinalConIva(double precio) {
        int iva = 21;
        double conIva = (precio * iva) / 100 + precio;
        return "El precio final del producto incluyendo el IVA del " + iva + "% es " + conIva;
    }

}
