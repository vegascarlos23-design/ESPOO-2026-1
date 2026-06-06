package Modelo;

public class Servidor {
    private int ipNumerica;
    private String nombreServidor;
    private String centroDatos;
    private double consumoRamGB;

    public Servidor(int ipNumerica, String nombreServidor, String genero, double consumoRamGB) {
        this.ipNumerica = ipNumerica;
        this.nombreServidor = nombreServidor;
        this.centroDatos = genero;
        this.consumoRamGB = consumoRamGB;
    }
    
    public Object[] getRegistro() {
        return new Object[]{ipNumerica,nombreServidor,centroDatos,consumoRamGB};
    }

    public int getIpNumerica() {
        return ipNumerica;
    }

    public void setIpNumerica(int ipNumerica) {
        this.ipNumerica = ipNumerica;
    }

    public String getNombreServidor() {
        return nombreServidor;
    }

    public void setNombreServidor(String nombreServidor) {
        this.nombreServidor = nombreServidor;
    }

    public String getCentroDatos() {
        return centroDatos;
    }

    public void setCentroDatos(String centroDatos) {
        this.centroDatos = centroDatos;
    }

    public double getConsumoRamGB() {
        return consumoRamGB;
    }

    public void setConsumoRamGB(double consumoRamGB) {
        this.consumoRamGB = consumoRamGB;
    }
}
