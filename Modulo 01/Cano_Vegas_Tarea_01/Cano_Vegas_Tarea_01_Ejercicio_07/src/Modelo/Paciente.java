package Modelo;

public class Paciente {
    private String dni;
    private String nombre;
    private double presion;
    private double temperatura;
    private double saturacion;
    private String especialidad;

    public Paciente(String dni, String nombre, double presion, double temperatura, double saturacion, String especialidad) {
        this.dni = dni;
        this.nombre = nombre;
        this.presion = presion;
        this.temperatura = temperatura;
        this.saturacion = saturacion;
        this.especialidad = especialidad;
    }
    
    public Object[] getRegistro() {
        return new Object[]{especialidad,dni,nombre,presion,temperatura,saturacion,getPromedio(),getEstado()};
    }
    
    public double getPromedio() {
        return (presion + temperatura + saturacion)/3;
    }
    
    //<70 es uci < 80 es emergencia > normal
    public String getEstado() {
        double promedio = getPromedio();
        if (promedio >= 80) {
            return "Estable";
        } else if (promedio >= 70) {
            return "Emergencia";
        }
        return "UCI";
    }
}
