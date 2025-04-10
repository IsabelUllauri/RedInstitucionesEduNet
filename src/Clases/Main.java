package Clases;

import enums.Rol;
import enums.TipoDireccion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //institucion 1
        Direccion direccion1 = new Direccion(enums.TipoDireccion.INSTITUCION,"Calle vieja","Av. Solano", "1-25","Ecuador","Azuay", "Cuenca");

        Institucion institucion1  = new Institucion();
        institucion1.setId(1);
        institucion1.setNombre("Universidad Politecnica Saleciana");
        institucion1.setSede(Arrays.asList("Cuenca"));
        institucion1.addDireccion(TipoDireccion.INSTITUCION,"Calle vieja","Av. Solano", "1-25","Ecuador","Azuay", "Cuenca");

        //institucion2
        Institucion institucion2 = new Institucion();
        institucion2.setId(2);
        institucion1.setNombre("Universidad del Azuay");
        institucion1.setSede(Arrays.asList("Challuabamba"));
        institucion1.addDireccion(TipoDireccion.INSTITUCION, "Av. Pueblo Achuar", "Calle De Las Perlas", "1-75", "Ecuador","Azuay", "Cuenca");

        //personas
        Estudiante estudiante1= new Estudiante("Computacion");
        estudiante1.setNombre("Isabel");
        estudiante1.setApellido("Ullauri");
        estudiante1.setCedula("1234567890");
        estudiante1.setTelefono("0991234567");
        estudiante1.setCorreoElectronico("Isabel@ullauri.ups.ec");

        Docente docente1 = new Docente(Arrays.asList("Economia"),Arrays.asList("Tecnología"));
        docente1.setNombre("Alejandra");
        docente1.setApellido("Figueroa");
        docente1.setCedula("0987654321");
        docente1.setTelefono("0997654321");
        docente1.setCorreoElectronico("Ale@correo.com");


        Administrativo administrativo1 = new Administrativo(Arrays.asList("Asistente"), Arrays.asList("Gestión de personal", "Revisión de contratos"));
        administrativo1.setNombre("Carlos");
        administrativo1.setApellido("Ramos");
        administrativo1.setCedula("1122334455");
        administrativo1.setTelefono("0991122334");
        administrativo1.setCorreoElectronico("Carlos@correo.com");

        Visitante visitante1 = new Visitante( new GregorianCalendar(2025,GregorianCalendar.APRIL,9),new GregorianCalendar(2025, GregorianCalendar.APRIL,10),"Pago");
        administrativo1.setNombre("Raccoon");
        administrativo1.setApellido("Abad");
        administrativo1.setCedula("1122334455");
        administrativo1.setTelefono("0991122334");
        administrativo1.setCorreoElectronico("RakunA@correo.com");

        //asignarciones
        Asignacion asignacion1 = new Asignacion(estudiante1, new GregorianCalendar(), Rol.ESTUDIANTE);
        Asignacion asignacion2 = new Asignacion(docente1, new GregorianCalendar(), Rol.DOCENTE);
        Asignacion asignacion3 = new Asignacion(administrativo1, new GregorianCalendar(), Rol.ADMINISTRATIVO);
        Asignacion asignacion4 = new Asignacion(visitante1, new GregorianCalendar(), Rol.VISITANTE);


        institucion1.addAsignacion(asignacion1);
        institucion1.addAsignacion(asignacion2);
        institucion2.addAsignacion(asignacion3);
        institucion2.addAsignacion(asignacion4);

        System.out.println(" Información de Institución 1:");
        imprimirInstitucion(institucion1);

        System.out.println("\n Información de Institución 2:");
        imprimirInstitucion(institucion2);




    }

    public static void  imprimirInstitucion (Institucion institucion){
        System.out.println("Nombre: " + institucion.getNombre());
        System.out.println("Sedes: " + institucion.getSede());
        System.out.println("Dirección: " + institucion.getDireccion());

        System.out.println("Personas asignadas:");
        for ( Asignacion asignacion: institucion.getAsignaciones()){
            System.out.println("Persona:  " + asignacion.getPersona());
            System.out.println("Rol:  " + asignacion.getRol());

        }


    }
}
