package Modelo;

public class PoliticaSeguridad {
    private String idRegla;
    private int nivelEncriptacion;
    private String protocolo;

    public PoliticaSeguridad(String idRegla, int nivelEncriptacion, String protocolo) {
        this.idRegla = idRegla;
        this.nivelEncriptacion = nivelEncriptacion;
        this.protocolo = protocolo;
    }

    public Object[] getRegistro() {
        return new Object[]{idRegla,nivelEncriptacion,protocolo};
    }
    
    public String getIdRegla() {
        return idRegla;
    }

    public void setIdRegla(String matricula) {
        this.idRegla = matricula;
    }

    public int getNivelEncriptacion() {
        return nivelEncriptacion;
    }

    public void setNivelEncriptacion(int nivelEncriptacion) {
        this.nivelEncriptacion = nivelEncriptacion;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setCargaMaximaKg(String protocolo) {
        this.protocolo = protocolo;
    }
    
    
}
