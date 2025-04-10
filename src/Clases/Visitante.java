package Clases;
import java.util.GregorianCalendar;

public class Visitante extends Persona {
    private GregorianCalendar fechaEntrada;
    private GregorianCalendar fechaSalida;
    private String motivo;

    public Visitante(GregorianCalendar fechaEntrada, GregorianCalendar fechaSalida, String motivo) {
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.motivo = motivo;
    }

    public GregorianCalendar getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(GregorianCalendar fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public GregorianCalendar getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(GregorianCalendar fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    @Override
    public String toString() {
        return "Visitante{" +
                "fechaEntrada: " + fechaEntrada +
                ", fechaSalida: " + fechaSalida +
                ", motivo: '" + motivo + '\'' +
                '}';
    }
}
