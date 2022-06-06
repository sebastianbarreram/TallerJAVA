package com.sofkau.ejercicio17;

/**
 * Esta clase es la que tiene los atributos y metodos de una lavadora
 */
public class Lavadora extends Electrodomestico {
    private double carga;

    /**
     * Esta funcion crea a una lavadora con todos su atributos declarados por
     * defecto. Carga los atributos heredados de la clase Electrodomesticos
     */
    public Lavadora() {
        super();
        this.carga = 5;
    }

    /**
     * Esta funcion crea a una lavadora con la carga por defecto
     * Carga los atributos heredados de la clase Electrodomesticos
     * 
     * @param precioBase precio base de la lavadora
     * @param peso       peso de la lavadora
     */
    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
        this.carga = 5;
    }

    /**
     * Esta funcion crea a una lavadora.
     * Carga los atributos heredados de la clase Electrodomesticos.
     * 
     * @param precioBase     precio base de la lavadora
     * @param color          color de la lavadora
     * @param consumoEnergia consumo de energia de la lavadora
     * @param peso           peso de la lavadora
     */
    public Lavadora(double precioBase, String color, char consumoEnergia, double peso, int carga) {
        super(precioBase, color, consumoEnergia, peso);
        this.carga = carga;
    }

    /**
     * Esta funcion obtiene el valor del atributo carga
     * 
     * @return valor del atributo carga
     */
    public double getCarga() {
        return carga;
    }

    /**
     * Esta funcion calcula el precio final sumando un factor adicional por la
     * carga de la lavadora, por el consumo de energia y por el peso del
     * electrodomestico
     */
    @Override
    public double precioFinal() {
        double precio = super.precioFinal();
        if (this.carga >= 30) {
            precio += 50;
        }
        return precio;
    }
}
