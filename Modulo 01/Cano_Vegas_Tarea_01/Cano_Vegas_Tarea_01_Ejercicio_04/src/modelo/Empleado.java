package modelo;

public class Empleado {
    private String Dni,nombre,cargo,fechaIngreso;
    double sueldo;

    public Empleado() {
    }

    public Empleado(String Dni, String nombre, String cargo, double sueldo, String fechaIngreso) {
        this.Dni = Dni;
        this.nombre = nombre;
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.fechaIngreso = fechaIngreso;
    }

    public Object[] getRegistro() {
        return new Object[]{Dni,nombre,cargo,sueldo,fechaIngreso};
    }
    
    public String getCadena() {
        return Dni + ";" + nombre + ";" + cargo + ";" + sueldo + ";" + fechaIngreso;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    
}
