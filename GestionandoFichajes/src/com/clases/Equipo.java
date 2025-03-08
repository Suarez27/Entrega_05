package com.clases;

import com.enums.*;
import java.util.ArrayList;

/**
 * Representa un equipo de fútbol con nombre, abreviatura, presidente,
 * entrenador y una lista de jugadores.
 * Incluye funcionalidades para gestionar traspasos y modificar al equipo.
 */
public class Equipo {
    private String Nombre;
    private String Abreviatura;

    private Presidente Presidente_id;
    private Entrenador Entrenador_id;
    private ArrayList<Jugador> Jugadores_lista;
    /** Contador estático para el total de equipos creados. */
    private static int totalEquipos = 0;

    /**
     * Constructor de la clase Equipo.
     * 
     * @param nombre_equipo      Nombre del equipo.
     * @param abreviatura_equipo Abreviatura del equipo.
     * @param presidente_id      Presidente del equipo.
     * @param entrenador_id      Entrenador del equipo.
     * @param jugadores_lista    Lista de jugadores del equipo.
     */
    public Equipo(String nombre_equipo, String abreviatura_equipo, Presidente presidente_id, Entrenador entrenador_id,
            ArrayList jugadores_lista) {
        if (nombre_equipo != null) {
            this.Nombre = nombre_equipo;
        } else {
            System.out.println("Error, El nombre no debe ser Null");
            this.Nombre = "Desconocido";
        }

        if (abreviatura_equipo != null) {
            this.Abreviatura = abreviatura_equipo;
        } else {
            System.out.println("Error, La abreviatura no debe ser Null");
            this.Abreviatura = "Desconocido";
        }
        totalEquipos++;
    }

    /**
     * Resetea los estados de traspaso de los jugadores del equipo.
     * Si el estado del traspaso es RECHAZADO_POR_ENTRENADOR o
     * RECHAZADO_POR_PRESIDENTE
     * se cambia a SIN_SOLICITAR, cualquier otro estado se mantiene igual.
     */
    public void resetearEstadosTraspaso() {
        for (Jugador jugador : Jugadores_lista) {
            if (jugador.getTraspaso() == Traspaso.Rechazado_por_entrenador ||
                    jugador.getTraspaso() == Traspaso.Rechazado_por_presidente) {
                jugador.setTraspaso(Traspaso.Sin_solicitar);
            }
        }
        System.out.println("Se han reseteado los estados de traspaso en el equipo " + Nombre);
    }

    /**
     * Agrega un jugador a la lista de jugadores del equipo.
     * 
     * @param jugador Jugador a agregar.
     */
    public void agregarJugador(Jugador jugador) {
        if (jugador != null && !Jugadores_lista.contains(jugador)) {
            Jugadores_lista.add(jugador);
            jugador.setEquipo_id(this);
        }
    }

    /**
     * Elimina un jugador de la lista de jugadores del equipo.
     * 
     * @param jugador Jugador a eliminar.
     */
    public void eliminarJugador(Jugador jugador) {
        if (jugador != null && Jugadores_lista.contains(jugador)) {
            Jugadores_lista.remove(jugador);
            jugador.setEquipo_id(null);
        }
    }

    /**
     * Obtiene el total de equipos creados.
     * 
     * @return Número total de equipos instanciados.
     */
    public static int getTotalEquipos() {
        return totalEquipos;
    }

    /**
     * Obtiene el nombre del equipo.
     * 
     * @return Nombre del equipo.
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * Asigna un nuevo nombre al equipo.
     * 
     * @param nombre Nuevo nombre del equipo.
     */
    public void setNombre(String nombre) {
        if (nombre != null) {
            this.Nombre = nombre;
        } else {
            System.out.println("Error, nombre no valido");
        }
    }

    /**
     * Obtiene la abreviatura del equipo.
     * 
     * @return Abreviatura del equipo.
     */
    public String getAbreviatura() {
        return Abreviatura;
    }

    /**
     * Asigna una nueva abreviatura al equipo.
     * 
     * @param abreviatura Nueva abreviatura del equipo.
     */
    public void setAbreviatura(String abreviatura) {
        if (abreviatura != null) {
            this.Abreviatura = abreviatura;
        } else {
            System.out.println("Error, abreviatura no valida");
        }
    }

    /**
     * Obtiene el presidente del equipo.
     * 
     * @return Presidente del equipo.
     */
    public Presidente getPresidente_id() {
        return Presidente_id;
    }

    /**
     * Asigna un presidente al equipo.
     * 
     * @param presidente_id Presidente del equipo.
     */
    public void setPresidente_id(Presidente presidente_id) {
        if (presidente_id != null) {
            this.Presidente_id = presidente_id;
        } else {
            System.out.println("Error, presidente no valido");
        }
    }

    /**
     * Obtiene el entrenador del equipo.
     * 
     * @return Entrenador del equipo.
     */
    public Entrenador getEntrenador_id() {
        return Entrenador_id;
    }

    /**
     * Asigna un entrenador al equipo.
     * 
     * @param entrenador_id Entrenador del equipo.
     */
    public void setEntrenador_id(Entrenador entrenador_id) {
        if (entrenador_id != null) {
            this.Entrenador_id = entrenador_id;
        } else {
            System.out.println("Error, entrenador no valido");
        }
    }

    /**
     * Obtiene la lista de jugadores del equipo.
     * 
     * @return Lista de jugadores del equipo.
     */
    public ArrayList<Jugador> getJugadores_lista() {
        return Jugadores_lista;
    }

    /**
     * Asigna una nueva lista de jugadores al equipo.
     * 
     * @param jugadores_lista Nueva lista de jugadores.
     */
    public void setJugadores_lista(ArrayList<Jugador> jugadores_lista) {
        if (jugadores_lista != null) {
            this.Jugadores_lista = jugadores_lista;
        } else {
            System.out.println("Error, lista jugadores no valido");
        }
    }

    /**
     * Representación de los atributos del Equipo.
     * 
     * @return Cadena con los datos del equipo.
     */
    @Override
    public String toString() {
        String equipoPresidente = (Presidente_id != null) ? Presidente_id.getNombre() : "Sin Presidente";
        String equipoEntrenador = (Entrenador_id != null) ? Entrenador_id.getNombre() : "Sin Entrenador";
        return "Equipo [Nombre=" + Nombre + ", Abreviatura=" + Abreviatura + ", Presidente_id=" + equipoPresidente
                + ", Entrenador_id=" + equipoEntrenador + ", Jugadores_lista=" + Jugadores_lista + "]";
    }

}
