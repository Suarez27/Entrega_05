package com.clases;

import java.util.Date;
import com.enums.Posicion;
import com.enums.Traspaso;

/**
 * Representa a un jugador de fútbol con atributos como nombre, fecha de
 * nacimiento, país, posición, dorsal, estado de traspaso y el equipo al que pertenece.
 */
public class Jugador extends Trabajador {
    
    /** Posición en la que juega el jugador. */
    private Posicion Posicion;

    /** Número del dorsal del jugador. */
    private int Dorsal;

    /** Estado actual del traspaso del jugador. */
    private Traspaso Traspaso;

    /** Equipo al que pertenece el jugador. */
    private Equipo Equipo_id;

    /** Contador estático que almacena el número total de jugadores creados. */
    private static int totalJugadores = 0;

    /**
     * Constructor de la clase Jugador.
     * 
     * @param nombreJugador Nombre del jugador.
     * @param fechaNacimientoJugador Fecha de nacimiento del jugador.
     * @param paisJugador País de origen del jugador.
     * @param posicionJugador Posición en la que juega el jugador.
     * @param dorsalJugador Número del dorsal del jugador.
     * @param traspasoJugador Estado de traspaso del jugador.
     * @param equipoJugador Equipo al que pertenece el jugador.
     */
    public Jugador(String nombreJugador, Date fechaNacimientoJugador, String paisJugador, Posicion posicionJugador,
                   int dorsalJugador, Traspaso traspasoJugador, Equipo equipoJugador) {
        super(nombreJugador, fechaNacimientoJugador, paisJugador);

        if (posicionJugador != null) {
            this.Posicion = posicionJugador;
        } else {
            System.out.println("Error, La posición no debe ser nula.");
            this.Posicion = Posicion.Banca;
        }

        if (dorsalJugador >= 1) {
            this.Dorsal = dorsalJugador;
        } else {
            System.out.println("Error, El dorsal debe ser mayor o igual a 1.");
            this.Dorsal = 0;
        }

        if (traspasoJugador != null) {
            this.Traspaso = traspasoJugador;
        } else {
            System.out.println("Error, El estado de traspaso no debe ser nulo.");
            this.Traspaso = Traspaso.Sin_solicitar;
        }

        this.Equipo_id = equipoJugador;
        totalJugadores++;
    }

    /**
     * Muestra información general sobre el jugador.
     */
    @Override
    public void mostrarInfo() {
        System.out.println("Mi nombre es: " + nombre + " y soy un Jugador.");
    }

    /**
     * Obtiene el total de jugadores creados.
     *
     * @return Número total de jugadores instanciados.
     */
    public static int getTotalJugadores() {
        return totalJugadores;
    }

    /**
     * Obtiene la posición en la que juega el jugador.
     *
     * @return La posición del jugador.
     */
    public Posicion getPosicion() {
        return Posicion;
    }

    /**
     * Establece la posición en la que juega el jugador.
     *
     * @param posicion Nueva posición del jugador.
     */
    public void setPosicion(Posicion posicion) {
        if (posicion != null) {
            this.Posicion = posicion;
        } else {
            System.out.println("Error, Posición no válida.");
        }
    }

    /**
     * Obtiene el dorsal del jugador.
     *
     * @return Número del dorsal del jugador.
     */
    public int getDorsal() {
        return Dorsal;
    }

    /**
     * Establece el dorsal del jugador. Debe ser mayor o igual a 1.
     *
     * @param dorsal Nuevo número de dorsal del jugador.
     */
    public void setDorsal(int dorsal) {
        if (dorsal >= 1) {
            this.Dorsal = dorsal;
        } else {
            System.out.println("Error, Dorsal no válido.");
        }
    }

    /**
     * Obtiene el estado de traspaso del jugador.
     *
     * @return El estado de traspaso del jugador.
     */
    public Traspaso getTraspaso() {
        return Traspaso;
    }

    /**
     * Establece el estado de traspaso del jugador.
     *
     * @param traspaso Nuevo estado de traspaso del jugador.
     */
    public void setTraspaso(Traspaso traspaso) {
        if (traspaso != null) {
            this.Traspaso = traspaso;
        } else {
            System.out.println("Error, Estado de traspaso no válido.");
        }
    }

    /**
     * Obtiene el equipo al que pertenece el jugador.
     *
     * @return El equipo del jugador.
     */
    public Equipo getEquipo_id() {
        return Equipo_id;
    }

    /**
     * Asigna un equipo al jugador.
     *
     * @param equipo_id Nuevo equipo del jugador.
     */
    public void setEquipo_id(Equipo equipo_id) {
        if (equipo_id != null) {
            this.Equipo_id = equipo_id;
        } else {
            System.out.println("Error, El equipo no puede ser nulo.");
        }
    }

    /**
     * Representa la información del jugador en una cadena de texto.
     *
     * @return Cadena con los datos del jugador.
     */
    @Override
    public String toString() {
        String equipoNombre = (Equipo_id != null) ? Equipo_id.getNombre() : "Sin equipo";
        return "Jugador [Posicion=" + Posicion + ", Dorsal=" + Dorsal + ", Traspaso=" + Traspaso + ", Equipo_id="
                + equipoNombre + ", Nombre=" + getNombre() + ", FechaNacimiento=" + getFechaNacimientoTrabajador()
                + ", PaisOrigen=" + getPaisOrigen() + "]";
    }
}
