package Modelo;

public class CentroLogistico {
    private String nombre;
    private String codigo_aduana;
    private int capacidad_almacen;

    public CentroLogistico(String nombre, String codigo_aduana, int capacidad_almacen) {
        this.nombre = nombre;
        this.codigo_aduana = codigo_aduana;
        this.capacidad_almacen = capacidad_almacen;
    }

    public String getCadena() {
        return nombre + "&" + codigo_aduana + "&" + capacidad_almacen;
    }

    public String[] getRegistro() {
        return new String[]{nombre, codigo_aduana, String.valueOf(capacidad_almacen)};
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getCodigo_aduana() { return codigo_aduana; }
    public void setCodigo_aduana(String codigo_aduana) { this.codigo_aduana = codigo_aduana; }
    public int getCapacidad_almacen() { return capacidad_almacen; }
    public void setCapacidad_almacen(int capacidad_almacen) { this.capacidad_almacen = capacidad_almacen; }
}