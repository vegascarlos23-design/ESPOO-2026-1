package Modelo;

public class Pedido {
    private String idPedido;
    private String restaurante;
    private String estado;
    private String idRepartidorAsignado;

    public Pedido(String idPedido, String restaurante) {
        this.idPedido = idPedido;
        this.restaurante = restaurante;
        estado = "Pendiente";
        idRepartidorAsignado = null;
    }
    
    public Object[] getRegistro() {
        return new Object[]{idPedido,restaurante,estado,idRepartidorAsignado};
    }

    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    public String getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(String restaurante) {
        this.restaurante = restaurante;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getIdRepartidorAsignado() {
        return idRepartidorAsignado;
    }

    public void setIdRepartidorAsignado(String idRepartidorAsignado) {
        this.idRepartidorAsignado = idRepartidorAsignado;
    }
    
    
}
