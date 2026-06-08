package Modelo;

public class Paciente {
    private int historialClinico;
    private String nombrePaciente;
    private String areaAtencion;
    private int edad;

    public Paciente(int historialClinico, String nombrePaciente, String areaAtencion, int edad) {
        this.historialClinico = historialClinico;
        this.nombrePaciente = nombrePaciente;
        this.areaAtencion = areaAtencion;
        this.edad = edad;
    }
    
    public Object[] getRegistro() {
        return new Object[]{historialClinico,nombrePaciente,areaAtencion,edad};
    }

    public int getHistorialClinico() {
        return historialClinico;
    }

    public void setHistorialClinico(int historialClinico) {
        this.historialClinico = historialClinico;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getAreaAtencion() {
        return areaAtencion;
    }

    public void setAreaAtencion(String areaAtencion) {
        this.areaAtencion = areaAtencion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }    
}
