package Clases;
import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correoElectronico;
    private List<Direccion> direcciones;
    private List<Institucion> instituciones;

    public Persona() {
        this.direcciones = new ArrayList<>();
        this.instituciones = new ArrayList<>();
    }

    //no ponemos entre parentesis la lista, no queremos pasar la lista de direcciones, es porque tenemos una relacion de agregacion
    public Persona(String cedula, String nombre, String apellido, String telefono, String correoElectronico) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.direcciones = new ArrayList<>();
        this.instituciones = new ArrayList<>();
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    //ir agregando la direccion una por una a la lista de direcciones
    public void addDireccion(Direccion direccion){ //parametro un objeto de tipo direccion
        this.direcciones.add(direccion);
    }

    public List<Direccion> getDirecciones() {
        return direcciones;
    }

    public void addInstitucion(Institucion institucion){
        this.instituciones.add(institucion);
    }
    public List<Institucion> getInstituciones() {
        return instituciones;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "cedula: '" + cedula + '\'' +
                ", nombre: '" + nombre + '\'' +
                ", apellido: '" + apellido + '\'' +
                ", telefono: '" + telefono + '\'' +
                ", correoElectronico: '" + correoElectronico + '\'' +
                ", direcciones: " + direcciones +
                ", instituciones: " + instituciones +
                '}';
    }
}
