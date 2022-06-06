package com.sofkau.ejercicio17;

import java.util.HashMap;

/**
 * Esta clase es la que tiene los atributos y metodos de un electrodomestico
 */
public class Electrodomestico {
    protected double precioBase;
    protected String color;
    protected char consumoEnergia;
    protected double peso;

    /**
     * Esta funcion crea a un electrodomestico con todos su atributos declarados por
     * defecto
     */
    public Electrodomestico() {
        this.precioBase = 100;
        this.color = "blanco";
        this.consumoEnergia = 'F';
        this.peso = 5;
    }

    /**
     * Esta funcion crea a un electrodomestico con el color y consumo por defecto
     * 
     * @param precioBase precio base del electrodomestico
     * @param peso       peso del electrodomestico
     */
    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.color = "blanco";
        this.consumoEnergia = 'F';
        this.peso = peso;
    }

    /**
     * Esta funcion crea a un electrodomestico
     * 
     * @param precioBase     precio base del electrodomestico
     * @param color          color del electrodomestico
     * @param consumoEnergia consumo de energia del electrodomestico
     * @param peso           peso del electrodomestico
     */
    public Electrodomestico(double precioBase, String color, char consumoEnergia, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        comprobarColor(color);
        this.consumoEnergia = consumoEnergia;
        comprobarConsumoEnergetico(consumoEnergia);
        this.peso = peso;
    }

    /**
     * Esta funcion comprueba que la letra asociada al consumo de energia es
     * correcta. Si no lo es, se establecera 'F' por defecto
     * 
     * @param consumo consumo de energia del electrodomestico
     */
    protected void comprobarConsumoEnergetico(char consumo) {
        if (this.consumoEnergia == 'A' || this.consumoEnergia == 'B' ||
                this.consumoEnergia == 'C' || this.consumoEnergia == 'D' ||
                this.consumoEnergia == 'E' || this.consumoEnergia == 'F') {
            this.consumoEnergia = consumo;
        } else {
            this.consumoEnergia = 'F';
        }
    }

    /**
     * Esta funcion comprueba que el color del electrodomestico sea correcto.
     * Si no lo es, establecera el color blanco por defecto
     * 
     * @param color color del electrodomestico
     */
    protected void comprobarColor(String color) {
        color = color.toLowerCase();
        if (color.equals("blanco") || color.equals("negro") ||
                color.equals("rojo") || color.equals("azul") ||
                color.equals("gris")) {
            this.color = color;
        } else {
            this.color = "blanco";
        }
    }

    /**
     * Esta funcion calcula el precio final sumando un factor adicional por el
     * consumo de energia y por el peso del electrodomestico
     * 
     * @return precio final del electrodomestico
     */
    protected double precioFinal() {
        double precio = this.precioBase;
        HashMap<Character, Integer> preciosPorConsumo = new HashMap<>();
        preciosPorConsumo.put('A', 100);
        preciosPorConsumo.put('B', 80);
        preciosPorConsumo.put('C', 60);
        preciosPorConsumo.put('D', 50);
        preciosPorConsumo.put('E', 30);
        preciosPorConsumo.put('F', 10);
        precio += Double.parseDouble(preciosPorConsumo.get(this.consumoEnergia).toString());

        if (this.peso >= 0 && this.peso <= 19) {
            precio += 10;
        } else if (this.peso >= 20 && this.peso <= 49) {
            precio += 50;
        } else if (this.peso >= 50 && this.peso <= 79) {
            precio += 80;
        } else {
            precio += 100;
        }
        return precio;
    }

    /**
     * Esta funcion establece el valor del atributo precioBase
     * 
     * @return el valor que se le desea adignar a precioBase
     */
    public double getPrecioBase() {
        return precioBase;
    }

    /**
     * Esta funcion establece el valor del atributo color
     * 
     * @return el valor que se le desea adignar a color
     */
    public String getColor() {
        return color;
    }

    /**
     * Esta funcion establece el valor del atributo consumoEnergia
     * 
     * @return el valor que se le desea adignar a consumoEnergia
     */
    public char getConsumoEnergia() {
        return consumoEnergia;
    }

    /**
     * Esta funcion establece el valor del atributo peso
     * 
     * @return el valor que se le desea adignar a peso
     */
    public double getPeso() {
        return peso;
    }

}
