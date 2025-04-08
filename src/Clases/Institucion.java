package Clases;
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

    public Institucion(int id, String nombre, List<String> sede, Direccion direccion, List<String> asignaciones) {
        this.id = id;
        this.nombre = nombre;
        this.sede = sede;
        this.direccion = direccion;
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

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public void addAsignacion(Asignacion asignacion) {
        this.asignaciones.add(asignacion);
    }
    public List<Asignacion> getAsignaciones() {
        return asignaciones;
    }

    @Override
    public String toString() {
        return "Institucion{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", sede=" + sede +
                ", direccion=" + direccion +
                ", asignaciones=" + asignaciones +
                '}';
    }
}
