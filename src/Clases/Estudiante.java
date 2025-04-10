package Clases;

public class Estudiante extends Persona{
    private String carrera;

    public Estudiante(String carrera) {
        super();
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "carrera: '" + carrera + '\'' +
                '}';
    }
}
