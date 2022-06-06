package com.sofkau.ejercicio17;

import com.sofkau.ownlogger.OwnLogger;

/**
 * Esta clase es la solución al ejercicio 17 de java
 * 
 * @author Sebastian Barrera Marín
 * @version 1.0.0 04/06/2022
 */
public class Main {
    public static void main(String[] args) {
        OwnLogger consola = new OwnLogger();

        Lavadora lavadora1 = new Lavadora(10, "blanco", 'A', 30, 31);
        Lavadora lavadora2 = new Lavadora(40, "blanca", 'C', 46, 30);
        Electrodomestico electrodomestico = new Electrodomestico(60, "morado", 'Z', 18);
        Lavadora lavadora4 = new Lavadora(33, 18);
        Lavadora lavadora5 = new Lavadora();
        Television tv1 = new Television();
        Television tv2 = new Television(60, 29);
        Television tv3 = new Television(36, "verde", 'A', 60, 40, false);
        Television tv4 = new Television(15, "morado", 'D', 15, 34, true);
        Television tv5 = new Television(40, "blanco", 'X', 30, 60, true);

        Electrodomestico[] articulos = { lavadora1, lavadora2, electrodomestico, lavadora4, lavadora5,
                tv1, tv2, tv3, tv4, tv5 };

        for (int i = 0; i < articulos.length; i++) {
            consola.printInfo("Precio final: " + i + " " + articulos[i].precioFinal());
        }

        double sumaElectrodomesticos = 0;
        double sumaLavadoras = 0;
        double sumaTelevisiones = 0;

        for (Electrodomestico element : articulos) {
            if (element instanceof Electrodomestico) {
                sumaElectrodomesticos += element.precioFinal();
            }
            if (element instanceof Lavadora) {
                sumaLavadoras += element.precioFinal();
            }
            if (element instanceof Television) {
                sumaTelevisiones += element.precioFinal();
            }
        }
        consola.printInfo("La suma del precio de la clase Electrodomesticos es: " + sumaElectrodomesticos);
        consola.printInfo("La suma del precio de la clase Lavadoras es: " + sumaLavadoras);
        consola.printInfo("La suma del precio de la clase Televisores es: "+ sumaTelevisiones);

    }
}
