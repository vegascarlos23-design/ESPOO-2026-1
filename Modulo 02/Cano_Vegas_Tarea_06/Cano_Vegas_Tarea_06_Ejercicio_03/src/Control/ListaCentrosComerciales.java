package Control;

import Modelo.CentroComercial;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListaCentrosComerciales {
    private NodoCentroComercial head, end;
    private int codeGenerator;

    public ListaCentrosComerciales() {
        head = end = null;
        codeGenerator = 1;
    }
    
    public boolean Registrar(CentroComercial elemento) {
        
        elemento.setIdCentro(codeGenerator);
        
        NodoCentroComercial newNode = new NodoCentroComercial(elemento);
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
    
    public void Eliminar(int idCentroEliminar) {
        NodoCentroComercial cur = head;
        NodoCentroComercial anterior = end;
        do {            
            if (cur.getElemento().getIdCentro()== idCentroEliminar) {
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
        String[] header = {"ID Centro","Nombre","Ciudad","Cantidad Tiendas"};
        DefaultTableModel modTabla = new DefaultTableModel(header, 0);
        control.setModel(modTabla);
        
        try {
            NodoCentroComercial cur = head;
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
            NodoCentroComercial cur = head;
            if (cur == null) return;
            do {
                NodoCentroComercial sig = cur.getNxt();
                if (sig == head) break;

                CentroComercial a = cur.getElemento();
                CentroComercial b = sig.getElemento();

                if (a.getNombre().compareToIgnoreCase(b.getNombre()) > 0) {
                    cur.setElemento(b);
                    sig.setElemento(a);

                    cambio = true;
                }
                cur = cur.getNxt();
            } while (cur != head);
        } while (cambio);
    }
    
    public NodoCentroComercial getNodoPorId(int idCentro) {
        NodoCentroComercial cur = head;
        if (cur == null) return null;
        do {            
            if (cur.getElemento().getIdCentro()== idCentro) return cur;
            cur = cur.getNxt();
        } while (cur != head);
        return null;
    }
    
    public void CargarCombos(JComboBox control) {
        DefaultComboBoxModel modCombo = new DefaultComboBoxModel();
        control.setModel(modCombo);
        NodoCentroComercial cur = head;
        if (cur == null) return;
        do {                
            modCombo.addElement(cur.getElemento().getIdCentro());
            cur = cur.getNxt();
        } while (cur != head);
    }
    
}
