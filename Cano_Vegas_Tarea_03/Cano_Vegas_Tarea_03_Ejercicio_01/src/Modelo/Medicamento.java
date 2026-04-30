package Modelo;

public class Medicamento {
    private int codigo;
    private String nombre;
    private String laboratorio;
    private int stock_actual;
    private double precio_unitario;
    private String fecha_vencimiento;

    public Medicamento() {
    }

    public Medicamento(int codigo, String nombre, String laboratorio, int stock_actual, double precio_unitario, String fecha_vencimiento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.laboratorio = laboratorio;
        this.stock_actual = stock_actual;
        this.precio_unitario = precio_unitario;
        this.fecha_vencimiento = fecha_vencimiento;
    }
    
    public Object[] getRegistro_Medicamento(){
        return new Object[]{codigo, nombre, laboratorio, stock_actual, precio_unitario, fecha_vencimiento, CalcularValorTotal()};
    }
    
    public double CalcularValorTotal(){
        return stock_actual * precio_unitario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public int getStock_actual() {
        return stock_actual;
    }

    public void setStock_actual(int stock_actual) {
        this.stock_actual = stock_actual;
    }

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public String getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(String fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }
}
