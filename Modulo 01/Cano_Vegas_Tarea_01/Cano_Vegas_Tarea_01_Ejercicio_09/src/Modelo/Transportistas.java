package Modelo;

public class Transportistas {
    private String nombre, placa, estado;
    private int entrega;
    private int ingresos;
    public Transportistas() {
    }

    public Transportistas(String nombre, String placa, String estado, int entrega, int ingresos) {
        this.nombre = nombre;
        this.placa = placa;
        this.estado = estado;
        this.entrega = entrega;
        this.ingresos = ingresos;
    }
    
    public Object[] getRegistro(){
        return new Object[]{nombre, placa, estado, entrega, ingresos};
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getEntrega() {
        return entrega;
    }

    public void setEntrega(int entrega) {
        this.entrega = entrega;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIngresos() {
        return ingresos;
    }

    public void setIngresos(int ingresos) {
        this.ingresos = ingresos;
    }
    
    
}
