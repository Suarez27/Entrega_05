package com.clases;

import com.enums.*;
import com.clases.*;

/**
 * Representa a un presidente de un equipo de fútbol con atributos como DNI,
 * nombre y el equipo al que pertenece.
 */
public class Presidente {
    private String DNI;
    private String Nombre;

    private Equipo Equipo_id;
    /** Contador estático para el total de presidentes creados. */
    private static int totalPresidentes = 0;

    /**
     * Constructor de la clase Presidente.
     * 
     * @param dni_presidente    DNI del presidente.
     * @param nombre_presidente Nombre del presidente.
     * @param equipo_presidente Equipo del presidente.
     */
    public Presidente(String dni_presidente, String nombre_presidente, Equipo equipo_presidente) {
        if (dni_presidente != null) {
            this.DNI = dni_presidente;
        } else {
            System.out.println("Error: El dni no debe ser Null");
            this.DNI = "Desconocido";
        }

        if (nombre_presidente != null) {
            this.Nombre = nombre_presidente;
        } else {
            System.out.println("Error: El nombre no debe ser Null");
            this.Nombre = "Desconocido";
        }
        totalPresidentes++;
    }

    /**
     * Obtiene el total de presidentes creados.
     * 
     * @return Número total de presidentes instanciados.
     */
    public static int getTotalPresidentes() {
        return totalPresidentes;
    }

    /**
     * Obtiene el DNI del presidente.
     * 
     * @return DNI del presidente.
     */
    public String getDNI() {
        return DNI;
    }

    /**
     * Establece el DNI del presidente.
     * 
     * @param dni Nuevo DNI del presidente.
     */
    public void setDNI(String dni) {
        if (dni != null) {
            this.DNI = dni;
        } else {
            System.out.println("Error, DNI no valido");
        }
    }

    /**
     * Obtiene el nombre del presidente.
     * 
     * @return Nombre del presidente.
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * Establece el nombre del presidente.
     * 
     * @param nombre Nuevo nombre del presidente.
     */
    public void setNombre(String nombre) {
        if (nombre != null) {
            this.Nombre = nombre;
        } else {
            System.out.println("Error, nombre no valido");
        }
    }

    /**
     * Obtiene el equipo al que pertenece el presidente.
     * 
     * @return Equipo del presidente.
     */
    public Equipo getEquipo_id() {
        return Equipo_id;
    }

    /**
     * Establece el equipo del presidente.
     * 
     * @param equipo_id Nuevo equipo del presidente.
     */
    public void setEquipo_id(Equipo equipo_id) {
        if (equipo_id != null) {
            this.Equipo_id = equipo_id;
        } else {
            System.out.println("Error, equipo no valido");
        }
    }

    /**
     * Representación de los atributos del Presidente.
     * 
     * @return Cadena con los datos del presidente.
     */
    @Override
    public String toString() {
        String presidenteEquipo = (Equipo_id != null) ? Equipo_id.getNombre() : "Sin equipo";
        return "Presidente [DNI=" + DNI + ", Nombre=" + Nombre + ", Equipo_id=" + presidenteEquipo + "]";
    }

}
