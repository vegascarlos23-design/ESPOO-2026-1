package Modelo;

public class OrdenCompra {
    // Atributos
    private Proveedor proveedorVendedor;
    private Componente componentePedido;
    private int cantidadUnidades;
    private double subTotalOrden;
    
    // Constructor
    public OrdenCompra(Proveedor proveedorVendedor, Componente componentePedido, int cantidadUnidades) {
        this.proveedorVendedor = proveedorVendedor;
        this.componentePedido = componentePedido;
        this.cantidadUnidades = cantidadUnidades;
        this.subTotalOrden = calcularSubTotal();
    }
    
    public double calcularSubTotal(){
        return cantidadUnidades * componentePedido.getPrecioUnitario();
    }
    
    // Getters y Setters
    public Proveedor getProveedorVendedor() {
        return proveedorVendedor;
    }

    public void setProveedorVendedor(Proveedor proveedorVendedor) {
        this.proveedorVendedor = proveedorVendedor;
    }

    public Componente getComponentePedido() {
        return componentePedido;
    }

    public void setComponentePedido(Componente componentePedido) {
        this.componentePedido = componentePedido;
    }

    public int getCantidadUnidades() {
        return cantidadUnidades;
    }

    public void setCantidadUnidades(int cantidadUnidades) {
        this.cantidadUnidades = cantidadUnidades;
    }

    public double getSubTotalOrden() {
        return subTotalOrden;
    }

    public void setSubTotalOrden(double subTotalOrden) {
        this.subTotalOrden = subTotalOrden;
    }
    
    // Obtener un registro
    public Object[] getRegistro(){
        return new Object[]{proveedorVendedor.getRucProveedor(), componentePedido.getNombrePieza(), cantidadUnidades, subTotalOrden};
    }
}
