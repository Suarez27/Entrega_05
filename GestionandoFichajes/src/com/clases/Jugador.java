package com.clases;

import java.util.Date;
import com.enums.*;

/**
 * Representa a un jugador de fútbol con atributos como nombre, fecha de
 * nacimiento,
 * país, posición, dorsal, estado de traspaso y el equipo al que pertenece.
 */
public class Jugador extends Trabajador {
    
    private Posicion Posicion;
    private int Dorsal;
    private Traspaso Traspaso;

    private Equipo Equipo_id;
    /** Contador estático para el total de jugadores creados. */
    private static int totalJugadores = 0;

    /**
     * Constructor de la clase Jugador.
     * 
     * @param posicionJugador        Posición en la que juega el jugador.
     * @param dorsalJugador          Número del dorsal del jugador.
     * @param traspasoJugador        Estado de traspaso del jugador.
     * @param equipoJugador          Equipo al que pertenece el jugador.
     */

    public Jugador(String nombreJugador, Date fechaNacimientoJugador, String paisJugador, Posicion posicionJugador,
            int dorsalJugador,
            Traspaso traspasoJugador, Equipo equipoJugador) {
            super(nombreJugador, fechaNacimientoJugador, paisJugador);

            
        if (posicionJugador != null) {
            this.Posicion = posicionJugador;
        } else {
            System.out.println("Error: La posicion no debe ser Null");
            this.Posicion = Posicion.Banca;
        }

        if (dorsalJugador >= 1) {
            this.Dorsal = dorsalJugador;
        } else {
            System.out.println("Error: El dorsal no debe ser Null");
            this.Dorsal = 0;
        }

        if (traspasoJugador != null) {
            this.Traspaso = traspasoJugador;
        } else {
            System.out.println("Error: El traspaso no debe ser Null");
            this.Traspaso = Traspaso.Sin_solicitar;
        }
        totalJugadores++;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Mi nombres es: " + nombre + " Soy un Jugador");
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
     * @return Posición del jugador.
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
            System.out.println("Error, posicion no valida");
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
     * Establece el dorsal del jugador. No puede ser menor a 1.
     * 
     * @param dorsal Nuevo número de dorsal.
     */
    public void setDorsal(int dorsal) {
        if (dorsal >= 1) {
            this.Dorsal = dorsal;
        } else {
            System.out.println("Error, dorsal no valido");
        }
    }

    /**
     * Obtiene el estado de traspaso del jugador.
     * 
     * @return Estado de traspaso del jugador.
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
            System.out.println("Error, traspaso no valido");
        }
    }

    /**
     * Obtiene el equipo al que pertenece el jugador.
     * 
     * @return Equipo del jugador.
     */
    public Equipo getEquipo_id() {
        return Equipo_id;
    }

    /**
     * Establece el equipo del jugador.
     * 
     * @param equipo_id Nuevo equipo del jugador.
     */
    public void setEquipo_id(Equipo equipo_id) {
        if (equipo_id != null) {
            this.Equipo_id = equipo_id;
        } else {
            System.out.println("No puede ser nulo");
        }
    }

    /**
     * Representación de los atributos del Jugador.
     * 
     * @return Cadena con los datos del jugador.
     */
    
    @Override
    public String toString() {
        String equipoNombre = (Equipo_id != null) ? Equipo_id.getNombre() : "Sin equipo";
        return "Jugador [Posicion=" + Posicion + ", Dorsal=" + Dorsal + ", Traspaso=" + Traspaso + ", Equipo_id="
                + equipoNombre + ", Nombre=" + getNombre() + ", FechaNacimientoTrabajador="
                + getFechaNacimientoTrabajador() + ", PaisOrigen=" + getPaisOrigen() + "]";
    }
}
