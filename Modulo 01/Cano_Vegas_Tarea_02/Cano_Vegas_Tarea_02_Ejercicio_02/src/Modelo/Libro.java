package Modelo;

public class Libro {
    private String ID, nombre, editorial;
    private int año_Publicacion;
    private String Categoria_Asignada;

    public Libro() {
    }

    public Libro(String ID, String nombre, String editorial, int año_Publicacion, String Categoria_Asignada) {
        this.ID = ID;
        this.nombre = nombre;
        this.editorial = editorial;
        this.año_Publicacion = año_Publicacion;
        this.Categoria_Asignada = Categoria_Asignada;
    }
    
    public Object[] getRegistroLibro(){
        return new Object[]{ID, nombre, editorial, año_Publicacion, Categoria_Asignada};
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAño_Publicacion() {
        return año_Publicacion;
    }

    public void setAño_Publicacion(int año_Publicacion) {
        this.año_Publicacion = año_Publicacion;
    }

    public String getCategoria_Asignada() {
        return Categoria_Asignada;
    }

    public void setCategoria_Asignada(String Categoria_Asignada) {
        this.Categoria_Asignada = Categoria_Asignada;
    }
    
    
}
