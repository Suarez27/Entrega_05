package com.clases;

import com.enums.Traspaso;
import java.util.Date;
import com.interfaces.GestorTraspasos;

/**
 * Representa a un presidente de un equipo de fútbol.
 * Un presidente tiene un DNI y está asociado a un equipo. 
 * Además, puede aprobar o rechazar traspasos de jugadores.
 */
public class Presidente extends Trabajador implements GestorTraspasos {
    /** DNI del presidente. */
    private String DNI;

    /** Equipo al que pertenece el presidente. */
    private Equipo Equipo_id;

    /** Contador estático que almacena el número total de presidentes creados. */
    private static int totalPresidentes = 0;

    /**
     * Constructor de la clase Presidente.
     *
     * @param dni_presidente DNI del presidente.
     * @param fechaNacimientoPresidente Fecha de nacimiento del presidente.
     * @param paisPresidente País de origen del presidente.
     * @param nombre_presidente Nombre del presidente.
     * @param equipo_presidente Equipo al que pertenece el presidente.
     */
    public Presidente(String dni_presidente, Date fechaNacimientoPresidente, String paisPresidente,
                      String nombre_presidente, Equipo equipo_presidente) {
        super(nombre_presidente, fechaNacimientoPresidente, paisPresidente);
        if (dni_presidente != null) {
            this.DNI = dni_presidente;
        } else {
            System.out.println("Error, El DNI no debe ser nulo.");
            this.DNI = "Desconocido";
        }
        this.Equipo_id = equipo_presidente;
        totalPresidentes++;
    }

    /**
     * Muestra información general sobre el presidente.
     */
    @Override
    public void mostrarInfo() {
        System.out.println("Mi nombre es " + nombre + " y soy un Presidente.");
    }

    /**
     * Aprueba el traspaso de un jugador a un equipo determinado.
     * El presidente solo puede aprobar traspasos que ya fueron aprobados por el entrenador.
     *
     * @param jugador Jugador cuyo traspaso será aprobado.
     * @param equipo  Equipo al que se trasladará el jugador.
     */
    @Override
    public void aprobarTraspaso(Jugador jugador, Equipo equipo) {
        if (jugador.getEquipo_id() != equipo) {
            System.out.println("Error, El presidente no puede aprobar traspasos de jugadores de otros equipos.");
            return;
        }

        if (jugador.getTraspaso() == Traspaso.Aprobado_por_entrenador) {
            jugador.setTraspaso(Traspaso.Aprobado_por_presidente);
            System.out.println("El presidente ha aprobado el traspaso de " + jugador.getNombre());
        } else {
            System.out.println("Error, El presidente no puede aprobar el traspaso de " + jugador.getNombre() +
                    " porque el entrenador aún no lo ha aprobado.");
        }
    }

    /**
     * Rechaza el traspaso de un jugador a un equipo determinado.
     * El presidente solo puede rechazar traspasos de jugadores de su propio equipo.
     *
     * @param jugador Jugador cuyo traspaso será rechazado.
     * @param equipo  Equipo al que se le denegará el traspaso del jugador.
     */
    @Override
    public void rechazarTraspaso(Jugador jugador, Equipo equipo) {
        if (jugador.getEquipo_id() != equipo) {
            System.out.println("Error, El presidente no puede rechazar traspasos de jugadores de otros equipos.");
            return;
        }

        jugador.setTraspaso(Traspaso.Rechazado_por_presidente);
        System.out.println("El presidente ha rechazado el traspaso de " + jugador.getNombre());
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
     * Establece un nuevo DNI para el presidente.
     *
     * @param dni Nuevo DNI del presidente.
     */
    public void setDNI(String dni) {
        if (dni != null) {
            this.DNI = dni;
        } else {
            System.out.println("Error, DNI no válido.");
        }
    }

    /**
     * Obtiene el equipo al que pertenece el presidente.
     *
     * @return El equipo del presidente.
     */
    public Equipo getEquipo_id() {
        return Equipo_id;
    }

    /**
     * Asigna un equipo al presidente.
     *
     * @param equipo_id Nuevo equipo del presidente.
     */
    public void setEquipo_id(Equipo equipo_id) {
        if (equipo_id != null) {
            this.Equipo_id = equipo_id;
        } else {
            System.out.println("Error, Equipo no válido.");
        }
    }

    /**
     * Representa la información del presidente en una cadena de texto.
     *
     * @return Cadena con los datos del presidente.
     */
    @Override
    public String toString() {
        String presidenteEquipo = (Equipo_id != null) ? Equipo_id.getNombre() : "Sin equipo";
        return "Presidente [DNI=" + DNI + ", Equipo_id=" + presidenteEquipo + ", Nombre=" + getNombre()
                + ", FechaNacimiento=" + getFechaNacimientoTrabajador() + ", PaisOrigen=" + getPaisOrigen() + "]";
    }
}
