package Control;

public class RutaAerea {
    private NodoHelipuerto destino;
    private int consumoBateria;
    private double distanciaLinealM;

    public RutaAerea(NodoHelipuerto destino, int consumoBateria, double distanciaLinealM) {
        this.destino = destino;
        this.consumoBateria = consumoBateria;
        this.distanciaLinealM = distanciaLinealM;
    }
    
    
    
    public NodoHelipuerto getDestino() {
        return destino;
    }

    public void setDestino(NodoHelipuerto destino) {
        this.destino = destino;
    }

    public int getConsumoBateria() {
        return consumoBateria;
    }

    public void setConsumoBateria(int consumoBateria) {
        this.consumoBateria = consumoBateria;
    }

    public double getDistanciaLinealM() {
        return distanciaLinealM;
    }

    public void setDistanciaLinealM(double distanciaLinealM) {
        this.distanciaLinealM = distanciaLinealM;
    }
    
    
}
