package Control;

import Modelo.Paciente;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TreePacientes {
    private NodoPaciente root;
    private Set<String> areas = new LinkedHashSet<>();
    
    public TreePacientes() {
        root = null;
    }
    
    public void Agregar(Paciente elemento) {
        root = Agregar(elemento, root);
    }

    private NodoPaciente Agregar(Paciente elemento, NodoPaciente root) {
        if (root == null) {
            return new NodoPaciente(elemento);
        } else if (elemento.getHistorialClinico()< root.getElemento().getHistorialClinico()) {
            root.setlC(Agregar(elemento,root.getlC()));
        } else if (elemento.getHistorialClinico()> root.getElemento().getHistorialClinico()) {
            root.setrC(Agregar(elemento,root.getrC()));
        } else {
            JOptionPane.showMessageDialog(null, "El codigo ya existe");
            return root;
        }
        return root;
    }
    
    public void Editar(Paciente elemento) {
        NodoPaciente nodeEdit = getNodeHis(elemento.getHistorialClinico());
        nodeEdit.setElemento(elemento);
    }
    
    public void Eliminar(int CodigoDel) {
        root = Eliminar(CodigoDel, root);
    }
    
    private NodoPaciente Eliminar(int codigoDel, NodoPaciente root) {
        if (root == null) {
            return null;
        } 
        if (codigoDel < root.getElemento().getHistorialClinico()) {
            root.setlC(Eliminar(codigoDel, root.getlC()));
        } else if (codigoDel > root.getElemento().getHistorialClinico()) {
            root.setrC(Eliminar(codigoDel, root.getrC()));
        } else if (root.getlC() != null && root.getrC() != null) {
            root.setElemento(getMaxLeft(root.getlC()).getElemento());
            root.setlC(EliminarMaxLeft(root.getlC()));
        } else {
            root = (root.getlC() != null) ? root.getlC() : root.getrC();
        }
        return root;
    }
    
    private NodoPaciente getMaxLeft(NodoPaciente root) {
        if (root != null) {
            while(root.getrC() != null) {
                root = root.getrC();
            }
        }
        return root;
    }
    
    private NodoPaciente EliminarMaxLeft(NodoPaciente root) {
        if (root == null) {
            return null;
        } else if (root.getrC() != null) {
            root.setrC(EliminarMaxLeft(root.getrC()));
            return root;
        } 
        return root.getlC();        
    }
    
    
    public void Listar(JTable control, String areaAtencion) {
        String[] header = {"Historial Clinico","Nombres","Area de Atencion","Edad"};
        DefaultTableModel modTable = new DefaultTableModel(header,0);
        control.setModel(modTable);   
        
        InOrder(modTable, root, areaAtencion);
    }
    
    private void InOrder(DefaultTableModel modTable, NodoPaciente root, String categoria) {
        if (root == null) {
            return;
        }
        InOrder(modTable, root.getlC(), categoria);
        if (root.getElemento().getAreaAtencion().equalsIgnoreCase(categoria) || categoria.equalsIgnoreCase("Todos")) {
            modTable.addRow(root.getElemento().getRegistro());              
        }
        InOrder(modTable, root.getrC(), categoria);
    }
    
    public NodoPaciente getNodeHis(int codigo) {
        NodoPaciente aux = root;
        while(aux != null) {
            if (aux.getElemento().getHistorialClinico() == codigo) {
                return aux;
            } else if (aux.getElemento().getHistorialClinico() > codigo) {
                aux = aux.getlC();
            } else {
                aux = aux.getrC();
            }
        }
        return null;
    }
    
    public void CargarCombo(JComboBox control) {
        DefaultComboBoxModel modCombo = new DefaultComboBoxModel();
        control.setModel(modCombo);
        
        areas.clear();
        areas.add("Todos");
        
        getAreas(root);
        for (String elemento : areas) {
            modCombo.addElement(elemento);
        }
    }
    
    private void getAreas(NodoPaciente root) {
        if (root == null) {
            return;
        }
        
        getAreas(root.getlC());
        areas.add(root.getElemento().getAreaAtencion());
        getAreas(root.getrC());
    }
    
    
    public void ShowHighAge(JTable control) {
        String[] header = {"Historial Clinico","Nombres","Area de Atencion","Edad"};
        DefaultTableModel modTable = new DefaultTableModel(header,0);
        control.setModel(modTable);   
        
        int highStock = getHighAge(root);
        inOrderHighAge(modTable, root, highStock);
    }
    
    private void inOrderHighAge(DefaultTableModel modTable, NodoPaciente root, int highAge) {
        if (root == null) {
            return;
        }
        
        inOrderHighAge(modTable, root.getlC(), highAge);
        if (root.getElemento().getEdad() == highAge) {
            modTable.addRow(root.getElemento().getRegistro());
        }
        inOrderHighAge(modTable, root.getrC(), highAge);
    }
    
    private int getHighAge(NodoPaciente root) {
        if (root == null) {
            return 0;
        }
        int curStock = root.getElemento().getEdad();
        
        return Integer.max(curStock, Integer.max(getHighAge(root.getlC()), getHighAge(root.getrC())));
    }
    
    public int getAgeSum() {
        return getAgeSum(root);
    }
    
    private int getAgeSum (NodoPaciente root) {
        if (root == null) {
            return 0;
        }
        int curSum = root.getElemento().getEdad();
        
        return (curSum + getAgeSum(root.getlC()) + getAgeSum(root.getrC()));
    }
    
    public ArrayList<Integer> FindPathHis(int historialClinico) {
        ArrayList<Integer> path = new ArrayList<>();
        return HisPath(path,root,historialClinico);
    }
    
    private ArrayList<Integer> HisPath(ArrayList<Integer> path, NodoPaciente root, int historialClinico) {
        if (root == null) {
            return null;
        }
        path.add(root.getElemento().getHistorialClinico());
        if (historialClinico < root.getElemento().getHistorialClinico()) {            
            return HisPath(path, root.getlC(), historialClinico);
        } else if (historialClinico > root.getElemento().getHistorialClinico()) {
            return HisPath(path, root.getrC(), historialClinico);
        } else {
            return path;
        }
    }
    
    public NodoPaciente getRoot() {
        return root;
    }

    public void setRoot(NodoPaciente root) {
        this.root = root;
    }    
}
