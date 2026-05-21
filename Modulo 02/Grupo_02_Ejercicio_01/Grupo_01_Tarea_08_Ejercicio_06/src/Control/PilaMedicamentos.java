package Control;

import Modelo.Medicamento;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PilaMedicamentos {
    private NodoMedicamento top;

    public PilaMedicamentos() {
        top = null;
    }
    
    public void Apilar(Medicamento elemento) {
        NodoMedicamento newNode = new NodoMedicamento(elemento);
        
        newNode.setNxt(top);
        top = newNode;
    }
    
    public void Decapitar() {
        if (isEmpty()) return;
        top = top.getNxt();
    }

    public void Listar(JTable control) {
        String[] header = {"Nombre de la Droga","Dosis","Hora de Aplicacion"};
        DefaultTableModel modTabla = new DefaultTableModel(header, 0);
        control.setModel(modTabla);
        
        NodoMedicamento cur = top;
        while(cur != null) {
            modTabla.addRow(cur.getElemento().getRegistro());
            cur = cur.getNxt();
        }
    }
    
    public boolean isEmpty() {
        return top == null;
    }
    
    
    public NodoMedicamento getTop() {
        return top;
    }

    public void setTop(NodoMedicamento top) {
        this.top = top;
    }
    
    
}
