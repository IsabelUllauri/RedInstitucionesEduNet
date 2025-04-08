package Clases;

import enums.TipoDireccion;

public class Direccion {
    private TipoDireccion tipoDireccion;
    private String callePrincipal;
    private String calleSecundaria;
    private String numeracion;
    private String pais;
    private String provincia;
    private String ciudad;

    public Direccion() {

    }

    public Direccion(TipoDireccion tipoDireccion, String callePrincipal, String calleSecundaria, String numeracion, String pais, String provincia, String ciudad) {
        this.tipoDireccion = tipoDireccion;
        this.callePrincipal = callePrincipal;
        this.calleSecundaria = calleSecundaria;
        this.numeracion = numeracion;
        this.pais = pais;
        this.provincia = provincia;
        this.ciudad = ciudad;
    }

    public String getCallePrincipal() {
        return callePrincipal;
    }

    public void setCallePrincipal(String callePrincipal) {
        this.callePrincipal = callePrincipal;
    }

    public String getCalleSecundaria() {
        return calleSecundaria;
    }

    public void setCalleSecundaria(String calleSecundaria) {
        this.calleSecundaria = calleSecundaria;
    }

    public String getNumeracion() {
        return numeracion;
    }

    public void setNumeracion(String numeracion) {
        this.numeracion = numeracion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public TipoDireccion getTipoDireccion() {
        return tipoDireccion;
    }

    public void setTipoDireccion(TipoDireccion tipoDireccion) {
        this.tipoDireccion = tipoDireccion;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "tipoDireccion=" + tipoDireccion +
                ", callePrincipal='" + callePrincipal + '\'' +
                ", calleSecundaria='" + calleSecundaria + '\'' +
                ", numeracion='" + numeracion + '\'' +
                ", pais='" + pais + '\'' +
                ", provincia='" + provincia + '\'' +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }
}
