package Modelo;

public class Dispositivo {
    private String id;
    private String tipo;
    private boolean estado;
    private double consumoWats;

    public Dispositivo(String id, String tipo, double consumoWats) {
        this.id = id;
        this.tipo = tipo;
        this.consumoWats = consumoWats;
        estado = false;
    }
    
    public Object[] getRegistro() {
        String estadoEncendido = (estado == true ? "Encendido" : "Apagado");
        return new Object[]{id,tipo,estadoEncendido,consumoWats};
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getConsumoWats() {
        return consumoWats;
    }

    public void setConsumoWats(double consumoWats) {
        this.consumoWats = consumoWats;
    }
    
    
}
