package Modelo;

import Control.TreeAlumnos;

public class Carrera {
    private String nombreCarrera;
    private String facultad;
    private TreeAlumnos alumnos;

    public Carrera(String nombreCarrera, String facultad) {
        this.nombreCarrera = nombreCarrera;
        this.facultad = facultad;
        alumnos = new TreeAlumnos();
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public TreeAlumnos getEquipos() {
        return alumnos;
    }

    public void setEquipos(TreeAlumnos alumnos) {
        this.alumnos = alumnos;
    }

    
    
}
