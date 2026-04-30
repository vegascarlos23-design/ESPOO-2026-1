package Modelo;

import javax.swing.JOptionPane;

public class Departamento {
    private int id;
    private String nombre;
    private int numero_empleados;
    private String nombre_jefe;
    private String ubicacion;
    private Proyecto[] ARREGLO_PROYECTO = new Proyecto[5];
    private int carga_maxima = 0;

    public Departamento(int id, String nombre, int numero_empleados, String nombre_jefe, String ubicacion) {
        this.id = id;
        this.nombre = nombre;
        this.numero_empleados = numero_empleados;
        this.nombre_jefe = nombre_jefe;
        this.ubicacion = ubicacion;
    }
    
    public void Agregar_Proyecto(Proyecto dato){
        try {
            ARREGLO_PROYECTO[carga_maxima] = dato;
            carga_maxima++;
        } catch (ArrayIndexOutOfBoundsException a) {
            JOptionPane.showMessageDialog(null, "La lista de proyectos para este departamento ya está llena.");
        }
    }
    
    public Object[] getRegistro_Departamento(){
        return new Object[]{id, nombre, numero_empleados, nombre_jefe, ubicacion, getCarga_maxima()};
    }
    
    public int getCadenaD(){
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

    public int getNumero_empleados() {
        return numero_empleados;
    }

    public void setNumero_empleados(int numero_empleados) {
        this.numero_empleados = numero_empleados;
    }

    public String getNombre_jefe() {
        return nombre_jefe;
    }

    public void setNombre_jefe(String nombre_jefe) {
        this.nombre_jefe = nombre_jefe;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Proyecto[] getARREGLO_PROYECTO() {
        return ARREGLO_PROYECTO;
    }

    public int getCarga_maxima() {
        return carga_maxima;
    }

    public void setCarga_maxima(int carga_maxima) {
        this.carga_maxima = carga_maxima;
    }
    
    @Override
    public String toString() {
        return nombre;
    }
}
