package Control;

import Modelo.Expediente;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PilaExpediente {
    private NodoExpediente bottom,top;
    private int size;
    private int codeGenerator;

    public PilaExpediente() {
        bottom = top = null;
        size = codeGenerator = 1;
        
    }
    
    public void Apilar(Expediente elemento) {
        if (size > 10) {
            JOptionPane.showMessageDialog(null, "Capacidad Maxima alcanzada");
            return;
        }
        if (elemento.getNumeroFolio() == 0) elemento.setNumeroFolio(codeGenerator++);

        NodoExpediente newNode = new NodoExpediente(elemento);
        
        if (bottom == null) {
            bottom = top = newNode;
        } else {
            newNode.setNxt(top);
            top = newNode;
        }      
        
        size++;
    }
    
    public Expediente DesapilarPorFolio(int numFolio) {
        if (isEmpty()) return null;
        PilaExpediente aux = new PilaExpediente();
        
        while(top.getElemento().getNumeroFolio() != numFolio) {
            aux.Apilar(top.getElemento());
            Decapitar();
        }
        Expediente elemento = top.getElemento();
        top = top.getNxt();
        
        NodoExpediente cur = aux.getTop();
        while(cur != null) {
            Apilar(cur.getElemento());
            cur = cur.getNxt();
        }
        
        return elemento;
    }
    
    public void Decapitar() {
        if (isEmpty()) return;
        top = top.getNxt();
        size--;
    }
    
    public void Listar(JTable control) {
        OrdenarPorPrioridad();
        String[] header = {"Numero Folio","Nombre Cliente","Fecha Ingreso","Prioridad"};
        DefaultTableModel modTable = new DefaultTableModel(header, 0);
        control.setModel(modTable);
        
        NodoExpediente cur = top;
        while(cur != null) {
            modTable.addRow(cur.getElemento().getRegistro());
            cur = cur.getNxt();
        }
    }
    
    public void EliminarPila() {
        bottom = top = null;
        size = 1;
    }
    
    public int getPosPilaNombre(String nombre) {
        if (isEmpty()) return -1;
        NodoExpediente cur = top;
        int curPos = 1;
        while(cur != null) {
            if (cur.getElemento().getCliente().equalsIgnoreCase(nombre)) {
                return curPos;
            }
            curPos++;
            cur = cur.getNxt();
        }
        return -1;
    }
    
    public void OrdenarPorPrioridad() {
        PilaExpediente auxBaja,auxMedia,auxAlta;
        auxBaja = new PilaExpediente();
        auxMedia = new PilaExpediente();
        auxAlta = new PilaExpediente();
        NodoExpediente cur = top;
        while(cur != null) {
            if (cur.getElemento().getPrioridad().equals("Baja")) {
                auxBaja.Apilar(cur.getElemento());
            } else if(cur.getElemento().getPrioridad().equals("Media")) {
                auxMedia.Apilar(cur.getElemento());
            } else {
                auxAlta.Apilar(cur.getElemento());
            }
            cur = cur.getNxt();
        }
        EliminarPila();
        
        cur = auxBaja.getTop();
        while(cur != null) {
            Apilar(cur.getElemento());
            cur = cur.getNxt();
        }
        cur = auxMedia.getTop();
        while(cur != null) {
            Apilar(cur.getElemento());
            cur = cur.getNxt();
        }
        cur = auxAlta.getTop();
        while(cur != null) {
            Apilar(cur.getElemento());
            cur = cur.getNxt();
        }
    }    

    
    public boolean isEmpty() {
        return (bottom == null);
    }

    public NodoExpediente getBottom() {
        return bottom;
    }

    public void setBottom(NodoExpediente bottom) {
        this.bottom = bottom;
    }

    public NodoExpediente getTop() {
        return top;
    }

    public void setTop(NodoExpediente top) {
        this.top = top;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
    
    
}
