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

    private static int totalEquipos = 0;

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
        totalEquipos++;
    }

    public void resetearEstadosTraspaso() {
        for (Jugador jugador : Jugadores_lista) {
            if (jugador.getTraspaso() == Traspaso.Rechazado_por_entrenador ||
                jugador.getTraspaso() == Traspaso.Rechazado_por_presidente) {
                jugador.setTraspaso(Traspaso.Sin_solicitar);
            }
        }
        System.out.println("Se han reseteado los estados de traspaso en el equipo " + Nombre);
    }

    public void decidirTraspasoEntrenador(Jugador jugador, boolean acepta) {
        if (jugador.getEquipo_id() != this) {
            System.out.println("Error: El entrenador de " + Nombre + " no puede decidir sobre jugadores de otro equipo.");
            return;
        }

        if (jugador.getTraspaso() == Traspaso.Solicitado) {
            jugador.setTraspaso(acepta ? Traspaso.Aprobado_por_entrenador : Traspaso.Rechazado_por_entrenador);
            System.out.println("El entrenador ha decidido el traspaso de " + jugador.getNombre() + ": " + jugador.getTraspaso());
        } else {
            System.out.println("No se puede decidir el traspaso de " + jugador.getNombre() + ", aun no ha sido solicitado.");
        }
    }

    public void decidirTraspasoPresidente(Jugador jugador, boolean acepta) {
        if (jugador.getEquipo_id() != this) {
            System.out.println("Error: El presidente de " + Nombre + " no puede decidir sobre jugadores de otro equipo.");
            return;
        }

        if (jugador.getTraspaso() == Traspaso.Aprobado_por_entrenador) {
            jugador.setTraspaso(acepta ? Traspaso.Aprobado_por_presidente : Traspaso.Rechazado_por_presidente);
            System.out.println("El presidente ha decidido el traspaso de " + jugador.getNombre() + ": " + jugador.getTraspaso());
        } else {
            System.out.println("El presidente no puede decidir el traspaso de " + jugador.getNombre() + " porque el entrenador aun no lo ha aprobado.");
        }
    }

    public void agregarJugador(Jugador jugador) {
        if (jugador != null && !Jugadores_lista.contains(jugador)) {
            Jugadores_lista.add(jugador);
            jugador.setEquipo_id(this);
        }
    }

    public void eliminarJugador(Jugador jugador) {
        if (jugador != null && Jugadores_lista.contains(jugador)) {
            Jugadores_lista.remove(jugador);
            jugador.setEquipo_id(null);
        }
    }

    public static int getTotalEquipos(){
        return totalEquipos;
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

    @Override
    public String toString() {
        String equipoPresidente = (Presidente_id != null) ? Presidente_id.getNombre() : "Sin Presidente";
        String equipoEntrenador = (Entrenador_id != null) ? Entrenador_id.getNombre() : "Sin Entrenador";
        return "Equipo [Nombre=" + Nombre + ", Abreviatura=" + Abreviatura + ", Presidente_id=" + equipoPresidente
                + ", Entrenador_id=" + equipoEntrenador + ", Jugadores_lista=" + Jugadores_lista + "]";
    }

}
