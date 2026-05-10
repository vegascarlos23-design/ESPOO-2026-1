package Modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaccion {
    private int idTransaccion;
    private int numCuenta;
    private String tipo;
    private double monto;
    private Date fecha;

    public Transaccion(int idTransaccion, int numCuenta, String tipo, double monto, Date fecha) {
        this.idTransaccion = idTransaccion;
        this.numCuenta = numCuenta;
        this.tipo = tipo;
        this.monto = monto;
        this.fecha = fecha;
    }
    
    public Object[] getRegistro() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        return new Object[]{idTransaccion,numCuenta,tipo,monto,sdf.format(fecha)};
    } 

    public int getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
}
