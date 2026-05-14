package Modelo;

public class Gasto {
    private int idGasto;
    private int idProyecto;
    private String concepto;
    private double montoGasto;

    public Gasto(int idGasto, int idProyecto, String concepto, double montoGasto) {
        this.idGasto = idGasto;
        this.idProyecto = idProyecto;
        this.concepto = concepto;
        this.montoGasto = montoGasto;
    }

    public Object[] getRegistro() {
        return new Object[]{idGasto,idProyecto,concepto,montoGasto};
    }

    public int getIdGasto() {
        return idGasto;
    }

    public void setIdGasto(int idGasto) {
        this.idGasto = idGasto;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public double getMontoGasto() {
        return montoGasto;
    }

    public void setMontoGasto(double montoGasto) {
        this.montoGasto = montoGasto;
    }

    
}
