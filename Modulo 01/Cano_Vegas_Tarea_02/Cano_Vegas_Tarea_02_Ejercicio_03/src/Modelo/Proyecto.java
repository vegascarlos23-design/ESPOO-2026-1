package Modelo;

public class Proyecto {
    private int id;
    private String nombre;
    private String fecha_inicio;
    private String fecha_fin;
    private double presupuesto;
    private Departamento departamento_asignado;

    public Proyecto() {
    }

    public Proyecto(int id, String nombre, String fecha_inicio, String fecha_fin, double presupuesto, Departamento departamento_asignado) {
        this.id = id;
        this.nombre = nombre;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.presupuesto = presupuesto;
        this.departamento_asignado = departamento_asignado;
    }
    
    public Object[] getRegistro_Proyecto(){
        return new Object[]{departamento_asignado, id, nombre, fecha_inicio, fecha_fin, presupuesto};
    }
    
    public int getCadenaP(){
        return id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Departamento getDepartamento_asignado() {
        return departamento_asignado;
    }

    public void setDepartamento_asignado(Departamento departamento_asignado) {
        this.departamento_asignado = departamento_asignado;
    }
}
