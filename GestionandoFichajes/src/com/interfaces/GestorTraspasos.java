package com.interfaces;

import com.clases.*;

public interface GestorTraspasos {
    void aprobarTraspaso(Jugador jugador, Equipo equipo);

    void rechazarTraspaso(Jugador jugador, Equipo equipo);
}
