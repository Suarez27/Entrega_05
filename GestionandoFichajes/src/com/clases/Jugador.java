package com.clases;

import com.enums.*;
import com.clases.*;
import java.util.Date;

public class Jugador {
    private String Nombre;
    private Date FechaNacimiento;
    private String Pais;
    private Posicion Posicion;
    private int Dorsal;
    private Traspaso Traspaso;

    private Equipo Equipo_id;

    private static int totalJugadores = 0;

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

    public static int getTotalJugadores() {
        return totalJugadores;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null) {
            this.Nombre = nombre;
        } else {
            System.out.println("Error, nombre no valido");
        }
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        if (fechaNacimiento != null) {
            this.FechaNacimiento = fechaNacimiento;
        } else {
            System.out.println("Error, fecha no valido");
        }
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        if (pais != null) {
            this.Pais = pais;
        } else {
            System.out.println("Error, pais no valido");
        }
    }

    public Posicion getPosicion() {
        return Posicion;
    }

    public void setPosicion(Posicion posicion) {
        if (posicion != null) {
            this.Posicion = posicion;
        } else {
            System.out.println("Error, posicion no valida");
        }
    }

    public int getDorsal() {
        return Dorsal;
    }

    public void setDorsal(int dorsal) {
        if (dorsal >= 1) {
            this.Dorsal = dorsal;
        } else {
            System.out.println("Error, dorsal no valido");
        }
    }

    public Traspaso getTraspaso() {
        return Traspaso;
    }

    public void setTraspaso(Traspaso traspaso) {
        if (traspaso != null) {
            this.Traspaso = traspaso;
        } else {
            System.out.println("Error, traspaso no valido");
        }
    }

    public Equipo getEquipo_id() {
        return Equipo_id;
    }

    public void setEquipo_id(Equipo equipo_id) {
        if (equipo_id != null) {
            this.Equipo_id = equipo_id;
        } else {
            System.out.println("No puede ser nulo");
        }
    }

    @Override
    public String toString() {
        String equipoNombre = (Equipo_id != null) ? Equipo_id.getNombre() : "Sin equipo";
        return "Jugador [Nombre=" + Nombre + ", FechaNacimiento=" + FechaNacimiento + ", Pais=" + Pais + ", Posicion="
                + Posicion + ", Dorsal=" + Dorsal + ", Traspaso=" + Traspaso + ", Equipo_id=" + equipoNombre
                + "]";
    }
}
