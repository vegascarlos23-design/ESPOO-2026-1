package Modelo;

public class Mensaje {
    private String texto;
    private boolean enviado;

    public Mensaje(String texto) {
        this.texto = texto;
        enviado = false;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean isEnviado() {
        return enviado;
    }

    public void setEnviado(boolean enviado) {
        this.enviado = enviado;
    } 
}
