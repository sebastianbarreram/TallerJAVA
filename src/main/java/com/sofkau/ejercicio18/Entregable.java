package com.sofkau.ejercicio18;

/**
 * Esta interfacedefine los métodos que seran implementados en las otras clases
 *
 */
public interface Entregable {
    public void entregar();

    public void devolver();

    public boolean isEntregado();

    public int compareTo(Object object);
}
