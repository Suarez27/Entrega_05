package com.clases;

import java.util.Date;
import com.interfaces.GestorTraspasos;
import com.enums.Formacion;
import com.enums.Traspaso;

/**
 * Representa a un entrenador de un equipo de fútbol.
 * Un entrenador tiene una formación táctica preferida y está asociado a un equipo.
 * Además, puede aprobar o rechazar traspasos de jugadores.
 */
public class Entrenador extends Trabajador implements GestorTraspasos {
    /** Formación táctica del entrenador. */
    private Formacion Formacion;

    /** Equipo al que pertenece el entrenador. */
    private Equipo Equipo_id;

    /** Contador estático que almacena el número total de entrenadores creados. */
    private static int totalEntrenadores = 0;

    /**
     * Constructor de la clase Entrenador.
     *
     * @param nombre_entrenador Nombre del entrenador.
     * @param fechaNacimientoEntrenador Fecha de nacimiento del entrenador.
     * @param paisEntrenador País de origen del entrenador.
     * @param formacionEntrenador Formación táctica preferida del entrenador.
     * @param equipoEntrenador Equipo al que pertenece el entrenador.
     */
    public Entrenador(String nombre_entrenador, Date fechaNacimientoEntrenador, String paisEntrenador,
                      Formacion formacionEntrenador, Equipo equipoEntrenador) {
        super(nombre_entrenador, fechaNacimientoEntrenador, paisEntrenador);
        if (formacionEntrenador != null) {
            this.Formacion = formacionEntrenador;
        } else {
            System.out.println("Error, la formación es incorrecta");
            this.Formacion = Formacion.ninguna;
        }
        this.Equipo_id = equipoEntrenador;
        totalEntrenadores++;
    }

    /**
     * Muestra información general sobre el entrenador.
     */
    @Override
    public void mostrarInfo() {
        System.out.println("Mi nombre es: " + nombre + " y soy un Entrenador.");
    }

    /**
     * Aprueba el traspaso de un jugador a un equipo determinado.
     * El entrenador solo puede aprobar traspasos de jugadores de su propio equipo.
     *
     * @param jugador Jugador cuyo traspaso será aprobado.
     * @param equipo  Equipo al que se trasladará el jugador.
     */
    @Override
    public void aprobarTraspaso(Jugador jugador, Equipo equipo) {
        if (jugador.getEquipo_id() != equipo) {
            System.out.println("Error, El entrenador no puede aprobar traspasos de jugadores de otros equipos.");
            return;
        }
        if (jugador.getTraspaso() == Traspaso.Solicitado) {
            jugador.setTraspaso(Traspaso.Aprobado_por_entrenador);
            System.out.println("El entrenador ha aprobado el traspaso de " + jugador.getNombre());
        } else {
            System.out.println("Error, No se puede aprobar el traspaso de " + jugador.getNombre() +
                    ", ya que aún no ha sido solicitado.");
        }
    }

    /**
     * Rechaza el traspaso de un jugador a un equipo determinado.
     * El entrenador solo puede rechazar traspasos de jugadores de su propio equipo.
     *
     * @param jugador Jugador cuyo traspaso será rechazado.
     * @param equipo  Equipo al que se le denegará el traspaso del jugador.
     */
    @Override
    public void rechazarTraspaso(Jugador jugador, Equipo equipo) {
        if (jugador.getEquipo_id() != equipo) {
            System.out.println("Error, El entrenador no puede rechazar traspasos de jugadores de otros equipos.");
            return;
        }
        jugador.setTraspaso(Traspaso.Rechazado_por_entrenador);
        System.out.println("El entrenador ha rechazado el traspaso de " + jugador.getNombre());
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
     * Obtiene la formación táctica del entrenador.
     *
     * @return La formación táctica del entrenador.
     */
    public Formacion getFormacion() {
        return Formacion;
    }

    /**
     * Establece una nueva formación táctica para el entrenador.
     *
     * @param formacion Nueva formación táctica del entrenador.
     */
    public void setFormacion(Formacion formacion) {
        if (formacion != null) {
            this.Formacion = formacion;
        } else {
            System.out.println("Error, Formación no válida.");
        }
    }

    /**
     * Obtiene el equipo al que pertenece el entrenador.
     *
     * @return El equipo del entrenador.
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
            System.out.println("Error, Equipo no válido.");
        }
    }

    /**
     * Representa la información del entrenador en una cadena de texto.
     *
     * @return Cadena con los datos del entrenador.
     */
    @Override
    public String toString() {
        String entrenadorEquipo = (Equipo_id != null) ? Equipo_id.getNombre() : "Sin equipo";
        return "Entrenador [Formacion=" + Formacion + ", Equipo_id=" + entrenadorEquipo + ", Nombre=" + getNombre()
                + ", FechaNacimiento=" + getFechaNacimientoTrabajador() + ", PaisOrigen=" + getPaisOrigen() + "]";
    }
}
