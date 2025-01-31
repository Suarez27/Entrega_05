import java.util.Date;


public class Jugador {

    public String Nombre;
    public Date FechaNacimiento;
    public String PaisdeOrigen;
    public Posicion Posicion;
    private int Dorsal;
    public Traspaso Traspaso;
    public Formacion Formacion;

    public Jugador (String nombreJugador, Date fechaNacimientoJugador, String PaisdeOrigen ,Posicion posicionJugador, int dorsalJugador, Traspaso traspasoJugador) {
        
        Nombre = nombreJugador;
        FechaNacimiento = fechaNacimientoJugador;
        PaisdeOrigen = PaisdeOrigen;
        Posicion = posicionJugador;
        Dorsal = dorsalJugador;
        Traspaso = traspasoJugador;
}
}
