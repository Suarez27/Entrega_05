import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class App {
    public static Date generarFechaNacimiento(int anio, int mes, int dia) {
        Calendar cal = Calendar.getInstance();
        cal.set(anio, mes - 1, dia);
        return cal.getTime();
    }
    public static void main(String[] args) throws Exception {
        Equipo Barcelona = new Equipo("Barcelona", "FBC");
        Equipo Real_Madrid = new Equipo("Real Madrid", "RMCF");
        Equipo Atletico_Del_Madrid = new Equipo("Atletico Del Madrid", "ATM");

        Presidente Joan_Laporta = new Presidente("43234401B", "Joan Laporta");
        Presidente Florentino_Pérez = new Presidente("34565543L", "Florentino Pérez");
        Presidente Enreique_Cerezo_Torres = new Presidente("23434456M", "ENRIQUE CEREZO TORRES");

        Entrenador Hansi_Flick = new Entrenador("Hansi Flick", Formacion._352);
        Entrenador Carlo_Ancelotti = new Entrenador("Carlo Ancelotti", Formacion._333);
        Entrenador Diego_Simeone = new Entrenador("Diego Simeone", Formacion._443);

        Jugador j1 = new Jugador("Anthony", generarFechaNacimiento(1990, 10, 15), Posicion.Delantero, 10, Traspaso.Sin_solicitar);
        Jugador j2 = new Jugador("Messi", generarFechaNacimiento(1990, 10, 15), Posicion.Delantero, 10, Traspaso.Aprobado_por_entrenador);
        Jugador j3 = new Jugador("Ronaldo", generarFechaNacimiento(1990, 10, 15), Posicion.Delantero, 7, Traspaso.Aprobado_por_presidente);
        Jugador j4 = new Jugador("Koke", generarFechaNacimiento(1990, 10, 15), Posicion.Delantero, 9, Traspaso.Rechazado_por_entrenador);
        Jugador j5 = new Jugador("Estefano", generarFechaNacimiento(1990, 10, 15), Posicion.Defensa, 4, Traspaso.Sin_solicitar);
        Jugador j6 = new Jugador("Dibu", generarFechaNacimiento(1990, 10, 15), Posicion.Portero, 1, Traspaso.Solicitado);

        System.out.println(j1);
        ArrayList<Jugador> jugadoresBarcelona = new ArrayList<Jugador>();
        jugadoresBarcelona.add(j1);
        jugadoresBarcelona.add(j2);

        ArrayList<Jugador> jugadoresRealMadrid = new ArrayList<Jugador>();
        jugadoresRealMadrid.add(j3);
        jugadoresRealMadrid.add(j4);

        ArrayList<Jugador> jugadoresAtleti = new ArrayList<Jugador>();
        jugadoresAtleti.add(j5);
        jugadoresAtleti.add(j6);
    }
}
