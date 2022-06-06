package com.sofkau.ejercicio18;

/**
 * Esta clase es la que tiene los atributos y metodos de una serie
 */
public class Serie implements Entregable {
    private String titulo;
    private int numeroTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    /**
     * Esta funcion crea a una serie con todos su atributos declarados por defecto
     */
    public Serie() {
        this.titulo = "";
        this.numeroTemporadas = 3;
        this.entregado = false;
        this.genero = "";
        this.creador = "";
    }

    /**
     * Esta funcion crea a una serie con el numero de temporadas, entregado y genero
     * por defecto
     * 
     * @param titulo  titulo de la serie
     * @param creador creador de la serie
     */
    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = 3;
        this.entregado = false;
        this.genero = "";
        this.creador = creador;
    }

    /**
     * Esta funcion crea a una serie
     * 
     * @param titulo           titulo de la serie
     * @param numeroTemporadas numero de temporadas de la serie
     * @param genero           genero de la serie
     * @param creador          creador de la serie
     */
    public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.entregado = false;
        this.genero = genero;
        this.creador = creador;
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
     * Esta funcion obtiene el valor del atributo numeroTemporadas
     * 
     * @return valor del atributo numeroTemporadas
     */
    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    /**
     * Esta funcion establece el valor del atributo numeroTemporadas
     * 
     * @param numeroTemporadas valor que se le desea asignar a numeroTemporadas
     */
    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
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
     * Esta funcion obtiene el valor del atributo creador
     * 
     * @return valor del atributo creador
     */
    public String getCreador() {
        return creador;
    }

    /**
     * Esta funcion establece el valor del atributo creador
     * 
     * @param creador valor que se le desea asignar a creador
     */
    public void setCreador(String creador) {
        this.creador = creador;
    }

    /**
     * Esta funcion retorna en un string los atributos de la serie
     *
     * @return los atributos de la serie
     */
    @Override
    public String toString() {
        return "Serie [creador=" + creador + ", entregado=" + entregado +
                ", genero=" + genero + ", numeroTemporadas=" + numeroTemporadas + ", titulo=" + titulo + "]";
    }

    /**
     * Esta funcion cambia el estado de la serie a entregado
     */
    @Override
    public void entregar() {
        this.entregado = true;
    }

    /**
     * Esta funcion cambia el estado de la serie a no entregado
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
     * Esta funcion compara la cantidad de temporadas de dos series. Retorna 1 si la
     * primera serie tiene más temporadas, 0 si tienen el mismo numero de temporadas
     * y -1 si la primera serie tiene menos temporadas
     *
     * @param object serie que se desea comparar
     *
     * @return comparacion de las series
     */
    @Override
    public int compareTo(Object object) {
        Serie serie = (Serie) object;
        int estado = -1;
        if (this.numeroTemporadas == serie.getNumeroTemporadas()) {
            estado = 0;
        } else if (this.numeroTemporadas > serie.getNumeroTemporadas()) {
            estado = 1;
        }
        return estado;
    }

}
