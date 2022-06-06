package com.sofkau.ejercicio17;

/**
 * Esta clase es la que tiene los atributos y metodos de una television
 */
public class Television extends Electrodomestico {
    private double resolucion;
    private boolean sintonizadorTDT;

    /**
     * Esta funcion crea a una televisio con todos su atributos declarados por
     * defecto. Carga los atributos heredados de la clase Electrodomesticos
     */
    public Television() {
        super();
        this.resolucion = 30;
        this.sintonizadorTDT = true;
    }

    /**
     * Esta funcion crea a una television con la resolucion y sintonizadorTDTpor
     * defecto. Carga los atributos heredados de la clase Electrodomesticos
     * 
     * 
     * @param precioBase precio base de la television
     * @param peso       peso de la television
     */
    public Television(double precio, double peso) {
        super(precio, peso);
        this.resolucion = 30;
        this.sintonizadorTDT = true;
    }

    /**
     * Esta funcion crea a una television.
     * Carga los atributos heredados de la clase Electrodomesticos.
     * 
     * @param precioBase     precio base de la television
     * @param color          color de la television
     * @param consumoEnergia consumo de energia de la television
     * @param peso           peso de la television
     */
    public Television(double precioBase, String color, char consumoEnergia,
            double peso, double resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergia, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    /**
     * Esta funcion obtiene el valor del atributo resolucion
     * 
     * @return valor del atributo resolucion
     */
    public double getResolucion() {
        return resolucion;
    }

    /**
     * Esta funcion obtiene el valor del atributo SintonizadorTDT
     * 
     * @return valor del atributo SintonizadorTDT
     */
    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    /**
     * Esta funcion calcula el precio final sumando un factor adicional por la
     * resolucion de la television, por si tiene sintonizadorTDT incorporado, por el
     * consumo de energia y por el peso del electrodomestico
     */
    @Override
    public double precioFinal() {
        double precio = super.precioFinal();
        if (this.resolucion > 40) {
            precio += precio * 30 / 100;
        }
        if (this.sintonizadorTDT) {
            precio += 50;
        }
        return precio;
    }
}
