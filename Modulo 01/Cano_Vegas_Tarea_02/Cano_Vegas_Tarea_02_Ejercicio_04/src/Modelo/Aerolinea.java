package Modelo;

import Control.ArregloVuelos;

public class Aerolinea {

    private int Id;
    private String nombreArelinea;
    private String ruc;
    private String razonSocial;
    private String pais;
    private ArregloVuelos arregloVuelos;

    public Aerolinea(int Id, String nombreArelinea, String ruc, String razonSocial, String pais) {
        this.Id = Id;
        this.nombreArelinea = nombreArelinea;
        this.ruc = ruc;
        this.razonSocial = razonSocial;
        this.pais = pais;
        this.arregloVuelos = new ArregloVuelos();
    }
    
    public Object[] getRegistro() {
        return new Object[]{Id,nombreArelinea,ruc,razonSocial,pais};
    }

    public String getNombreArelinea() {
        return nombreArelinea;
    }

    public void setNombreArelinea(String nombreArelinea) {
        this.nombreArelinea = nombreArelinea;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public ArregloVuelos getArregloVuelos() {
        return arregloVuelos;
    }

    public void setArregloVuelos(ArregloVuelos arregloVuelos) {
        this.arregloVuelos = arregloVuelos;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    

    
}
