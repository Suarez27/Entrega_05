package com.clases;
import com.enums.*;
import java.util.Date;
import com.clases.*;
import com.interfaces.*;
/**
 * Representa a un presidente de un equipo de fútbol con atributos como DNI,
 * nombre y el equipo al que pertenece.
 */
public class Presidente extends Trabajador implements GestorTraspasos{
    private String DNI;
    private Equipo Equipo_id;
    /** Contador estático para el total de presidentes creados. */
    private static int totalPresidentes = 0;

    /**
     * Constructor de la clase Presidente.
     * 
     * @param dni_presidente    DNI del presidente.
     * @param equipo_presidente Equipo del presidente.
     */
    
    public Presidente(String dni_presidente, Date fechaNacimientoPresidente, String paisEntrenador,
    String nombre_presidente, Equipo equipo_presidente) {
        super(nombre_presidente, fechaNacimientoPresidente, paisEntrenador);
        if (dni_presidente != null) {
            this.DNI = dni_presidente;
        } else {
            System.out.println("Error: El dni no debe ser Null");
            this.DNI = "Desconocido";
        }

        totalPresidentes++;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Mi nombres es: " + nombre + " Soy un Presidente");
    }
    @Override
    public void aprobarTraspaso(Jugador jugador, Equipo equipo) {
        if (jugador.getEquipo_id() != equipo) {
            System.out.println("Error, el presidente no puede aprobar traspasos de jugadores de otros equipos.");
            return;
        }

        if (jugador.getTraspaso() == Traspaso.Aprobado_por_entrenador) {
            jugador.setTraspaso(Traspaso.Aprobado_por_presidente);
            System.out.println(
                    "El presidente ha decidido el traspaso de " + jugador.getNombre() + ": " + jugador.getTraspaso());
        } else {
            System.out.println("Error, el presidente no puede aprobar el traspaso de " + jugador.getNombre() +
                    " porque el entrenador aún no lo ha aprobado");
        }
    }

    @Override
    public void rechazarTraspaso(Jugador jugador, Equipo equipo) {
        if (jugador.getEquipo_id() != equipo) {
            System.out.println("Error, el presidente no puede rechazar traspasos de jugadores de otros equipos.");
            return;
        }

        jugador.setTraspaso(Traspaso.Rechazado_por_presidente);
        System.out.println("Error, el presidente ha rechazado el traspaso de " + jugador.getNombre());
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
     * Establece el DNI del presidente.
     * 
     * @param dni Nuevo DNI del presidente.
     */
    public void setDNI(String dni) {
        if (dni != null) {
            this.DNI = dni;
        } else {
            System.out.println("Error, DNI no valido");
        }
    }

      /**
     * Obtiene el equipo al que pertenece el presidente.
     * 
     * @return Equipo del presidente.
     */

    public Equipo getEquipo_id() {
        return Equipo_id;
    }

    /**
     * Establece el equipo del presidente.
     * 
     * @param equipo_id Nuevo equipo del presidente.
     */
    public void setEquipo_id(Equipo equipo_id) {
        if (equipo_id != null) {
            this.Equipo_id = equipo_id;
        } else {
            System.out.println("Error, equipo no valido");
        }
    }

    /**
     * Representación de los atributos del Presidente.
     * 
     * @return Cadena con los datos del presidente.
     */
    
    @Override
    public String toString() {
        String presidenteEquipo = (Equipo_id != null) ? Equipo_id.getNombre() : "Sin equipo";
        return "Presidente [DNI=" + DNI + ", Equipo_id=" + presidenteEquipo + ", Nombre=" + getNombre()
                + ", FechaNacimientoTrabajador=" + getFechaNacimientoTrabajador() + ", PaisOrigen="
                + getPaisOrigen() + "]";
    }


}
