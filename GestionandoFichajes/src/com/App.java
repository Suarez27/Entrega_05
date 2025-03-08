package com;

import com.clases.*;
import com.enums.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * Clase principal que ejecuta los objetos creados de las clases,
 * prueba las funcionalidades de la gestion de equipos y sus jugadores.
 */
public class App {
        /**
         * Genera una fecha de nacimiento a partir del año, mes y día proporcionados.
         * 
         * @param anio Año de nacimiento.
         * @param mes  Mes de nacimiento (1-12).
         * @param dia  Día de nacimiento.
         * @return Objeto {@link Date} con la fecha de nacimiento generada.
         */
        public static Date generarFechaNacimiento(int anio, int mes, int dia) {
                Calendar cal = Calendar.getInstance();
                cal.set(anio, mes - 1, dia);
                return cal.getTime();
        }

        /**
         * Método principal que ejecuta el sistema de gestión de equipos y jugadores.
         */
        public static void main(String[] args) throws Exception {
        Presidente p1 = new Presidente("43234401B", generarFechaNacimiento(2000, 2, 2), "Peru", "Joan Laporta",
                                null);
        Presidente p2 = new Presidente("34565543L", generarFechaNacimiento(2000, 2, 2), "Argentina",
                                "Florentino Pérez", null);
        Presidente p3 = new Presidente("23434456M", generarFechaNacimiento(2000, 2, 2), "Ecuador",
                                "Enrrique Cerezo Torres", null);

        Entrenador e1 = new Entrenador("Hansi Flick", generarFechaNacimiento(2000, 2, 2), "Alemania",
                                Formacion._352, null);
        Entrenador e2 = new Entrenador("Carlo Ancelotti", generarFechaNacimiento(2000, 2, 2), "Francia",
                                Formacion._333, null);
        Entrenador e3 = new Entrenador("Diego Simeone", generarFechaNacimiento(2000, 2, 2), "España",
                                Formacion._443, null);

        Equipo Team1 = new Equipo("Barcelona", "FBC", null, null, null);
        Equipo Team2 = new Equipo("RealMadrid", "RMCF", null, null, null);
        Equipo Team3 = new Equipo("AtleticoDelMadrid", "ATM", null, null, null);

        Jugador j1 = new Jugador("Tony", generarFechaNacimiento(1998, 4, 22), "Ecuador", Posicion.Delantero, 10,
                                Traspaso.Sin_solicitar, null);
        Jugador j2 = new Jugador("Messi", generarFechaNacimiento(1983, 10, 15), "Argentina", Posicion.Delantero,
                                10,
                                Traspaso.Sin_solicitar, null);
        Jugador j3 = new Jugador("Ronaldo", generarFechaNacimiento(1980, 9, 12), "España", Posicion.Delantero,
                                7,
                                Traspaso.Sin_solicitar, null);
        Jugador j4 = new Jugador("Koke", generarFechaNacimiento(1983, 4, 15), "Ecuador", Posicion.Delantero, 9,
                                Traspaso.Sin_solicitar, null);
        Jugador j5 = new Jugador("Estefano", generarFechaNacimiento(1998, 10, 22), "Peru", Posicion.Banca, 4,
                                Traspaso.Sin_solicitar, null);
        Jugador j6 = new Jugador("Dibu", generarFechaNacimiento(1980, 6, 19), "Colombia", Posicion.Portero, 1,
                                Traspaso.Sin_solicitar, null);

        ArrayList<Jugador> jugadoresBarcelona = new ArrayList<Jugador>();
        jugadoresBarcelona.add(j1);
        jugadoresBarcelona.add(j2);

        ArrayList<Jugador> jugadoresRealMadrid = new ArrayList<Jugador>();
        jugadoresRealMadrid.add(j3);
        jugadoresRealMadrid.add(j4);

        ArrayList<Jugador> jugadoresAtleti = new ArrayList<Jugador>();
        jugadoresAtleti.add(j5);
        jugadoresAtleti.add(j6);

        Team1.setPresidente_id(p1);
        Team1.setEntrenador_id(e1);
        Team1.setJugadores_lista(jugadoresBarcelona);

        Team2.setPresidente_id(p2);
        Team2.setEntrenador_id(e2);
        Team2.setJugadores_lista(jugadoresRealMadrid);

        Team3.setPresidente_id(p3);
        Team3.setEntrenador_id(e3);
        Team3.setJugadores_lista(jugadoresAtleti);

        p1.setEquipo_id(Team1);
        p2.setEquipo_id(Team2);
        p3.setEquipo_id(Team3);

        e1.setEquipo_id(Team1);
        e2.setEquipo_id(Team2);
        e3.setEquipo_id(Team3);

        j1.setEquipo_id(Team1);
        j2.setEquipo_id(Team1);
        j3.setEquipo_id(Team2);
        j4.setEquipo_id(Team2);
        j5.setEquipo_id(Team3);
        j6.setEquipo_id(Team3);

        System.out.println(Team1);
        System.out.println(p1);
        System.out.println(e1);
        System.out.println(j1);

        System.out.println();

        // -- COMPARACION DE PAIS, TRASPASOS, ELIMIACION Y AGREGACION DE JUGADORES --
        // COMPARACION DE NACINALIDADES
        System.out.println("---COMPARACION DE NACIONALIDAD DEL JUGADOR 1 CON EL JUGADOR 2---");
        j1.mismaNacionalidad(j2);

        // COMPROBACION DE INFORMACION
        System.out.println("---COMPROBACION DE INFORMACION DEL JUGADOR 1---");
        j1.mostrarInfo();

        System.out.println("---SOLICITUDES DE TRASPASOS---");
        j1.setTraspaso(Traspaso.Solicitado);
        j2.setTraspaso(Traspaso.Solicitado);
        j3.setTraspaso(Traspaso.Solicitado);
        System.out.println(j1);
        System.out.println(j2);
        System.out.println(j3);

        System.out.println();

        // DECISION DE ENTRENADOR
        System.out.println("---PROCESO DE DECISION DEL ENTRENADOR---");
        e1.aprobarTraspaso(j1, Team1);
        e1.rechazarTraspaso(j2, Team1);
        e1.aprobarTraspaso(j3, Team1);

        System.out.println();

        // DECISION DEL PRESIDENTE DE BARCELONA
        System.out.println("---PROCESO DE DECISION DEL PRESIDENTE---");
        p1.aprobarTraspaso(j1, Team1);
        p1.aprobarTraspaso(j2, Team1);

        System.out.println();

        // RESETEO DE ESTADOS DE TRASPASO
        System.out.println("---PROCESO DE RESETEO DEL EQUIPO---");
        j1.setEquipo_id(Team2);
        Team1.resetearEstadosTraspaso();
        System.out.println(j1);
        System.out.println(j2);

        System.out.println();

        // ELIMINAR Y AGREGAR A JUGADOR
        System.out.println("---PROCESO DE ELIMINACION DE JUGADOR---");
        Team1.eliminarJugador(j1);
        System.out.println(Team1);

        System.out.println();

        System.out.println("GESTIONANDO JUGADORES...");
        System.out.println("---PROCESO DE AGREGACION DE JUGADOR---");
        Team2.agregarJugador(j1);
        System.out.println(Team2);

        System.out.println();

        // CONTEO DE OBJETOS CREADOS PARA CADA CLASE
        System.out.println("Total de trabajadores creados: " + Trabajador.getTotalTrabajadores());
        System.out.println("Total de jugadores creados: " + Jugador.getTotalJugadores());
        System.out.println("Total de presidentes creados: " + Presidente.getTotalPresidentes());
        System.out.println("Total de entrenadores creados: " + Entrenador.getTotalEntrenadores());
        System.out.println("Total de equipos creados: " + Equipo.getTotalEquipos());
}
}
