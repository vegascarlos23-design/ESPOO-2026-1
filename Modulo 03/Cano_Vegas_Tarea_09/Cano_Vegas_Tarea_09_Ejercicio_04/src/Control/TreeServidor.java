package Control;

import Modelo.Servidor;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TreeServidor {
    private NodoServidor root;
    private Set<String> centoDatos = new LinkedHashSet<>();
    
    public TreeServidor() {
        root = null;
    }
    
    public void Agregar(Servidor elemento) {
        root = Agregar(elemento, root);
    }

    private NodoServidor Agregar(Servidor elemento, NodoServidor root) {
        if (root == null) {
            return new NodoServidor(elemento);
        } else if (elemento.getIpNumerica() < root.getElemento().getIpNumerica()) {
            root.setlC(Agregar(elemento,root.getlC()));
        } else if (elemento.getIpNumerica() > root.getElemento().getIpNumerica()) {
            root.setrC(Agregar(elemento,root.getrC()));
        } else {
            JOptionPane.showMessageDialog(null, "El codigo ya existe");
            return root;
        }
        return root;
    }
    
    public void Editar(Servidor elemento) {
        NodoServidor nodeEdit = getNodeIpNumerica(elemento.getIpNumerica());
        nodeEdit.setElemento(elemento);
    }
    
    public void Eliminar(int CodigoDel) {
        root = Eliminar(CodigoDel, root);
    }
    
    private NodoServidor Eliminar(int codigoDel, NodoServidor root) {
        if (root == null) {
            return null;
        } 
        if (codigoDel < root.getElemento().getIpNumerica()) {
            root.setlC(Eliminar(codigoDel, root.getlC()));
        } else if (codigoDel > root.getElemento().getIpNumerica()) {
            root.setrC(Eliminar(codigoDel, root.getrC()));
        } else if (root.getlC() != null && root.getrC() != null) {
            root.setElemento(getMaxLeft(root.getlC()).getElemento());
            root.setlC(EliminarMaxLeft(root.getlC()));
        } else {
            root = (root.getlC() != null) ? root.getlC() : root.getrC();
        }
        return root;
    }
    
    private NodoServidor getMaxLeft(NodoServidor root) {
        if (root != null) {
            while(root.getrC() != null) {
                root = root.getrC();
            }
        }
        return root;
    }
    
    private NodoServidor EliminarMaxLeft(NodoServidor root) {
        if (root == null) {
            return null;
        } else if (root.getrC() != null) {
            root.setrC(EliminarMaxLeft(root.getrC()));
            return root;
        } 
        return root.getlC();        
    }
    
    
    public void Listar(JTable control, String centro) {
        String[] header = {"Ip Numerica","Nombre Servidor","Centro de Datos","Consumo de Ram (GB)"};
        DefaultTableModel modTable = new DefaultTableModel(header,0);
        control.setModel(modTable);   
    
        InOrder(modTable, root, centro);
    }
    
    private void InOrder(DefaultTableModel modTable, NodoServidor root, String centro) {
        if (root == null) {
            return;
        }
        InOrder(modTable, root.getlC(), centro);
        if (root.getElemento().getCentroDatos().equalsIgnoreCase(centro) || centro.equalsIgnoreCase("Todos")) {
            modTable.addRow(root.getElemento().getRegistro());              
        }
        InOrder(modTable, root.getrC(), centro);
    }
    
    
    public NodoServidor getNodeIpNumerica(int codigo) {
        NodoServidor aux = root;
        while(aux != null) {
            if (aux.getElemento().getIpNumerica() == codigo) {
                return aux;
            } else if (aux.getElemento().getIpNumerica() > codigo) {
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
        
        centoDatos.clear();
        centoDatos.add("Todos");
        
        getCentroDatos(root);
        for (String elemento : centoDatos) {
            modCombo.addElement(elemento);
        }
    }
    
    private void getCentroDatos(NodoServidor root) {
        if (root == null) {
            return;
        }
        
        getCentroDatos(root.getlC());
        centoDatos.add(root.getElemento().getCentroDatos());
        getCentroDatos(root.getrC());
    }
   
    
    public void ShowHighRam(JTable control) {
        String[] header = {"Ip Numerica","Nombre Servidor","Centro de Datos","Consumo de Ram (GB)"};
        DefaultTableModel modTable = new DefaultTableModel(header,0);
        control.setModel(modTable);   
        
        double highRam = getHighRam(root);
        inOrderHighRam(modTable, root, highRam);
    }
    
    private void inOrderHighRam(DefaultTableModel modTable, NodoServidor root, double highRam) {
        if (root == null) {
            return;
        }
        
        inOrderHighRam(modTable, root.getlC(), highRam);
        if (root.getElemento().getConsumoRamGB()== highRam) {
            modTable.addRow(root.getElemento().getRegistro());
        }
        inOrderHighRam(modTable, root.getrC(), highRam);
    }
    
    public double getHighRam(NodoServidor root) {
        if (root == null) {
            return 0;
        }
        double curRam = root.getElemento().getConsumoRamGB();
        
        return Math.max(curRam, Math.max(getHighRam(root.getlC()), getHighRam(root.getrC())));
    }
    
    public void ListarPorAmplitud(JTable control) {
        String[] header = {"Ip Numerica","Nombre Servidor","Centro de Datos","Consumo de Ram (GB)"};
        DefaultTableModel modTable = new DefaultTableModel(header,0);
        control.setModel(modTable);   
    
        Bfs(modTable);
    }
    
    private void Bfs(DefaultTableModel modTable) {
        if (root == null) return;
        Queue<NodoServidor> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()) {
            NodoServidor front = q.poll();
            
            modTable.addRow(front.getElemento().getRegistro());
            
            if (front.getlC() != null) q.add(front.getlC());
            if (front.getrC() != null) q.add(front.getrC());
        }
    }
    
    public void BuscarPorNombre(JTable control, String filtro) {
        String[] header = {"Ip Numerica","Nombre Servidor","Centro de Datos","Consumo de Ram (GB)"};
        DefaultTableModel modTable = new DefaultTableModel(header,0);
        control.setModel(modTable);   
        
        inOrderFiltro(root, modTable, filtro);
    }
    
    private void inOrderFiltro(NodoServidor root,DefaultTableModel modTable, String filtro) {
        if (root == null) return;
        
        inOrderFiltro(root.getlC(), modTable, filtro);
        if (root.getElemento().getNombreServidor().toUpperCase().contains(filtro.toUpperCase())) {
            modTable.addRow(root.getElemento().getRegistro());
        }
        inOrderFiltro(root.getrC(), modTable, filtro);
    }
    
    
    public NodoServidor getRoot() {
        return root;
    }

    public void setRoot(NodoServidor root) {
        this.root = root;
    }    
}
