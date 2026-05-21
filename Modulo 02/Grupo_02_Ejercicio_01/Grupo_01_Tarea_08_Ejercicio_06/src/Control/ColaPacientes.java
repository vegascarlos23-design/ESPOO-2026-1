package Control;

import Modelo.Paciente;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ColaPacientes {
    private NodoPaciente front,back;

    public ColaPacientes() {
        front = back = null;
    }
    
    public void Encolar(Paciente elemento) {
        NodoPaciente newNode = new NodoPaciente(elemento);
        if (isEmpty()) {
            front = back = newNode;
            return;
        }         
        
        if (elemento.getNivelUrgencia() > front.getElemento().getNivelUrgencia()) {
            newNode.setNxt(front);
            front = newNode;
            return;
        }
        
        NodoPaciente cur = front;
        
        while(cur.getNxt() != null && cur.getNxt().getElemento().getNivelUrgencia() >= elemento.getNivelUrgencia()) {
            cur = cur.getNxt();
        }
        
        newNode.setNxt(cur.getNxt());
        cur.setNxt(newNode);
        
        if(newNode.getNxt() == null) {
            back = newNode;
        }
    }
    
    public Paciente Desencolar() {
        if (isEmpty()) return null;
        Paciente aux = front.getElemento();
        front = front.getNxt();
        return aux;
    }
    
    public void Decapitar() {
        if (isEmpty()) return;
        front = front.getNxt();
    }
    
    public void Listar(JTable control) {
        String[] header = {"DNI","Nombre","Nivel Urgencia"};
        DefaultTableModel modTabla = new DefaultTableModel(header, 0);
        control.setModel(modTabla);
        
        NodoPaciente cur = front;
        while(cur != null) {
            modTabla.addRow(cur.getElemento().getRegistro());
            cur = cur.getNxt();
        }
    }
    
    public boolean isEmpty() {
        return front == null;
    }
    
    public NodoPaciente getPacientePorDni(String dni) {
        NodoPaciente cur = front;
        while(cur != null) {
            if (cur.getElemento().getDni().equalsIgnoreCase(dni)) return cur;
            cur = cur.getNxt();
        }
        return null;
    }

    public NodoPaciente getFront() {
        return front;
    }

    public void setFront(NodoPaciente front) {
        this.front = front;
    }

    public NodoPaciente getBack() {
        return back;
    }

    public void setBack(NodoPaciente back) {
        this.back = back;
    }
    
    
}
