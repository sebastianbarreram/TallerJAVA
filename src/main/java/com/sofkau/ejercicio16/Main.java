package com.sofkau.ejercicio16;

import java.util.Scanner;

import com.sofkau.ownlogger.OwnLogger;

/**
 * Esta clase es la solución al ejercicio 16 de java
 * 
 * @author Sebastian Barrera Marín
 * @version 1.0.0 04/06/2022
 */
public class Main {
    public static void main(String[] args) {
        OwnLogger consola = new OwnLogger();
        try (Scanner scanner = new Scanner(System.in)) {
            consola.printInfo("Ingrese su nombre: ");
            String nombre = scanner.nextLine();
            consola.printInfo("Ingrese su edad: ");
            int edad = Integer.parseInt(scanner.nextLine());
            consola.printInfo("Ingrese su genero: ");
            String genero = scanner.nextLine();
            consola.printInfo("Ingrese su peso: ");
            double peso = Double.parseDouble(scanner.nextLine());
            consola.printInfo("Ingrese su altura: ");
            double altura = Double.parseDouble(scanner.nextLine());

            Persona persona1 = new Persona(nombre, edad, genero.charAt(0), peso, altura);
            Persona persona2 = new Persona(nombre, edad, genero.charAt(0));
            Persona persona3 = new Persona();

            persona3.setNombre("Diana");
            persona3.setEdad(52);
            persona3.setGenero('M');
            persona3.setPeso(50.4);
            persona3.setAltura(1.62);

            consola.printInfo(persona1.mensajeIMC());
            consola.printInfo(persona2.mensajeIMC());
            consola.printInfo(persona3.mensajeIMC());

            consola.printInfo(String.valueOf(persona1.esMayorDeEdad()));
            consola.printInfo(String.valueOf(persona2.esMayorDeEdad()));            
            consola.printInfo(String.valueOf(persona3.esMayorDeEdad()));

            consola.printInfo(persona1.toString());
            consola.printInfo(persona2.toString());
            consola.printInfo(persona3.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
