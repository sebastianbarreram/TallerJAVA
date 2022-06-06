package com.sofkau.ejercicio16;

import java.util.Random;

/**
 * Esta clase es la que tiene los atributos y metodos para una persona
 */
public class Persona {

    private String nombre;
    private int edad;
    private int dni;
    private char genero;
    private double peso;
    private double altura;

    private Random random = new Random();

    /**
     * Esta funcion crea a una persona con todos su atributos declarados por defecto
     */
    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.dni = generaDNI();
        this.genero = 'H';
        this.peso = 0;
        this.altura = 0;
    }

    /**
     * Esta funcion crea a una persona con la altura y peso creados por defecto
     * y recibe como parametros:
     * 
     * @param nombre nombre de la persona
     * @param edad   edad de la persona
     * @param genero genero de la persona (H:hombre/M:mujer)
     */
    public Persona(String nombre, int edad, char genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generaDNI();
        this.genero = genero;
        comprobarSexo();
        this.peso = 0;
        this.altura = 0;
    }

    /**
     * Esta funcion crea a una persona recibiendo como parametros:
     * 
     * @param nombre nombre de la persona
     * @param edad   edad de la persona
     * @param genero genero de la persona
     * @param peso   peso de la persona
     * @param altura altura de la persona
     */
    public Persona(String nombre, int edad, char genero, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generaDNI();
        this.genero = genero;
        comprobarSexo();
        this.peso = peso;
        this.altura = altura;
    }

    /**
     * Esta funcion calcula el IMC de la persona
     * 
     * @return un entero segun el IMC de la persona
     */
    public int calcularIMC() {
        if (this.peso == 0) {
            return 2;
        } else {
            double imc = this.peso / Math.pow(this.altura, 2);
            if (imc < 20) {
                return -1;
            } else if (imc >= 20 && imc <= 25) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    /**
     * Esta funcion indica si la persona es mayor de edad o no
     * 
     * @return un valor booleano true si es mayor de edad, false si es menor de edad
     */
    public boolean esMayorDeEdad() {
        return this.edad >= 18;
    }

    /**
     * Esta funcion verifica que el valor del genero si sea un caracter
     * 
     */
    private void comprobarSexo() {
        if (this.genero != 'H' || this.genero != 'M') {
            this.genero = 'H';
        }
    }

    /**
     * Esta funcion retorna toda la informacion de la persona
     * 
     * @return informacion de la persona
     */
    public String toString() {
        return "Nombre: " + this.nombre + "\nEdad: " + this.edad +
                "\nDNI: " + this.dni + "\nSexo: " + this.genero +
                "\nPeso: " + this.peso + "\nAltura: " + this.altura;
    }

    /**
     * Esta funcion genera un dni aleatorio de 8 digitos
     * 
     * @return dni aleatorio de 8 digitos
     */
    public int generaDNI() {
        return this.random.nextInt(100000000);
    }

    /**
     * Esta funcion retorna un mensaje dependiendo del IMC de la persona
     * 
     * @return mensaje segun IMC de la persona
     */
    public String mensajeIMC() {
        if (calcularIMC() == -1) {
            return "Esta por debajo de su peso ideal";
        } else if (calcularIMC() == 0) {
            return "Esta en su peso ideal";
        } else if (calcularIMC() == 1) {
            return "Tiene sobrepeso";
        }
        return "No se ha calculado un valor de IMC";
    }

    /**
     * Esta funcion establece el valor del atributo nombre
     * 
     * @param nombre el valor que se le desea adignar a nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Esta funcion establece el valor del atributo edad
     * 
     * @param edad valor que se le desea asignar a edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Esta funcion establece el valor del atributo genero
     * 
     * @param genero valor que se le desea asignar a genero
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }

    /**
     * Esta funcion establece el valor del atributo peso
     * 
     * @param peso valor que se le desea asignar a peso
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * Esta funcion establece el valor del atributo altura
     * 
     * @param altura valor que se le desea asignar a altura
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

}
