package com.clases;

import com.enums.*;

/**
 * Representa a un entrenador de un equipo.
 * Contiene información sobre su nombre, formación táctica y equipo actual.
 */
public class Entrenador {
    private String Nombre;
    private Formacion Formacion;

    private Equipo Equipo_id;

    /** Contador estático para el total de entrenadores creados. */
    private static int totalEntrenadores = 0;

    /**
     * Constructor de la clase Entrenador.
     * 
     * @param nombre_entrenador   Nombre del entrenador.
     * @param formacionEntrenador Formación táctica preferida del entrenador.
     * @param equipoEntrenador    Equipo al que pertenece el entrenador.
     */
    public Entrenador(String nombre_entrenador, Formacion formacionEntrenador, Equipo equipoEntrenador) {
        if (nombre_entrenador != null) {
            this.Nombre = nombre_entrenador;
        } else {
            System.out.println("Error: El nombre no debe ser Null");
            this.Nombre = "Desconocido";
        }

        if (formacionEntrenador != null) {
            this.Formacion = formacionEntrenador;
        } else {
            System.out.println("Error: la formacion es incorrecta");
            this.Formacion = Formacion.ninguna;
        }
        totalEntrenadores++;
    }

    /**
     * Obtiene el total de entrenadores creados.
     * 
     * @return Número total de entrenadores instanciados.
     */
    public static int getTotalEntrenadores() {
        return totalEntrenadores;
    }

    /**
     * Obtiene el nombre del entrenador.
     * 
     * @return Nombre del entrenador.
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * Establece el nombre del entrenador.
     * 
     * @param nombre Nuevo nombre del entrenador.
     */
    public void setNombre(String nombre) {
        if (nombre != null) {
            this.Nombre = nombre;
        } else {
            System.out.println("Error, nombre no valido");
        }
    }

    /**
     * Obtiene la formación táctica preferida del entrenador.
     * 
     * @return Formación del entrenador.
     */
    public Formacion getFormacion() {
        return Formacion;
    }

    /**
     * Establece la formación táctica preferida del entrenador.
     * 
     * @param formacion Nueva formación del entrenador.
     */
    public void setFormacion(Formacion formacion) {
        if (formacion != null) {
            this.Formacion = formacion;
        } else {
            System.out.println("Error, formacion no valida");
        }
    }

    /**
     * Obtiene el equipo al que pertenece el entrenador.
     * 
     * @return Equipo del entrenador.
     */
    public Equipo getEquipo_id() {
        return Equipo_id;
    }

    /**
     * Asigna un equipo al entrenador.
     * 
     * @param equipo_id Nuevo equipo del entrenador.
     */
    public void setEquipo_id(Equipo equipo_id) {
        if (equipo_id != null) {
            this.Equipo_id = equipo_id;
        } else {
            System.out.println("Error, equipo no valido");
        }
    }

    /**
     * Representación de los atributos del Entrenador.
     * 
     * @return Cadena con los datos del entrenador.
     */
    @Override
    public String toString() {
        String entrenadorEquipo = (Equipo_id != null) ? Equipo_id.getNombre() : "Sin equipo";
        return "Entrenador [Nombre=" + Nombre + ", Formacion=" + Formacion + ", Equipo_id=" + entrenadorEquipo
                + "]";
    }
}
