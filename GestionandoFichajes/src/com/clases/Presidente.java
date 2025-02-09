package com.clases;

import com.enums.*;
import com.clases.*;

public class Presidente {
    private String DNI;
    private String Nombre;

    private Equipo Equipo_id;
    
    public Presidente (String dni_presidente, String nombre_presidente, Equipo equipo_presidente){
        if (dni_presidente != null) {
            this.DNI = dni_presidente;
        } else {
            System.out.println("Error: El dni no debe ser Null");
            this.DNI = "Desconocido";
        }

        if (nombre_presidente != null) {
            this.Nombre = nombre_presidente;
        } else {
            System.out.println("Error: El nombre no debe ser Null");
            this.Nombre = "Desconocido";
        }
    }
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String dni) {
        if (dni != null) {
            this.DNI = dni;
        } else {
            System.out.println("Error, DNI no valido");
        }
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

    public Equipo getEquipo_id() {
        return Equipo_id;
    }

    public void setEquipo_id(Equipo equipo_id) {
        if (equipo_id != null) {
            this.Equipo_id = equipo_id;
        } else {
            System.out.println("Error, equipo no valido");
        }
    }


}
    

