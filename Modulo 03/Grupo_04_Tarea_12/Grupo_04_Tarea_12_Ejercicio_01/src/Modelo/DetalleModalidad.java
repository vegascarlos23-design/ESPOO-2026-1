package Modelo;

public class DetalleModalidad {
    private String tipo_modalidad;
    private double tiempo_transito;
    private double huella_carbono;

    public DetalleModalidad(String tipo_modalidad, double tiempo_transito, double huella_carbono) {
        this.tipo_modalidad = tipo_modalidad;
        this.tiempo_transito = tiempo_transito;
        this.huella_carbono = huella_carbono;
    }

    public String getCadena() {
        return tipo_modalidad + "|" + tiempo_transito + "|" + huella_carbono;
    }

    public String getTipo_modalidad() { return tipo_modalidad; }
    public void setTipo_modalidad(String tipo_modalidad) { this.tipo_modalidad = tipo_modalidad; }
    public double getTiempo_transito() { return tiempo_transito; }
    public void setTiempo_transito(double tiempo_transito) { this.tiempo_transito = tiempo_transito; }
    public double getHuella_carbono() { return huella_carbono; }
    public void setHuella_carbono(double huella_carbono) { this.huella_carbono = huella_carbono; }
}