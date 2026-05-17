package Control;

import Modelo.Columna;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PilaColumna {
    private NodoColumna bottom,top;
    private int codeGenerator = 0;

    public PilaColumna() {
        bottom = top = null;       
    }

    public void Apilar(Columna elemento) { 
        if (elemento.getCodColumna() == 0) {
            elemento.setCodColumna(++codeGenerator);
        }
        
        NodoColumna newNode = new NodoColumna(elemento);
        
        if (bottom == null) {
            bottom = top = newNode;
        } else {
            newNode.setNxt(top);
            top = newNode;
        }        
    }
    
    public void Listar(JTable control) {
        String[] header = {"Cod Columna","Peso Maximo (Kg)"}; 
        DefaultTableModel modTabla = new DefaultTableModel(header, 0);
        control.setModel(modTabla);
        
        NodoColumna cur = top;
        while(cur != null) {
            modTabla.addRow(cur.getElemento().getRegistro());
            cur = cur.getNxt();
        }
    }
    
    public void Decapitar() {
        if (isEmpty()) return;
        top = top.getNxt();
    }
    
    public void DecapitarVacios() {
        PilaColumna aux = new PilaColumna();
        
        NodoColumna cur = top;
        while(cur != null) {
            if (cur.getElemento().isEmpty()) {
                Decapitar();
            } else {
                aux.Apilar(cur.getElemento());
                Decapitar();
            }
            cur = top;
        }
        
        cur = aux.getTop();
        while(cur != null) {
            Apilar(cur.getElemento());
            cur = cur.getNxt();
        }
    }
    
    public boolean isEmpty() {
        return top == null;
    }
    
    public boolean checkContainerSize() {
        if (isEmpty()) return true;
        
        NodoColumna cur = top;
        
        while(cur != null) {
            if (cur.getElemento().getContenedores().getSize() < 5) return false;
            cur = cur.getNxt();
        }
        return true;
    }
    
    public Columna getElementoPorId(int idCol) {
        NodoColumna cur = top;
        while (cur != null) {
            if (cur.getElemento().getCodColumna() == idCol) return cur.getElemento();
            cur = cur.getNxt();
        }
        return null;
    }

    public NodoColumna getBottom() {
        return bottom;
    }

    public void setBottom(NodoColumna bottom) {
        this.bottom = bottom;
    }

    public NodoColumna getTop() {
        return top;
    }

    public void setTop(NodoColumna top) {
        this.top = top;
    }
    
    
}
