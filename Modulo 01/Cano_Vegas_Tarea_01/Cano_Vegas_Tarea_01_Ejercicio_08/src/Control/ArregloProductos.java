package Control;

import Modelo.ProductoEditorial;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class ArregloProductos {
    private ProductoEditorial[] arreglo = new ProductoEditorial[10];
    private int i = 0;
    
    public String[] getCabecera(int tipo) {
        switch (tipo) {
            case 1:
                return new String[]{"ID","Titulo","Autor","Precio","Num. Paginas"};
            case 2:
                return new String[]{"ID","Titulo","Autor","Precio","Formato"};
            case 3:
                return new String[]{"ID","Titulo","Autor","Precio","Area de Investigacion"};
            case 4:
                return new String[]{"ID","Titulo","Autor","Precio","Fecha"};
        }
        return null;
    }
    
    
    public void Agregar(ProductoEditorial dato) {
        try {
            if (buscar(dato.getId()) == -1) {
                arreglo[i] = dato;
                i++;
            } else {
                JOptionPane.showMessageDialog(null, "El id ya existe");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Arreglo lleno");
        }
    }
    
    public void Editar(ProductoEditorial dato, int posEditar) {
        int pos = buscar(posEditar);
        arreglo[pos] = dato;
    }
    
    public void Borrar(int idBorrar) {
        for (int pos = 0; pos < i; pos++) {
            if(arreglo[pos].getId() == idBorrar) {
                for (int j = pos; j < i-1; j++) {
                    arreglo[j] = arreglo[j+1];
                }
                arreglo[i-1] = null;
                i--;
            } 
        }
    }
    
    public void Listar(JTable control) {
        String[] cabecera = {"ID","Titulo","Autor","Precio"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera,0);
        control.setModel(modTabla);
        
        for (int pos = 0; pos < i; pos++) {
            modTabla.addRow(arreglo[pos].getRegistro());
        }
    }
    
    public void filtrar(JTable control,int tipo) {
        String[] cabecera = getCabecera(tipo);
        DefaultTableModel modTabla = new DefaultTableModel(cabecera,0);
        control.setModel(modTabla);
        
        for (int pos = 0; pos < i; pos++) {
            if (arreglo[pos].mostrarTipo() == tipo) {
                modTabla.addRow(arreglo[pos].getRegistro());
            }
        }
    }
    
    public int buscar(int id) {
        for (int pos = 0; pos < i; pos++) {
            if (arreglo[pos].getId() == id) {
                return pos;
            }
        }
        return -1;
    }
    
    public String getProductoEditorial(int posBuscar) {
        int pos = buscar(posBuscar);
        int tipo = arreglo[pos].mostrarTipo();
        
        switch (tipo) {
            case 1:
                return "Libro Impreso";
            case 2:
                return "E-Book";
            case 3:
                return "Revista Cientifica";
            case 4:
                return "Periodico";
            default:
                throw new AssertionError();
        }
    }
    public String getDato(int posBuscar) {
        int pos = buscar(posBuscar);
        return arreglo[pos].getDatoAdicional();
    }
}
