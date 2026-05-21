package Modelo;

public class Paciente {
    private String dni;
    private String nombre;
    private int nivelUrgencia;

    public Paciente(String dni, String nombre, int nivelUrgencia) {
        this.dni = dni;
        this.nombre = nombre;
        this.nivelUrgencia = nivelUrgencia;
    }
    
    public Object[] getRegistro() {
        String Triage;
        if (nivelUrgencia == 1) Triage = "Leve";
        else if (nivelUrgencia == 2) Triage = "Moderado";
        else if (nivelUrgencia == 3) Triage = "Grave";
        else  Triage = "Critico";
        
        return new Object[]{dni,nombre,Triage};
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivelUrgencia() {
        return nivelUrgencia;
    }

    public void setNivelUrgencia(int nivelUrgencia) {
        this.nivelUrgencia = nivelUrgencia;
    }

    
    
    
}
