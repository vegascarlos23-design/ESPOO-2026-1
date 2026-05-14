package Modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Paciente {
    private int codigo;
    private String nombreCompleto;
    private String dni;
    private Date horaCita;
    private String estado;

    public Paciente(String nombreCompleto, String dni, Date horaCita, String estado) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.horaCita = horaCita;
        this.estado = estado;
    }

    public Paciente(String nombreCompleto, Date horaCita) {
        this.nombreCompleto = nombreCompleto;
        this.horaCita = horaCita;
    }
    
    
    
    public Object[] getRegistro() {
        SimpleDateFormat spf = new SimpleDateFormat("HH:mm");
        return new Object[]{codigo,nombreCompleto,dni,spf.format(horaCita),estado};
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(Date horaCita) {
        this.horaCita = horaCita;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
