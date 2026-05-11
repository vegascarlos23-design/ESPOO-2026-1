package Control;

import Modelo.Region;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListaRegion {
    private NodoRegion inicio,fin;

    public ListaRegion() {
        inicio = fin = null;
    }
    
    public boolean Agregar(Region elemento) {
        if (getNodoPorRegion(elemento.getCodRegion()) != null) {
            JOptionPane.showMessageDialog(null, "La region ya existe");
            return false;
        }
        
        NodoRegion nuevo = new NodoRegion(elemento);
        if (fin == null) {
            inicio = fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
        return true;
    }
    
    public void Listar(JTable control) {
        BubbleSort();
        String[] cabecera = {"Cod Region","Nombre Region","Superficie(km2)"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        
        NodoRegion cur = inicio;
        while(cur != null) {
            modTabla.addRow(cur.getElemento().getRegistro());
            cur = cur.getSiguiente();
        }      
    }
    
    public void editar(int CodRegionE, Region elemento) {
        NodoRegion nodoAeditar = getNodoPorRegion(CodRegionE);
        nodoAeditar.setElemento(elemento);
    }
    
    public void BubbleSort() {
        boolean cambio;
        do {
            cambio = false;
            
            NodoRegion cur = inicio;
            while(cur != null && cur.getSiguiente() != null) {
                Region a = cur.getElemento();
                Region b = cur.getSiguiente().getElemento();
                if (a.getSuperficie() > b.getSuperficie()) {
                    cur.setElemento(b);
                    cur.getSiguiente().setElemento(a);
                    cambio = true;
                }
                
                cur = cur.getSiguiente();
            }
        } while(cambio);
    }
    
    
    public void ListarPorNombre(String nombre, JTable control) {
        String[] cabecera = {"Cod Region","Nombre Region","Superficie(km2)"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        
        NodoRegion cur = inicio;
        while(cur != null) {
            if (cur.getElemento().getNombreRegion().toUpperCase().contains(nombre.toUpperCase())){
                modTabla.addRow(cur.getElemento().getRegistro());             
            }
            cur = cur.getSiguiente();
        }
    }
    
    public NodoRegion getNodoPorRegion(int codRegion) {
        NodoRegion cur = inicio;
        while(cur != null) {
            if (cur.getElemento().getCodRegion() == codRegion) return cur;
            cur = cur.getSiguiente();
        }
        return null;
    }
}
