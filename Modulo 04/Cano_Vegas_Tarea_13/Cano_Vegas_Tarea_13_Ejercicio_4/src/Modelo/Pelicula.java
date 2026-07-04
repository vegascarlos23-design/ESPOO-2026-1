package Modelo;

import java.util.ArrayList;

public class Pelicula {

    private String idPelicula;
    private String titulo;
    private String genero;
    private ArrayList<String> elenco;

    public Pelicula(String idPelicula, String titulo, String genero) {
        this.idPelicula = idPelicula;
        this.titulo = titulo;
        this.genero = genero;
        elenco = new ArrayList<>();
    }

    public Object[] getRegistro() {
        return new Object[]{idPelicula, titulo, genero, elenco.toString()};
    }

    public String getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(String idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public ArrayList<String> getElenco() {
        return elenco;
    }

    public void setElenco(ArrayList<String> elenco) {
        this.elenco = elenco;
    }

}