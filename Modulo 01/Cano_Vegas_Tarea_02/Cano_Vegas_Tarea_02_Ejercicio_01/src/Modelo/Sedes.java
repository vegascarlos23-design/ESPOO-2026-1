package Modelo;

import javax.swing.JOptionPane;

public class Sedes {

    private String ID;
    private String nombre, direccion;
    private int telefono;

    private Mascotas[] mascotasSede = new Mascotas[8];
    private int contadorMascotas = 0;
    
    public boolean AgregarMascotaSede(Mascotas m){
        if (contadorMascotas < mascotasSede.length) {
            mascotasSede[contadorMascotas] = m;
            contadorMascotas++;
            return true;
        } else {
            return false;
        }
    }
    
    public Mascotas[] getMascotas() {
        return mascotasSede;
    }
    
    public Sedes() {
    }

    public Sedes(String ID, String nombre, String direccion, int telefono) {
        this.ID = ID;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
    public Object[] getRegistroSedes(){
        return new Object[]{ID, nombre, direccion, telefono};
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

}
