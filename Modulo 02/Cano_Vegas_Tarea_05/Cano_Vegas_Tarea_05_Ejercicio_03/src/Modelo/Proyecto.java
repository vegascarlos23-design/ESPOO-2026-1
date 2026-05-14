package Modelo;

public class Proyecto {
    private int idProyecto;
    private String nombreProyecto;
    private double presupuestoMaximo;
    private double montoGastadoAcumulado;

    public Proyecto(int idProyecto, String nombreProyecto, double presupuestoMaximo) {
        this.idProyecto = idProyecto;
        this.nombreProyecto = nombreProyecto;
        this.presupuestoMaximo = presupuestoMaximo;
        montoGastadoAcumulado = 0;
    }
    
    public Object[] getRegistro() {
        return new Object[]{idProyecto,nombreProyecto,presupuestoMaximo,montoGastadoAcumulado};
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public double getPresupuestoMaximo() {
        return presupuestoMaximo;
    }

    public void setPresupuestoMaximo(double presupuestoMaximo) {
        this.presupuestoMaximo = presupuestoMaximo;
    }

    public double getMontoGastadoAcumulado() {
        return montoGastadoAcumulado;
    }

    public void setMontoGastadoAcumulado(double montoGastadoAcumulado) {
        this.montoGastadoAcumulado = montoGastadoAcumulado;
    }

    
    
}
