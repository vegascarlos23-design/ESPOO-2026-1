package Modelo;

public class Vuelo {
    private int IdAerolinea;
    private int numeroVuelo;
    private String ciudadDestino;
    private String estado;
    private Aerolinea aerolinea;

    public Vuelo(int IdAerolinea, int numeroVuelo, String ciudadDestino, String estado, Aerolinea aerolinea) {
        this.IdAerolinea = IdAerolinea;
        this.numeroVuelo = numeroVuelo;
        this.ciudadDestino = ciudadDestino;
        this.estado = estado;
        this.aerolinea = aerolinea;
    }

    public Object[] getRegistro() {
        return new Object[]{IdAerolinea,numeroVuelo,ciudadDestino,estado};
    }
    
    public int getIdAerolinea() {
        return IdAerolinea;
    }

    public void setIdAerolinea(int IdAerolinea) {
        this.IdAerolinea = IdAerolinea;
    }

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Aerolinea getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(Aerolinea aerolinea) {
        this.aerolinea = aerolinea;
    }
}
