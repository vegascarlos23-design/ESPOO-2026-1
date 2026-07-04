package Modelo;

public class Repartidor {
    private String idRepartidor;
    private double ubicacionX;
    private double ubicacionY;
    private boolean disponible;

    public Repartidor(String idRepartidor, double ubicacionX, double ubicacionY) {
        this.idRepartidor = idRepartidor;
        this.ubicacionX = ubicacionX;
        this.ubicacionY = ubicacionY;
        disponible = true;
    }

    public Object[] getRegistro() {
        String estado = (disponible == true) ? "Disponible" : "No Disponible";
        return new Object[]{idRepartidor,ubicacionX,ubicacionY, estado};
    }
    
    public String getIdRepartidor() {
        return idRepartidor;
    }

    public void setIdRepartidor(String idRepartidor) {
        this.idRepartidor = idRepartidor;
    }

    public double getUbicacionX() {
        return ubicacionX;
    }

    public void setUbicacionX(double ubicacionX) {
        this.ubicacionX = ubicacionX;
    }

    public double getUbicacionY() {
        return ubicacionY;
    }

    public void setUbicacionY(double ubicacionY) {
        this.ubicacionY = ubicacionY;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    
}
