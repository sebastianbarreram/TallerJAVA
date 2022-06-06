package com.sofkau.ejercicio15;

import java.util.Scanner;

import com.sofkau.ownlogger.OwnLogger;

/**
 * Esta clase es la solución al ejercicio 15 de java
 * 
 * @author Sebastian Barrera Marín
 * @version 1.0.0 04/06/2022
 */
public class Main {
    public static final OwnLogger consola = new OwnLogger();

    public static void main(String[] args) {
        mostrarMenu();
    }

    /**
     * Esta funcion muestra el menu de opciones en consola
     * Ingresando el numero 8 se sale del menu, con cualquier
     * otra opcion, sigue mostrando el menu
     */
    public static void mostrarMenu() {
        try (Scanner scanner = new Scanner(System.in)) {
            int numero;
            do {
                consola.printInfo("\n****** GESTIÓN CINEMATOGRÁFICA ********" +
                        "\n1-NUEVO ACTOR" +
                        "\n2-BUSCAR ACTOR" +
                        "\n3-ELIMINAR ACTOR" +
                        "\n4-MODIFICAR ACTOR" +
                        "\n5-VER TODOS LOS ACTORES" +
                        "\n6-VER PELICULAS DE LOS ACTORES"+
                        "\n7-VER CATEGORÍA DE LAS PELICULAS DE LOS ACTORES" +
                        "\n8-SALIR"+
                        "\nPor favor seleccione una opción");

                numero = Integer.parseInt(scanner.nextLine());

                switch (numero) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        break;
                    case 8:
                        consola.printInfo("Saliste del menu");
                        break;
                    default:
                        consola.printWarn("OPCION INCORRECTA");
                }
            } while (numero != 8);
        } catch (Exception e) {
            consola.printWarn("ERROR" + e);
        }

    }

}
