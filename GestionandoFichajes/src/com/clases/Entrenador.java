package com.clases;

import java.text.Normalizer.Form;
import java.util.Date;

 import com.enums.*;

/**
 * Representa a un entrenador de un equipo.
 * Contiene información sobre su nombre, formación táctica y equipo actual.
 */
public class Entrenador extends Trabajador {

    private Formacion Formacion;
    private Equipo Equipo_id;

    /** Contador estático para el total de entrenadores creados. */
    private static int totalEntrenadores = 0;

    /**
     * Constructor de la clase Entrenador.
     * 
     * @param formacionEntrenador Formación táctica preferida del entrenador.
     * @param equipoEntrenador    Equipo al que pertenece el entrenador.
     */
    public Entrenador(String nombre_entrenador, Date fechaNacimientoEntrenador, String paisEntrenador,
    Formacion formacionEntrenador, Equipo equipoEntrenador) {
    super(nombre_entrenador, fechaNacimientoEntrenador, paisEntrenador);
    if (formacionEntrenador != null) {
        this.Formacion = formacionEntrenador;
    } else {
        System.out.println("Error: la formacion es incorrecta");
        this.Formacion = Formacion.ninguna;
    }
        totalEntrenadores++;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Mi nombres es: " + nombre + " Soy un Entrenador");
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
        return "Entrenador [Formacion=" + Formacion + ", Equipo_id=" + entrenadorEquipo + ", Nombre=" + getNombre()
                + ", FechaNacimientoTrabajador=" + getFechaNacimientoTrabajador() + ", PaisOrigen="
                + getPaisOrigen() + "]";
    }

}
