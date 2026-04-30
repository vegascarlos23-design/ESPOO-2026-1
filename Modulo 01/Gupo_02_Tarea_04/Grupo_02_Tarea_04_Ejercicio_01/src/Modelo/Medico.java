package Modelo;

public class Medico {

    // Atributos
    private String dniMedico;
    private String nombreApellido;
    private int aniosExperiencia;
    private int horasSemanales;
    private Especialidad especialidad;

    // Constructor
    public Medico(String dniMedico, String nombreApellido, int aniosExperiencia, int horasSemanales, Especialidad especialidad) {
        this.dniMedico = dniMedico;
        this.nombreApellido = nombreApellido;
        this.aniosExperiencia = aniosExperiencia;
        this.horasSemanales = horasSemanales;
        this.especialidad = especialidad;
    }
    
    public Medico(String dni, String nombreapellido){
     this.dniMedico = dni;
     this.nombreApellido = nombreapellido;
    }

    // Getters
    public String getDniMedico() {
        return dniMedico;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    // Obtener un registro
    public Object[] getRegistro() {
        return new Object[]{dniMedico, nombreApellido, aniosExperiencia, horasSemanales, especialidad != null ? especialidad.getNombreArea() : "Sin especialidad"};
    }

    @Override
    public String toString() {
        return dniMedico + " - " + nombreApellido;
    }
}
