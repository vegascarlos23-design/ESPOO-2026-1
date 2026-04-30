package Modelo;

public class Categoria {
    private String nombre, ID;
    private int Total_Libros_En_Categoria;
    
    private Libro[] librocategoria = new Libro[8];
    private int contadorlibro = 0;

    public Categoria() {
    }

    public Categoria(String nombre, String ID, int Total_Libros_En_Categoria) {
        this.nombre = nombre;
        this.ID = ID;
        this.Total_Libros_En_Categoria = Total_Libros_En_Categoria;
    }
    
    public Object[] getRegistroCategoria(){
        return new Object[]{ID, nombre, Total_Libros_En_Categoria};
    }
    
    public boolean AgregarLibroCategoria(Libro l){
        if (contadorlibro < librocategoria.length) {
            librocategoria[contadorlibro] = l;
            contadorlibro++;
            return true;
        } else {
            return false;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getTotal_Libros_En_Categoria() {
        return Total_Libros_En_Categoria;
    }

    public void setTotal_Libros_En_Categoria(int Total_Libros_En_Categoria) {
        this.Total_Libros_En_Categoria = Total_Libros_En_Categoria;
    }
    
    
}
