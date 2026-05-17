package Modelo;

public class Contenedor {
    private int idContenedor;
    private int peso;
    private String contenido;
    private String paisOrigen;

    public Contenedor(int peso, String contenido, String paisOrigen) {
        this.peso = peso;
        this.contenido = contenido;
        this.paisOrigen = paisOrigen;
    }
    
    public Object[] getRegistro() {
        return new Object[]{idContenedor,peso,contenido,paisOrigen};
    }

    public int getIdContenedor() {
        return idContenedor;
    }

    public void setIdContenedor(int idContenedor) {
        this.idContenedor = idContenedor;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    
    
}
