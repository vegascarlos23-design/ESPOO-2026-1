package Modelo;

public class Componente {
    private int Codigo;
    private String Nombre;
    private String Categoria; // Procesador, RAM, Disco
    private String Marca;

    public Componente() {
    }

    public Componente(int Codigo, String Nombre, String Categoria, String Marca) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Categoria = Categoria;
        this.Marca = Marca;
    }
    
    public String getCadena(){
        return Nombre + Categoria;
    }
    
    public Object[] getRegistro(){
        return new Object[]{Codigo, Nombre, Categoria, Marca};
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
    
    
}
