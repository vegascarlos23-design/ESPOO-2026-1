package Control;

import Modelo.SectorMedico;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListaSectores {
    private NodoSectorMedico head,end;

    public ListaSectores() {
        head = end = null;
    }
    
    public void Registrar(SectorMedico elemento) {
        NodoSectorMedico newNode = new NodoSectorMedico(elemento);
        
        if(isEmpty()) {
            head = end = newNode;
        } else {
            end.setNxt(newNode);
            newNode.setPre(end);
            end = newNode;
        }        
    }
    
    public void Listar(JTable control) {
        BubbleSort();
        String[] header = {"ID Sector","Nombre","Camas Libres"};
        DefaultTableModel modTabla = new DefaultTableModel(header, 0);
        control.setModel(modTabla);
        
        NodoSectorMedico cur = head;
        while(cur != null) {
            modTabla.addRow(cur.getElemento().getRegistro());
            cur = cur.getNxt();
        }
    }
    
    public boolean isEmpty() {
        return head == null;
    }
    
    public NodoSectorMedico getSectorPorId(String idSector) {
        NodoSectorMedico cur = head;
        while(cur != null) {
            if (cur.getElemento().getIdSector().equalsIgnoreCase(idSector)) return cur;
            cur = cur.getNxt();
        }
        return null;
    }
    
    public boolean MostrarDosisPacientePorDni(JTable control, String dni) {
        String[] header = {"Nombre de la Droga","Dosis","Hora de Aplicacion"};
        DefaultTableModel modTabla = new DefaultTableModel(header, 0);
        control.setModel(modTabla);
        NodoSectorMedico cur = head;
        NodoPaciente cur2;
        NodoMedicamento cur3;
        while(cur != null) {
            cur2 = cur.getObjColaPacientes().getFront();
            while(cur2 != null) {
                if (cur2.getElemento().getDni().equalsIgnoreCase(dni)) {
                    cur3 = cur2.getMedicamentos().getTop();
                    while(cur3 != null) {
                        modTabla.addRow(cur3.getElemento().getRegistro());
                        cur3 = cur3.getNxt();
                    }
                    return true;
                }
                cur2 = cur2.getNxt();
            }           
            cur = cur.getNxt();
        }   
        return false;
    }
    
    public void BubbleSort() {
        boolean cambio;
        
        NodoSectorMedico cur;
        do {            
            cur = head;
            cambio = false;
            while(cur != null && cur.getNxt() != null) {
                SectorMedico elemento1 = cur.getElemento();
                SectorMedico elemento2 = cur.getNxt().getElemento();
                
                if (elemento1.getCamasLibres() > elemento2.getCamasLibres()) {
                    cambio = true;
                    cur.setElemento(elemento2);
                    cur.getNxt().setElemento(elemento1);
                }
                cur = cur.getNxt();
            }
        } while (cambio);
    }
    
    public void CargarCombo(JComboBox control) {
        DefaultComboBoxModel modCombo = new DefaultComboBoxModel();
        control.setModel(modCombo);
        
        NodoSectorMedico cur = head;
        while(cur != null) {
            modCombo.addElement(cur.getElemento().getIdSector()+" - "+cur.getElemento().getNombre());
            cur = cur.getNxt();
        }
    }
    
}
