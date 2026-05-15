package Modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Prestamo {
    private int IdPrestamo;
    private String nombreUsuario;
    private Date fechaSalida,fechaDevolucion;
    private int codigoLibro;

    public Prestamo(String nombreUsuario, Date fechaSalida, Date fechaDevolucion, int codigoLibro) {
        this.nombreUsuario = nombreUsuario;
        this.fechaSalida = fechaSalida;
        this.fechaDevolucion = fechaDevolucion;
        this.codigoLibro = codigoLibro;
    }
    
    public Object[] getRegistro() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        return new Object[]{IdPrestamo,nombreUsuario,sdf.format(fechaSalida),sdf.format(fechaDevolucion),codigoLibro};
    }

    public int getIdPrestamo() {
        return IdPrestamo;
    }

    public void setIdPrestamo(int IdPrestamo) {
        this.IdPrestamo = IdPrestamo;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(int idLibro) {
        this.codigoLibro = idLibro;
    }
    
    
}
