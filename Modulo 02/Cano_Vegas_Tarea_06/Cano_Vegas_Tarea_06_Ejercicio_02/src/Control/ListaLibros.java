package Control;

import Modelo.Libro;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListaLibros {
    private NodoLibro head, end;
    private int codeGenerator;

    public ListaLibros() {
        head = end = null;
        codeGenerator = 1;
    }
    
    public boolean Registrar(Libro elemento) {
        if (getNodoPorTitulo(elemento.getTitulo()) != null) {
            JOptionPane.showMessageDialog(null, "El Titulo ya existe");
            return false;
        }
        elemento.setCodigoLibro(codeGenerator);
        
        NodoLibro newNode = new NodoLibro(elemento);
        if (head == null) {
            head = end = newNode;
            end.setNxt(head);
        } else{
            end.setNxt(newNode);
            end = newNode;
            end.setNxt(head);
        }
        codeGenerator++;
        return true;
    }
    
    public void Eliminar(int codigoLibroEliminar) {
        NodoLibro cur = head;
        NodoLibro anterior = end;
        do {            
            if (cur.getElemento().getCodigoLibro() == codigoLibroEliminar) {
                if (head == end) {
                    head = end = null;
                } else if (cur == head) {
                    head = cur.getNxt();
                    end.setNxt(head);
                } else if (cur == end) {
                    anterior.setNxt(head);
                    end = anterior;
                } else {
                    anterior.setNxt(cur.getNxt());
                }
                return;
            }
            anterior = cur;
            cur = cur.getNxt();
        } while (cur != head);
        
        
    }
    
    public void Listar(JTable control) {
        BubbleSort();
        String[] header = {"Codigo Libro","Titulo","Autor","Cantidad Prestamos"};
        DefaultTableModel modTabla = new DefaultTableModel(header, 0);
        control.setModel(modTabla);
        
        try {
            NodoLibro cur = head;
            do {            
                modTabla.addRow(cur.getElemento().getRegistro());
                cur = cur.getNxt();
            } while (cur != head);
        } catch (Exception e) {
        }
        
    }
    
    public void BubbleSort() {
        boolean cambio;
        
        do {           
            cambio = false;
            NodoLibro cur = head;
            if (cur == null) return;
            do {
                NodoLibro sig = cur.getNxt();
                if (sig == head) break;

                Libro a = cur.getElemento();
                Libro b = sig.getElemento();

                if (a.getCantidadPrestamos() < b.getCantidadPrestamos()) {
                    cur.setElemento(b);
                    sig.setElemento(a);

                    cambio = true;
                }
                cur = cur.getNxt();
            } while (cur != head);
        } while (cambio);
    }
    
    public NodoLibro getNodoPorCodigo(int codigoLibro) {
        NodoLibro cur = head;
        if (cur == null) return null;
        do {            
            if (cur.getElemento().getCodigoLibro() == codigoLibro) return cur;
            cur = cur.getNxt();
        } while (cur != head);
        return null;
    }
    public NodoLibro getNodoPorTitulo(String tituloLibro) {
        NodoLibro cur = head;
        if (cur == null) return null;
        do {            
            if (cur.getElemento().getTitulo().equalsIgnoreCase(tituloLibro)) return cur;
            cur = cur.getNxt();
        } while (cur != head);
        return null;
    }
    
    public void CargarCombos(JComboBox control) {
        DefaultComboBoxModel modCombo = new DefaultComboBoxModel();
        control.setModel(modCombo);
        NodoLibro cur = head;
        if (cur == null) return;
        do {                
            modCombo.addElement(cur.getElemento().getCodigoLibro());
            cur = cur.getNxt();
        } while (cur != head);
    }
    
}
