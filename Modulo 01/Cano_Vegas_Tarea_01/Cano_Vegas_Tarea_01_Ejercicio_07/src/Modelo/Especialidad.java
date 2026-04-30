package Modelo;

import javax.swing.JOptionPane;

public class Especialidad {
    private String nombreEspecialidad;
    private Paciente[] pacientes;
    private int i = 0;

    public Especialidad(String nombreEspecialidad, int n) {
        this.nombreEspecialidad = nombreEspecialidad;
        this.pacientes = new Paciente[n];
    }
    
    public void agregarPaciente(Paciente dato) {
        try {
            pacientes[i] = dato;
            i++;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se alcanzo la maxima capacidad");
        }
    }

    public Object[] getRegistro(){
        return new Object[]{nombreEspecialidad,getI()};
    }
    
    public String getNombreEspecialidad() {
        return nombreEspecialidad;
    }

    public void setNombreEspecialidad(String nombreEspecialidad) {
        this.nombreEspecialidad = nombreEspecialidad;
    }

    public Paciente[] getPacientes() {
        return pacientes;
    }

    public int getI() {
        return i;
    }
    
}
