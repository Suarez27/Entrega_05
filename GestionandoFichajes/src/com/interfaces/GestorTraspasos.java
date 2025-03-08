package com.interfaces;

import com.clases.Jugador;
import com.clases.Equipo;

/**
 * Interfaz que define la funcionalidad para gestionar traspasos de jugadores.
 * Es implementada por clases que pueden aprobar o rechazar traspasos, 
 * como {@link com.clases.Entrenador} y {@link com.clases.Presidente}.
 */
public interface GestorTraspasos {

    /**
     * Aprueba el traspaso de un jugador a un equipo determinado.
     *
     * @param jugador El jugador cuyo traspaso será aprobado.
     * @param equipo  El equipo al que se trasladará el jugador.
     */
    void aprobarTraspaso(Jugador jugador, Equipo equipo);

    /**
     * Rechaza el traspaso de un jugador a un equipo determinado.
     *
     * @param jugador El jugador cuyo traspaso será rechazado.
     * @param equipo  El equipo al que se le denegará el traspaso del jugador.
     */
    void rechazarTraspaso(Jugador jugador, Equipo equipo);
}

