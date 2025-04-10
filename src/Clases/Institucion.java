package Clases;
import enums.TipoDireccion;

import java.util.ArrayList;
import java.util.List;
import java.util.GregorianCalendar;

public class Institucion {
    private int id;
    private String nombre;
    private List<String> sede;
    private Direccion direccion;
    private List<Asignacion> asignaciones;



    public Institucion() {
        this.asignaciones = new ArrayList<Asignacion>();
    }

    public Institucion(int id, String nombre, List<String> sede, List<String> asignaciones) {
        this.id = id;
        this.nombre = nombre;
        this.sede = sede;
        this.asignaciones= new ArrayList<>();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getSede() {
        return sede;
    }

    public void setSede(List<String> sede) {
        this.sede = sede;
    }

    public void addDireccion(TipoDireccion tipoDireccion, String callePrincipal, String calleSecundaria, String numeracion, String pais, String provincia, String ciudad) {
            this.direccion = new Direccion( tipoDireccion, callePrincipal, calleSecundaria, numeracion, pais, provincia, ciudad);
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void addAsignacion(Asignacion asignacion) {
        this.asignaciones.add(asignacion);
    }
    public List<Asignacion> getAsignaciones() {
        return asignaciones;
    }


    public static void  ImprimirInstitucion (Institucion institucion){
        System.out.println("Nombre: " + institucion.getNombre());
        System.out.println("Sedes: " + institucion.getSede());
        System.out.println("Dirección: " + institucion.getDireccion());

        System.out.println("Personas asignadas:");
        for ( Asignacion asignacion: institucion.getAsignaciones()){
            System.out.println("Persona:  " + asignacion.getPersona());
            System.out.println("Rol:  " + asignacion.getRol());

        }


    }

    @Override
    public String toString() {
        return "Institucion{" +
                "id: " + id +
                ", nombre: '" + nombre + '\'' +
                ", sede: " + sede +
                ", direccion: " + direccion +
                ", asignaciones: " + asignaciones +
                '}';
    }
}
