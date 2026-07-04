package Modelo;

import java.util.ArrayList;
import java.util.HashSet;

public class Usuario {

    private String idUsuario;
    private HashSet<String> historialVisualizaciones;
    private ArrayList<String> generosFavoritos;

    public Usuario(String idUsuario) {
        this.idUsuario = idUsuario;
        historialVisualizaciones = new HashSet<>();
        generosFavoritos = new ArrayList<>();

    }

    public Object[] getRegistro() {
        return new Object[]{idUsuario,historialVisualizaciones.toString(),generosFavoritos.toString()
        };

    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public HashSet<String> getHistorialVisualizaciones() {
        return historialVisualizaciones;
    }

    public void setHistorialVisualizaciones(HashSet<String> historialVisualizaciones) {
        this.historialVisualizaciones = historialVisualizaciones;
    }

    public ArrayList<String> getGenerosFavoritos() {
        return generosFavoritos;
    }

    public void setGenerosFavoritos(ArrayList<String> generosFavoritos) {
        this.generosFavoritos = generosFavoritos;
    }

}