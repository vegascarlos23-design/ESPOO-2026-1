package Modelo;

public class Estudiantes {
    private String nombre, apellido;
    private int edad, salon, DNI;

    public Estudiantes() {
    }

    public Estudiantes(String nombre, String apellido, int edad, int salon, int DNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salon = salon;
        this.DNI = DNI;
    }
    
    public Object[] getRegistro(){
        return new Object[]{nombre, apellido, edad, salon, DNI};
    }
    
    public String getCadena(){
        return nombre + ";" + apellido + ";" + edad + ";" + salon + ";" + DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getSalon() {
        return salon;
    }

    public void setSalon(int salon) {
        this.salon = salon;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
    
    
}
