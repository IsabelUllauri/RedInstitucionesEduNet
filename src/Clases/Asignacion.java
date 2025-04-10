package Clases;
import enums.Rol;


import java.util.GregorianCalendar;

public class Asignacion {
    private Persona persona;
    private GregorianCalendar fechaInicio;
    private Rol rol;

    public Asignacion(Persona persona, GregorianCalendar fechaInicio, Rol rol) {
        this.persona = persona;
        this.fechaInicio = fechaInicio;
        this.rol = rol;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public GregorianCalendar getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(GregorianCalendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

}
