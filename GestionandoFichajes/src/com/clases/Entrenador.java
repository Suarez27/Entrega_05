package com.clases;

import com.enums.*;

public class Entrenador {
    private String Nombre;
    private Formacion Formacion;

    private Equipo Equipo_id;

    private static int totalEntrenadores = 0;

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

    public static int getTotalEntrenadores() {
        return totalEntrenadores;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null) {
            this.Nombre = nombre;
        } else {
            System.out.println("Error, nombre no valido");
        }
    }

    public Formacion getFormacion() {
        return Formacion;
    }

    public void setFormacion(Formacion formacion) {
        if (formacion != null) {
            this.Formacion = formacion;
        } else {
            System.out.println("Error, formacion no valida");
        }
    }

    public Equipo getEquipo_id() {
        return Equipo_id;
    }

    public void setEquipo_id(Equipo equipo_id) {
        if (equipo_id != null) {
            this.Equipo_id = equipo_id;
        } else {
            System.out.println("Error, equipo no valido");
        }
    }

    @Override
    public String toString() {
        String entrenadorEquipo = (Equipo_id != null) ? Equipo_id.getNombre() : "Sin equipo";
        return "Entrenador [Nombre=" + Nombre + ", Formacion=" + Formacion + ", Equipo_id=" + entrenadorEquipo
                + "]";
    }
}
