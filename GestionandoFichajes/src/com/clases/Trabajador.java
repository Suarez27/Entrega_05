package com.clases;

import java.util.Date;

/**
 * Clase abstracta que representa a un trabajador dentro del sistema.
 * Contiene información común como nombre, fecha de nacimiento y país de origen.
 */
public abstract class Trabajador {
    /** Nombre del trabajador. */
    protected String nombre;

    /** Fecha de nacimiento del trabajador. */
    protected Date FechaNacimientoTrabajador;

    /** País de origen del trabajador. */
    protected String paisOrigen;

    /** Contador estático del total de trabajadores instanciados. */
    private static int totalTrabajadores = 0;

    /**
     * Constructor de la clase Trabajador.
     * 
     * @param nombre          Nombre del trabajador. No debe ser nulo.
     * @param fechaNacimiento Fecha de nacimiento del trabajador. Si es nula, se
     *                        asigna la fecha actual.
     * @param paisOrigen      País de origen del trabajador. No debe ser nulo.
     */
    public Trabajador(String nombre, Date fechaNacimiento, String paisOrigen) {
        this.nombre = (nombre != null) ? nombre : "Error, el nombre no debe ser nulo";
        this.FechaNacimientoTrabajador = (fechaNacimiento != null) ? fechaNacimiento : new Date();
        this.paisOrigen = (paisOrigen != null) ? paisOrigen : "Error, el pais no debe ser nulo";
        totalTrabajadores++;
    }

    /**
     * Obtiene el total de trabajadores creados.
     * 
     * @return Número total de trabajadores instanciados.
     */
    public static int getTotalTrabajadores() {
        return totalTrabajadores;
    }

    /**
     * Método abstracto que debe ser implementado por las clases hijas.
     * Debe mostrar la información del trabajador.
     */
    public abstract void mostrarInfo();

    /**
     * Obtiene el nombre del trabajador.
     * 
     * @return Nombre del trabajador.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece un nuevo nombre para el trabajador.
     * 
     * @param nombre Nuevo nombre del trabajador. No debe ser nulo.
     */
    public void setNombre(String nombre) {
        this.nombre = (nombre != null) ? nombre : "Error, el nombre no debe ser nulo";
    }

    /**
     * Obtiene la fecha de nacimiento del trabajador.
     * 
     * @return Fecha de nacimiento del trabajador.
     */
    public Date getFechaNacimientoTrabajador() {
        return FechaNacimientoTrabajador;
    }

    /**
     * Establece una nueva fecha de nacimiento para el trabajador.
     * 
     * @param fechaNacimientoTrabajador Nueva fecha de nacimiento del trabajador.
     *                                  Si es nula, se asigna la fecha actual.
     */
    public void setFechaNacimientoTrabajador(Date fechaNacimientoTrabajador) {
        this.FechaNacimientoTrabajador = (fechaNacimientoTrabajador != null) ? fechaNacimientoTrabajador : new Date();
    }

    /**
     * Obtiene el país de origen del trabajador.
     * 
     * @return País de origen del trabajador.
     */
    public String getPaisOrigen() {
        return paisOrigen;
    }

    /**
     * Establece un nuevo país de origen para el trabajador.
     * 
     * @param paisOrigen Nuevo país de origen del trabajador. No debe ser nulo.
     */
    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = (paisOrigen != null) ? paisOrigen : "Error, el pais no debe ser nulo";
    }

    /**
     * Compara la nacionalidad del trabajador actual con la de otro trabajador.
     * 
     * @param trabajador Otro trabajador con el que se comparará la nacionalidad.
     */
    public void mismaNacionalidad(Trabajador trabajador) {
        if (this.paisOrigen.equalsIgnoreCase(trabajador.getPaisOrigen())) {
            System.out.println(nombre + " y " + trabajador.getNombre() +
                    " tienen la misma nacionalidad: " + paisOrigen);
        } else {
            System.out.println(nombre + " y " + trabajador.getNombre() +
                    " tienen diferentes nacionalidades: " + paisOrigen +
                    " y " + trabajador.getPaisOrigen());
        }
    }
}
