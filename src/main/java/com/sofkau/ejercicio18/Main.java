package com.sofkau.ejercicio18;

import com.sofkau.ownlogger.OwnLogger;

/**
 * Esta clase es la solución al ejercicio 18 de java
 * 
 * @author Sebastian Barrera Marín
 * @version 1.0.0 04/06/2022
 */
public class Main {
    public static void main(String[] args) {
        OwnLogger consola = new OwnLogger();

        Serie serie1 = new Serie("How I met your mother", 9, "Comedia", "Carter Bays");
        Serie serie2 = new Serie("Suits", "Aaron Korsh");
        Serie serie3 = new Serie();
        Serie serie4 = new Serie("The Big Bang Theory", 12, "Comedia", " Chuck Lorre");
        Serie serie5 = new Serie();
        Serie[] series = { serie1, serie2, serie3, serie4, serie5 };

        Videojuego videojuego1 = new Videojuego("Prince of Persia", 8.6, "Aventura", "Ubisoft");
        Videojuego videojuego2 = new Videojuego("Mario Kart", 10);
        Videojuego videojuego3 = new Videojuego();
        Videojuego videojuego4 = new Videojuego("Legend of Zelda", 15, "Aventura", "Nintendo");
        Videojuego videojuego5 = new Videojuego();
        Videojuego[] videojuegos = { videojuego1, videojuego2, videojuego3, videojuego4, videojuego5 };

        series[1].entregar();
        series[3].entregar();
        videojuegos[0].entregar();
        videojuegos[1].entregar();
        videojuegos[4].entregar();

        int seriesEntregadas = 0;
        int juegosEntregados = 0;

        for (Serie element : series) {
            if (element.isEntregado()) {
                seriesEntregadas++;
            }
        }

        for (Videojuego element : videojuegos) {
            if (element.isEntregado()) {
                juegosEntregados++;
            }
        }
        consola.printInfo("Series entregadas : " + seriesEntregadas
                + "\nVideojuegos entregados: " + juegosEntregados);

        Serie serieMasTemporadas = new Serie();
        serieMasTemporadas.setNumeroTemporadas(0);
        for (int i = 0; i < series.length; i++) {
            if (series[i].compareTo(serieMasTemporadas) == 1) {
                serieMasTemporadas = series[i];
            }
        }
        consola.printInfo("La serie con mas temporadas es: \n" + serieMasTemporadas.toString());

        Videojuego juegoMasHoras = new Videojuego();
        juegoMasHoras.setHorasEstimadas(0);
        for (int i = 0; i < videojuegos.length; i++) {
            if (videojuegos[i].compareTo(juegoMasHoras) == 1) {
                juegoMasHoras = videojuegos[i];
            }
        }
        consola.printInfo("El videojuego con mas horas es: \n" + juegoMasHoras.toString());

    }
}
