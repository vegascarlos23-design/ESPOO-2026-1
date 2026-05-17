package Modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Expediente {
    private int NumeroFolio;
    private String cliente;
    private Date fehcaIngreso;
    private String prioridad;

    public Expediente(String cliente, Date fehcaIngreso, String prioridad) {
        this.cliente = cliente;
        this.fehcaIngreso = fehcaIngreso;
        this.prioridad = prioridad;
    }
    
    public Object[] getRegistro() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return new Object[]{NumeroFolio,cliente,sdf.format(fehcaIngreso),prioridad};
    } 

    public int getNumeroFolio() {
        return NumeroFolio;
    }

    public void setNumeroFolio(int NumeroFolio) {
        this.NumeroFolio = NumeroFolio;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Date getFehcaIngreso() {
        return fehcaIngreso;
    }

    public void setFehcaIngreso(Date fehcaIngreso) {
        this.fehcaIngreso = fehcaIngreso;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }
    
    
}
