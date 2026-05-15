package Modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class VentaDiaria {
    private int CodigoVenta;
    private Date fecha;
    private double monto;
    private int IdTienda;

    public VentaDiaria(Date fecha, double monto, int IdTienda) {
        this.fecha = fecha;
        this.monto = monto;
        this.IdTienda = IdTienda;
    }
    
    
    public Object[] getRegistro() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        return new Object[]{CodigoVenta,sdf.format(fecha),monto,IdTienda};
    }

    public int getCodigoVenta() {
        return CodigoVenta;
    }

    public void setCodigoVenta(int CodigoVenta) {
        this.CodigoVenta = CodigoVenta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getIdTienda() {
        return IdTienda;
    }

    public void setIdTienda(int IdTienda) {
        this.IdTienda = IdTienda;
    }

    
}
