package Modelo;

import java.util.ArrayList;

public class UsuarioRed {

    private String idUsuario;
    private ArrayList<String> temasInteres;
    private double puntuacionPromedio;

    public UsuarioRed(String idUsuario) {
        this.idUsuario = idUsuario;
        temasInteres = new ArrayList<>();
        puntuacionPromedio = 0;
    }

    public Object[] getRegistro() {
        return new Object[]{idUsuario, temasInteres.toString(), puntuacionPromedio};
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public ArrayList<String> getTemasInteres() {
        return temasInteres;
    }

    public void setTemasInteres(ArrayList<String> temasInteres) {
        this.temasInteres = temasInteres;
    }

    public double getPuntuacionPromedio() {
        return puntuacionPromedio;
    }

    public void setPuntuacionPromedio(double puntuacionPromedio) {
        this.puntuacionPromedio = puntuacionPromedio;
    }

}