package Control;

import Modelo.CentroComercial;
import Modelo.Tienda;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListaTiendas {
    private NodoTienda head,end;
    private int codeGenerator;

    public ListaTiendas() {
        head = end = null;
        codeGenerator = 1;
    }
    
    public void Registrar(Tienda elemento, ListaCentrosComerciales objListaCentros) {
        elemento.setIdTienda(codeGenerator);
        
        NodoTienda newNode = new NodoTienda(elemento);
        
        CentroComercial objComercial = objListaCentros.getNodoPorId(elemento.getIdCentro()).getElemento();
        objComercial.setCantidadTiendas(objComercial.getCantidadTiendas()+1);
        
        if (head == null) {
            head = end = newNode;
            end.setNxt(head);
            end.setPre(head);
        } else {
            int n = Contar();
            
            NodoTienda cur = head;
            for (int i = 0; i < n/2; i++) {
                cur = cur.getNxt();
            }
            
            newNode.setPre(cur.getPre());
            newNode.setNxt(cur);
            cur.getPre().setNxt(newNode);
            cur.setPre(newNode);
            
            if (cur == head) {
                head = newNode;
            }
        }
        codeGenerator++;       
    }
    
    public void EliminarPorCentro(int idCentro, ListaCentrosComerciales objComerciales) {
        if (head == null) return;
        int cantidad = Contar();
        NodoTienda cur = head;
        for (int i = 0; i < cantidad; i++) {
            NodoTienda siguiente = cur.getNxt();
            if (cur.getElemento().getIdCentro() == idCentro) {                
                if (head == end) {
                    head = end = null;
                    return;
                } else if (cur == head) {
                    head = head.getNxt();
                    head.setPre(end);
                    end.setNxt(head);
                } else if (cur == end) {
                    end = end.getPre();
                    end.setNxt(head);
                    head.setPre(end);
                } else {
                    cur.getPre().setNxt(cur.getNxt());
                    cur.getNxt().setPre(cur.getPre());
                }
            }

            cur = siguiente;
            if (head == null) break;
        }
    }
    
    public int Contar() {
        if (head == null) return 0;
        int c = 0;
        NodoTienda cur = head;
        do {
            c++;
            cur = cur.getNxt();
        } while (cur != head);

        return c;
    }

    public void Listar(JTable control) {
        String[] header = {"ID Tienda", "Rubro","Local","Total Ventas","ID Centro"};
        DefaultTableModel modTabla = new DefaultTableModel(header, 0);
        control.setModel(modTabla);
        
        NodoTienda cur = end;
        if (cur == null) return;
        do {            
            modTabla.addRow(cur.getElemento().getRegistro());
            cur = cur.getPre();
        } while (cur != end);

    }
    
    public NodoTienda getNodoPorId(int idTienda) {
        NodoTienda cur = head;
        if (cur == null) return null;
        do {            
            if (cur.getElemento().getIdTienda() == idTienda) return cur;
            cur = cur.getNxt();
        } while (cur != head);
        return null;
    }
    
    public NodoTienda getNodoPorFila(int fila) {
        if (head == null) return null;
        NodoTienda cur = end;
        int i = 0;
        do {
            if (i == fila) return cur;
            cur = cur.getPre();
            i++;
        } while (cur != end);
        return null;
    }
    
    public void CargarCombos(JComboBox control) {
        DefaultComboBoxModel modCombo = new DefaultComboBoxModel();
        control.setModel(modCombo);
        NodoTienda cur = head;
        if (cur == null) return;
        do {                
            modCombo.addElement(cur.getElemento().getIdTienda());
            cur = cur.getNxt();
        } while (cur != head);
    }

    public NodoTienda getHead() {
        return head;
    }

    public void setHead(NodoTienda head) {
        this.head = head;
    }

    public NodoTienda getEnd() {
        return end;
    }

    public void setEnd(NodoTienda end) {
        this.end = end;
    }       
}
