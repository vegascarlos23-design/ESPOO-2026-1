package Modelo;

public class Mascotas {
    private String ID;
    private String nombre, dueño, Sede_Asignada;

    public Mascotas() {
    }

    public Mascotas(String ID, String nombre, String dueño, String Sede_Asignada) {
        this.ID = ID;
        this.nombre = nombre;
        this.dueño = dueño;
        this.Sede_Asignada = Sede_Asignada;
    }
    
    public Object[] getRegistroMascotas(){
        return new Object[]{ID, nombre, dueño, Sede_Asignada};
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public String getSede_Asignada() {
        return Sede_Asignada;
    }

    public void setSede_Asignada(String Sede_Asignada) {
        this.Sede_Asignada = Sede_Asignada;
    }
    
    
}
