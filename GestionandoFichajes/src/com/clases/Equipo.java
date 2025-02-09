package com.clases;

import com.enums.*;
import java.util.ArrayList;
import com.clases.*;

public class Equipo {
    private String Nombre;
    private String Abreviatura;

    private Presidente Presidente_id;
    private Entrenador Entrenador_id;
    private ArrayList<Jugador> Jugadores_lista;

    public Equipo(String nombre_equipo, String abreviatura_equipo, Presidente presidente_id, Entrenador entrenador_id,
    ArrayList jugadores_lista) {
        if (nombre_equipo != null) {
            this.Nombre = nombre_equipo;
        } else {
            System.out.println("Error: El nombre no debe ser Null");
            this.Nombre = "Desconocido";
        }

        if (abreviatura_equipo != null) {
            this.Abreviatura = abreviatura_equipo;
        } else {
            System.out.println("Error: La abreviatura no debe ser Null");
            this.Abreviatura = "Desconocido";
        }
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

    public String getAbreviatura() {
        return Abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        if (abreviatura != null) {
            this.Abreviatura = abreviatura;
        } else {
            System.out.println("Error, abreviatura no valida");
        }
    }

    public Presidente getPresidente_id() {
        return Presidente_id;
    }

    public void setPresidente_id(Presidente presidente_id) {
        if (presidente_id != null) {
            this.Presidente_id = presidente_id;
        } else {
            System.out.println("Error, presidente no valido");
        }
    }

    public Entrenador getEntrenador_id() {
        return Entrenador_id;
    }

    public void setEntrenador_id(Entrenador entrenador_id) {
        if (entrenador_id != null) {
            this.Entrenador_id = entrenador_id;
        } else {
            System.out.println("Error, entrenador no valido");
        }
    }

    public ArrayList<Jugador> getJugadores_lista() {
        return Jugadores_lista;
    }

    public void setJugadores_lista(ArrayList<Jugador> jugadores_lista) {
        if (jugadores_lista != null) {
            this.Jugadores_lista = jugadores_lista;
        } else {
            System.out.println("Error, lista jugadores no valido");
        }
    }

}
