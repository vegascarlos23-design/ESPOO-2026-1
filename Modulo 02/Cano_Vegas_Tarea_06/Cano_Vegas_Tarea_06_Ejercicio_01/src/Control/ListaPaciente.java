package Control;

import Modelo.Paciente;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListaPaciente {
    private NodoPaciente head,end;
    private int codeGenerator;
    private int size;
    
    public ListaPaciente() {
        head = end = null;
        codeGenerator = 1;
    }
    
    public boolean Registrar(Paciente elemento) {
        elemento.setCodigo(codeGenerator);
        NodoPaciente newNode = new NodoPaciente(elemento);
        if (head == null) {
            head = end = newNode;
            end.setNxt(head);
        } else {
            end.setNxt(newNode);
            end = newNode;
            end.setNxt(head);
        }
        codeGenerator++;
        size++;
        return true;
    }
    
    public boolean RegistrarEnPosicion(Paciente elemento,int pos) {
        if (pos < 0 || pos > size) {
            JOptionPane.showMessageDialog(null, "Posicion no valida");
            return false;
        }
        
        elemento.setCodigo(codeGenerator);
        NodoPaciente newNode = new NodoPaciente(elemento);
        if (head == null) {
            head = end = newNode;
            end.setNxt(head);
        } else if(pos == 0) {
            newNode.setNxt(head);
            head = newNode;
            end.setNxt(head);
        } else if(pos == size) {
            newNode.setNxt(head);
            end.setNxt(newNode);
            end = newNode;
        } else {
            NodoPaciente cur = head;
            for (int i = 0; i < pos-1; i++) {
                cur = cur.getNxt();
            }
            
            newNode.setNxt(cur.getNxt());
            cur.setNxt(newNode);
        }
        codeGenerator++;
        size++;
        return true;
    }
    
    public void Editar(int CodigoPacienteEditar, Paciente elemento) {
        NodoPaciente NodoAeditar = getNodoPorCodigo(CodigoPacienteEditar);
        String nombre = elemento.getNombreCompleto();
        Date horaCita = elemento.getHoraCita();
        NodoAeditar.getElemento().setNombreCompleto(nombre);
        NodoAeditar.getElemento().setHoraCita(horaCita);
        
    }
    
    public boolean Eliminar(int CodigoPacienteEliminar) {
        NodoPaciente cur = head;
        NodoPaciente anterior = end;

        do {
            if (cur.getElemento().getCodigo() == CodigoPacienteEliminar) {

                if (head == end) {
                    head = null;
                    end = null;
                } else if (cur == head) {
                    head = head.getNxt();
                    end.setNxt(head);
                } else if (cur == end) {
                    end = anterior;
                    end.setNxt(head);
                } else {
                    anterior.setNxt(cur.getNxt());
                }
                
                size--;
                return true;
            }

            anterior = cur;
            cur = cur.getNxt();

        } while (cur != head);
        return false;
    }
    
    public void Listar(JTable control) {
        String[] header = {"Codigo","Nombre","DNI","Hora Cita","Estado"};
        DefaultTableModel modTable = new DefaultTableModel(header,0);
        control.setModel(modTable);
        
        try {
            NodoPaciente cur = head;
            do {            
                modTable.addRow(cur.getElemento().getRegistro());
                cur = cur.getNxt();
            } while (cur != head);
        } catch (Exception e) {
        }      
    }
    
    public NodoPaciente getNodoPorDni(String dni) {
        NodoPaciente cur = head;
        do {            
            if(cur.getElemento().getDni().equalsIgnoreCase(dni)) return cur;
            cur = cur.getNxt();
        } while (cur != head);
        return null;
    }
    
    public NodoPaciente getNodoPorCodigo(int codigo) {
        NodoPaciente cur = head;
        do {            
            if(cur.getElemento().getCodigo() == codigo) return cur;
            cur = cur.getNxt();
        } while (cur != head);
        return null;
    }
    
    
    public void SelectionSort() {
        if (end == null || end.getNxt() == end) return;

        NodoPaciente i = head;
        do {
            NodoPaciente menor = i;
            NodoPaciente j = i.getNxt();

            while (j != head){
                if (j.getElemento().getHoraCita().before(menor.getElemento().getHoraCita())) {
                    menor = j;
                }
                j = j.getNxt();
            }
                            
            Paciente temp = i.getElemento();
            i.setElemento(menor.getElemento());
            menor.setElemento(temp);

            i = i.getNxt();

        } while (i != end.getNxt());
    }
    
}
