package Modelo;

public class AlumnoMatriculado {
    private int codigoEstudiante;
    private String nombreCompleto;
    private double promedioPonderado;
    private String situacionAcademica;

    public AlumnoMatriculado(int codigoEstudiante, String nombreCompleto, double promedioPonderado, String situacionAcademica) {
        this.codigoEstudiante = codigoEstudiante;
        this.nombreCompleto = nombreCompleto;
        this.promedioPonderado = promedioPonderado;
        this.situacionAcademica = situacionAcademica;
    }

    public int getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(int codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public double getPromedioPonderado() {
        return promedioPonderado;
    }

    public void setPromedioPonderado(double promedioPonderado) {
        this.promedioPonderado = promedioPonderado;
    }

    public String getSituacionAcademica() {
        return situacionAcademica;
    }

    public void setSituacionAcademica(String situacionAcademica) {
        this.situacionAcademica = situacionAcademica;
    }
    
    
}
