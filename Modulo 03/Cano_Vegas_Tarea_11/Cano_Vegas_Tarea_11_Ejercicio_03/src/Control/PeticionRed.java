package Control;

public class PeticionRed {
    private NodoMicroservicio destino;
    private double latenciaMs;
    private double cargaDatosKb;

    public PeticionRed(NodoMicroservicio destino, double consumoBateria, double distanciaLinealM) {
        this.destino = destino;
        this.latenciaMs = consumoBateria;
        this.cargaDatosKb = distanciaLinealM;
    }
    
    public NodoMicroservicio getDestino() {
        return destino;
    }

    public void setDestino(NodoMicroservicio destino) {
        this.destino = destino;
    }

    public double getLatenciaMs() {
        return latenciaMs;
    }

    public void setLatenciaMs(double latenciaMs) {
        this.latenciaMs = latenciaMs;
    }

    public double getCargaDatosKb() {
        return cargaDatosKb;
    }

    public void setCargaDatosKb(double cargaDatosKb) {
        this.cargaDatosKb = cargaDatosKb;
    }
}
