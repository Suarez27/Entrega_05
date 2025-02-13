package com.clases;

import com.enums.*;
import com.clases.*;
import java.util.Date;

/**
 * Representa a un jugador de fútbol con atributos como nombre, fecha de
 * nacimiento,
 * país, posición, dorsal, estado de traspaso y el equipo al que pertenece.
 */
public class Jugador {
    private String Nombre;
    private Date FechaNacimiento;
    private String Pais;
    private Posicion Posicion;
    private int Dorsal;
    private Traspaso Traspaso;

    private Equipo Equipo_id;
    /** Contador estático para el total de jugadores creados. */
    private static int totalJugadores = 0;

    /**
     * Constructor de la clase Jugador.
     * 
     * @param nombreJugador          Nombre del jugador.
     * @param fechaNacimientoJugador Fecha de nacimiento del jugador.
     * @param paisJugador            País de origen del jugador.
     * @param posicionJugador        Posición en la que juega el jugador.
     * @param dorsalJugador          Número del dorsal del jugador.
     * @param traspasoJugador        Estado de traspaso del jugador.
     * @param equipoJugador          Equipo al que pertenece el jugador.
     */
    public Jugador(String nombreJugador, Date fechaNacimientoJugador, String paisJugador, Posicion posicionJugador,
            int dorsalJugador,
            Traspaso traspasoJugador, Equipo equipoJugador) {
        if (nombreJugador != null) {
            this.Nombre = nombreJugador;
        } else {
            System.out.println("Error: El nombre no debe ser Null");
            this.Nombre = "Desconocido";
        }
        if (fechaNacimientoJugador != null) {
            this.FechaNacimiento = fechaNacimientoJugador;
        } else {
            System.out.println("Error: La fecha no debe ser Null");
            this.FechaNacimiento = new Date();
        }

        if (paisJugador != null) {
            this.Pais = paisJugador;
        } else {
            System.out.println("Error: El pais no debe ser Null");
            this.Pais = "Desconocido";
        }

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

    /**
     * Obtiene el total de jugadores creados.
     * 
     * @return Número total de jugadores instanciados.
     */
    public static int getTotalJugadores() {
        return totalJugadores;
    }

    /**
     * Obtiene el nombre del jugador.
     * 
     * @return Nombre del jugador.
     */
    public String getNombre() {
        return this.Nombre;
    }

    /**
     * Establece el nombre del jugador.
     * 
     * @param nombre Nuevo nombre del jugador.
     */
    public void setNombre(String nombre) {
        if (nombre != null) {
            this.Nombre = nombre;
        } else {
            System.out.println("Error, nombre no valido");
        }
    }

    /**
     * Obtiene la fecha de nacimiento del jugador.
     * 
     * @return Fecha de nacimiento del jugador.
     */
    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    /**
     * Establece la fecha de nacimiento del jugador.
     * 
     * @param fechaNacimiento Nueva fecha de nacimiento del jugador.
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        if (fechaNacimiento != null) {
            this.FechaNacimiento = fechaNacimiento;
        } else {
            System.out.println("Error, fecha no valido");
        }
    }

    /**
     * Obtiene el país de origen del jugador.
     * 
     * @return País del jugador.
     */
    public String getPais() {
        return Pais;
    }

    /**
     * Establece el país de origen del jugador.
     * 
     * @param pais Nuevo país del jugador.
     */
    public void setPais(String pais) {
        if (pais != null) {
            this.Pais = pais;
        } else {
            System.out.println("Error, pais no valido");
        }
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
        return "Jugador [Nombre=" + Nombre + ", FechaNacimiento=" + FechaNacimiento + ", Pais=" + Pais + ", Posicion="
                + Posicion + ", Dorsal=" + Dorsal + ", Traspaso=" + Traspaso + ", Equipo_id=" + equipoNombre
                + "]";
    }
}
