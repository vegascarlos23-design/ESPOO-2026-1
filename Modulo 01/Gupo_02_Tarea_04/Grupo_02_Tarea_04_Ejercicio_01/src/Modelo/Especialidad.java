package Modelo;

public class Especialidad {
    // Atributos
    private String codEspecialidad;
    private String nombreArea;
    private double costoConsulta;
    private int pisoUbicacion;
    
    // Constructor
    public Especialidad(String codEspecialidad, String nombreArea, double costoConsulta, int pisoUbicacion) {
        this.codEspecialidad = codEspecialidad;
        this.nombreArea = nombreArea;
        this.costoConsulta = costoConsulta;
        this.pisoUbicacion = pisoUbicacion;
    }
    
    public Especialidad(String nomrearea){
        this.nombreArea = nomrearea;
    }
    
    // Getters
    public String getCodEspecialidad() {
        return codEspecialidad;
    }

    public String getNombreArea() {
        return nombreArea;
    }

    public double getCostoConsulta() {
        return costoConsulta;
    }

    public int getPisoUbicacion() {
        return pisoUbicacion;
    }
    
    // Obtener un registr
    public Object[] getRegistro(){
        return new Object[]{codEspecialidad, nombreArea, costoConsulta, pisoUbicacion};
    }
    
    
    @Override
    public String toString(){
        return codEspecialidad + " - " + nombreArea;
    }
}
