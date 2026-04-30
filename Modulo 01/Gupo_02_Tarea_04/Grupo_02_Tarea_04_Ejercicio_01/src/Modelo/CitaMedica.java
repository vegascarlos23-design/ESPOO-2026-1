package Modelo;

public class CitaMedica {
    // Atributos
    private Medico medicoAsignado;
    private Especialidad especialidadCita;
    private String fechaCita;
    private double montoFinal;
    
    // Constructor
    public CitaMedica(Medico medicoAsignado, Especialidad especialidadCita, String fechaCita){
        this.medicoAsignado = medicoAsignado;
        this.especialidadCita = especialidadCita;
        this.fechaCita = fechaCita;
        this.montoFinal = calcularMonto();
    }
    public CitaMedica(double montoFinal){
        this.montoFinal = montoFinal;
    }
    
    
    // Método para calcular el monto final
    public double calcularMonto(){
        return especialidadCita.getCostoConsulta() * 1.15;
    }
    
    
    
    // Getters
    public Medico getMedicoAsignado() {
        return medicoAsignado;
    }

    public Especialidad getEspecialidadCita() {
        return especialidadCita;
    }

    public String getFechaCita() {
        return fechaCita;
    }

    public double getMontoFinal() {
        return montoFinal;
    }
    
    // Obtener un registro
    public Object[] getRegistro(){
        return new Object[]{medicoAsignado.toString(), especialidadCita.toString(), fechaCita, montoFinal};
    }
}
