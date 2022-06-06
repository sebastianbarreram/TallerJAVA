package com.sofkau.ejercicio18;

/**
 * Esta clase es la que tiene los atributos y metodos de un videojuego
 */
public class Videojuego implements Entregable {
    private String titulo;
    private double horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compania;

    /**
     * Esta funcion crea a un videojuego con todos su atributos declarados por
     * defecto
     */
    public Videojuego() {
        this.titulo = "";
        this.horasEstimadas = 10;
        this.entregado = false;
        this.genero = "";
        this.compania = "";
    }

    /**
     * Esta funcion crea a un videojuego con entregado, genero y compania
     * por defecto
     * 
     * @param titulo  titulo del videojuego
     * @param creador creador del videojuego
     */
    public Videojuego(String titulo, double horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = false;
        this.genero = "";
        this.compania = "";
    }

    /**
     * Esta funcion crea un videojuego
     * 
     * @param titulo         titulo del videojuego
     * @param horasEstimadas horas estimadas del videojuego
     * @param genero         genero del videojuego
     * @param compania       compañia creadora del videojuego
     */
    public Videojuego(String titulo, double horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = false;
        this.genero = genero;
        this.compania = compania;
    }

    /**
     * Esta funcion obtiene el valor del atributo titulo
     * 
     * @return valor del atributo titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Esta funcion establece el valor del atributo titulo
     * 
     * @param titulo valor que se le desea asignar a titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Esta funcion obtiene el valor del atributo horasEstimadas
     * 
     * @return valor del atributo horasEstimadas
     */
    public double getHorasEstimadas() {
        return horasEstimadas;
    }

    /**
     * Esta funcion establece el valor del atributo horasEstimadas
     * 
     * @param horasEstimadas valor que se le desea asignar a horasEstimadas
     */
    public void setHorasEstimadas(double horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    /**
     * Esta funcion obtiene el valor del atributo genero
     * 
     * @return valor del atributo genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Esta funcion establece el valor del atributo genero
     * 
     * @param genero valor que se le desea asignar a genero
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Esta funcion obtiene el valor del atributo compañia
     * 
     * @return valor del atributo compañia
     */
    public String getCompania() {
        return compania;
    }

    /**
     * Esta funcion establece el valor del atributo compania
     * 
     * @param compania valor que se le desea asignar a compania
     */
    public void setCompania(String compania) {
        this.compania = compania;
    }

    /**
     * Esta funcion retorna en un string los atributos del videojuego
     *
     * @return los atributos de la serie
     */
    @Override
    public String toString() {
        return "Videojuego [compania=" + compania + ", entregado=" + entregado + ", genero=" + genero
                + ", horasEstimadas=" + horasEstimadas + ", titulo=" + titulo + "]";
    }

    /**
     * Esta funcion cambia el estado del videojuego a entregado
     */
    @Override
    public void entregar() {
        this.entregado = true;
    }

    /**
     * Esta funcion cambia el estado del videojuego a no entregado
     */
    @Override
    public void devolver() {
        this.entregado = false;
    }

    /**
     * Esta funcion retorna el valor del atributo entregado
     *
     * @return valor del atributo entregado
     */
    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    /**
     * Esta funcion compara la cantidad de horas estimadas de dos videojuegos.
     * Retorna 1 si el primer videojuego tiene más horas estimadas, 0 si tienen el
     * mismo numero de horas estimadas y -1 si el primer videojuego tiene menos
     * horas estimadas
     *
     * @param object videojuego que se desea comparar
     *
     * @return comparacion de los videojuegos
     */
    @Override
    public int compareTo(Object object) {
        Videojuego serie = (Videojuego) object;
        int estado = -1;
        if (this.horasEstimadas == serie.getHorasEstimadas()) {
            estado = 0;
        } else if (this.horasEstimadas > serie.getHorasEstimadas()) {
            estado = 1;
        }
        return estado;
    }

}
