package Modelo;

public class Transaccion {
    private int idTransaccion;
    private int numCuenta;
    private String tipo;
    private double monto;
    private String fecha;

    public Transaccion(int idTransaccion, int numCuenta, String tipo, double monto, String fecha) {
        this.idTransaccion = idTransaccion;
        this.numCuenta = numCuenta;
        this.tipo = tipo;
        this.monto = monto;
        this.fecha = fecha;
    }
    
    public Object[] getRegistro() {
        return new Object[]{idTransaccion,numCuenta,tipo,monto,fecha};
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}
