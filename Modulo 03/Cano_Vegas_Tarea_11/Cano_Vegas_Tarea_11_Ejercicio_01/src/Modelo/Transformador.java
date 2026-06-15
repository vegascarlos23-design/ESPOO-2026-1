package Modelo;

public class Transformador {
    private String codigoSerie;
    private int capacidadKva;
    private String tipoAislamiento;

    public Transformador(String codigoSerie, int capacidadKva, String tipoAislamiento) {
        this.codigoSerie = codigoSerie;
        this.capacidadKva = capacidadKva;
        this.tipoAislamiento = tipoAislamiento;
    }
    
    public Object[] getRegistro() {
        return new Object[] {codigoSerie,capacidadKva,tipoAislamiento};
    }

    public String getCodigoSerie() {
        return codigoSerie;
    }

    public void setCodigoSerie(String codigoSerie) {
        this.codigoSerie = codigoSerie;
    }

    public int getCapacidadKva() {
        return capacidadKva;
    }

    public void setCapacidadKva(int capacidadKva) {
        this.capacidadKva = capacidadKva;
    }

    public String getTipoAislamiento() {
        return tipoAislamiento;
    }

    public void setTipoAislamiento(String tipoAislamiento) {
        this.tipoAislamiento = tipoAislamiento;
    }
    
    
}
