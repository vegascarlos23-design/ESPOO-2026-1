package Control;

import Modelo.Contenedor;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PilaContenedor {
    private NodoContenedor bottom,top;
    private int size,maxSize,pesoAcumulado;

    public PilaContenedor() {
        bottom = top = null;
        size = 0; maxSize = 6; pesoAcumulado = 0;
    }
    
    public int Apilar(Contenedor elemento, int pesoMaximo) {
        if (size >= maxSize) {
            JOptionPane.showMessageDialog(null, "Capacidad maxima de 6 contenedores alcanzada");
            return -1;
        }
        
        NodoContenedor newNode = new NodoContenedor(elemento);
               
        if (pesoAcumulado+elemento.getPeso() > pesoMaximo) {
            JOptionPane.showMessageDialog(null, "Peso maximo alcanzado");
            return 0;
        }
        pesoAcumulado += elemento.getPeso();
        
        if (bottom == null) {
            bottom = top = newNode;
        } else {
            newNode.setNxt(top);
            top = newNode;
        }
        size++;
        return 1;
    }
    
    public void Listar(JTable control) {
        String[] header = {"ID Contenedor","Peso","Contenido","Pais de Origen"};
        DefaultTableModel modTabla = new DefaultTableModel(header, 0);
        control.setModel(modTabla);
        
        NodoContenedor cur = top;
        while(cur != null) {
            modTabla.addRow(cur.getElemento().getRegistro());
            cur = cur.getNxt();
        }
    }
    
    public void Decapitar() {
        if (isEmpty()) return;
        pesoAcumulado -= top.getElemento().getPeso();
        top = top.getNxt();
        size--;
    }
    public Contenedor DesapilarMedio() {
        if (isEmpty()) return null;
        PilaContenedor aux = new PilaContenedor();
        
        NodoContenedor cur = top;
        for (int i = 0; i < size/2; i++) {
            aux.Apilar(cur.getElemento(), Integer.MAX_VALUE);
            Decapitar();
            cur = top;
        }
        
        Contenedor elemento = cur.getElemento();
        pesoAcumulado -= top.getElemento().getPeso();
        top = top.getNxt();
        size--;
        
        cur = aux.getTop();
        while(cur != null) {
            Apilar(cur.getElemento(), Integer.MAX_VALUE);
            cur = cur.getNxt();
        }
        
        return elemento;        
    }
    
    public void EliminarPorPais(String paisEliminar) {
        PilaContenedor aux = new PilaContenedor();
        
        NodoContenedor cur = top;
        while(cur != null) {
            if (cur.getElemento().getPaisOrigen().equals(paisEliminar)) {
                Decapitar();
            } else {
                aux.Apilar(cur.getElemento(),Integer.MAX_VALUE);
                Decapitar();
            }
            cur = top;
        }
        
        cur = aux.getTop();
        while(cur != null) {
            Apilar(cur.getElemento(),Integer.MAX_VALUE);
            cur = cur.getNxt();
        }
    }
    
    public boolean isEmpty() {
        return top == null;
    }

    public NodoContenedor getBottom() {
        return bottom;
    }

    public void setBottom(NodoContenedor bottom) {
        this.bottom = bottom;
    }

    public NodoContenedor getTop() {
        return top;
    }

    public void setTop(NodoContenedor top) {
        this.top = top;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
    
    
    
    
    
}
