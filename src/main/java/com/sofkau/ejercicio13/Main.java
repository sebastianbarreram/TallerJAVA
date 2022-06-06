package com.sofkau.ejercicio13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.sofkau.ownlogger.OwnLogger;

/**
 * Esta clase es la solución al ejercicio 13 de java
 * 
 * @author Sebastian Barrera Marín
 * @version 1.0.0 04/06/2022
 */
public class Main {
    public static final OwnLogger consola = new OwnLogger();

    public static void main(String[] args) {
        fechaHoraActual();
    }

    /**
     * Esta funcion permite consultar fecha y hora actual en el formato
     * (AAAA/MM/DD) (HH:MM:SS)
     */
    public static void fechaHoraActual() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        consola.printInfo("yyyy/MM/dd HH:mm:ss-> " + dtf.format(LocalDateTime.now()));
    }
}
