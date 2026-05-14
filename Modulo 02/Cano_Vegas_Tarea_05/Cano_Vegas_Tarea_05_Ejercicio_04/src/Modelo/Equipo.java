package Modelo;

public class Equipo {
    private int idEquipo;
    private String nombreEquipo;
    private String ciudadOrigen;
    private int puntosAcumulados;

    public Equipo(int idEquipo, String nombreEquipo, String ciudadOrigen) {
        this.idEquipo = idEquipo;
        this.nombreEquipo = nombreEquipo;
        this.ciudadOrigen = ciudadOrigen;
        puntosAcumulados = 0;
    }
     
    public Object[] getRegistro() {
        return new Object[]{idEquipo,nombreEquipo,ciudadOrigen,puntosAcumulados};
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public int getPuntosAcumulados() {
        return puntosAcumulados;
    }

    public void setPuntosAcumulados(int puntosAcumulados) {
        this.puntosAcumulados = puntosAcumulados;
    }
}
