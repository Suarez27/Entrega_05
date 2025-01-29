import java.util.Date;


public class Jugador {

    public String Nombre;
    public Date FechaNacimiento;
    public Posicion Posicion;
    private int Dorsal;
    public Traspaso Traspaso;
    public Formacion Formacion;

    public Jugador (String nombreJugador, Date fechaNacimientoJugador, Posicion posicionJugador, int dorsalJugador, Traspaso traspasoJugador) {
        
        Nombre = nombreJugador;
        FechaNacimiento = fechaNacimientoJugador;
        Posicion = posicionJugador;
        Dorsal = dorsalJugador;
        Traspaso = traspasoJugador;
}
}
