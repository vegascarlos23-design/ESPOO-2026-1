package Control;

import Modelo.Herramienta;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TreeHerramientas {
    private NodoHerramienta root;
    private Set<String> categorias = new LinkedHashSet<>();
    
    public TreeHerramientas() {
        root = null;
    }
    
    public void Agregar(Herramienta elemento) {
        root = Agregar(elemento, root);
    }

    private NodoHerramienta Agregar(Herramienta elemento, NodoHerramienta root) {
        if (root == null) {
            return new NodoHerramienta(elemento);
        } else if (elemento.getCodigo_barras() < root.getElemento().getCodigo_barras()) {
            root.setlC(Agregar(elemento,root.getlC()));
        } else if (elemento.getCodigo_barras() > root.getElemento().getCodigo_barras()) {
            root.setrC(Agregar(elemento,root.getrC()));
        } else {
            JOptionPane.showMessageDialog(null, "El codigo ya existe");
            return root;
        }
        return root;
    }
    
    public void Editar(Herramienta elemento) {
        NodoHerramienta nodeEdit = getNodeCod(elemento.getCodigo_barras());
        nodeEdit.setElemento(elemento);
    }
    
    public void Eliminar(int CodigoDel) {
        root = Eliminar(CodigoDel, root);
    }
    
    private NodoHerramienta Eliminar(int codigoDel, NodoHerramienta root) {
        if (root == null) {
            return null;
        } 
        if (codigoDel < root.getElemento().getCodigo_barras()) {
            root.setlC(Eliminar(codigoDel, root.getlC()));
        } else if (codigoDel > root.getElemento().getCodigo_barras()) {
            root.setrC(Eliminar(codigoDel, root.getrC()));
        } else if (root.getlC() != null && root.getrC() != null) {
            root.setElemento(getMaxLeft(root.getlC()).getElemento());
            root.setlC(EliminarMaxLeft(root.getlC()));
        } else {
            root = (root.getlC() != null) ? root.getlC() : root.getrC();
        }
        return root;
    }
    
    private NodoHerramienta getMaxLeft(NodoHerramienta root) {
        if (root != null) {
            while(root.getrC() != null) {
                root = root.getrC();
            }
        }
        return root;
    }
    
    private NodoHerramienta EliminarMaxLeft(NodoHerramienta root) {
        if (root == null) {
            return null;
        } else if (root.getrC() != null) {
            root.setrC(EliminarMaxLeft(root.getrC()));
            return root;
        } 
        return root.getlC();        
    }
    
    
    public void Listar(JTable control, int criterio, String categoria) {
        String[] header = {"Codigo","Descripcion","Categoria","Stock"};
        DefaultTableModel modTable = new DefaultTableModel(header,0);
        control.setModel(modTable);   
        
        if (criterio == 1) PreOrder(modTable, root, categoria);
        else if (criterio == 2) InOrder(modTable, root, categoria);
        else PostOrder(modTable, root, categoria);
    }
    
    private void InOrder(DefaultTableModel modTable, NodoHerramienta root, String categoria) {
        if (root == null) {
            return;
        }
        InOrder(modTable, root.getlC(), categoria);
        if (root.getElemento().getCategoria().equalsIgnoreCase(categoria) || categoria.equalsIgnoreCase("Todos")) {
            modTable.addRow(root.getElemento().getRegistro());              
        }
        InOrder(modTable, root.getrC(), categoria);
    }
    
    private void PreOrder(DefaultTableModel modTable, NodoHerramienta root, String categoria) {
        if (root == null) {
            return;
        }
        if (root.getElemento().getCategoria().equalsIgnoreCase(categoria) || categoria.equalsIgnoreCase("Todos")) {
            modTable.addRow(root.getElemento().getRegistro());              
        }
        PreOrder(modTable, root.getlC(), categoria);
        PreOrder(modTable, root.getrC(), categoria);
    }
    
    private void PostOrder(DefaultTableModel modTable, NodoHerramienta root, String categoria) {
        if (root == null) {
            return;
        }
        PostOrder(modTable, root.getlC(), categoria);        
        PostOrder(modTable, root.getrC(), categoria);
        if (root.getElemento().getCategoria().equalsIgnoreCase(categoria) || categoria.equalsIgnoreCase("Todos")) {
            modTable.addRow(root.getElemento().getRegistro());              
        }       
    }
    
    public NodoHerramienta getNodeCod(int codigo) {
        NodoHerramienta aux = root;
        while(aux != null) {
            if (aux.getElemento().getCodigo_barras() == codigo) {
                return aux;
            } else if (aux.getElemento().getCodigo_barras() > codigo) {
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
        
        categorias.clear();
        categorias.add("Todos");
        
        getCategorias(root);
        for (String elemento : categorias) {
            modCombo.addElement(elemento);
        }
    }
    
    private void getCategorias(NodoHerramienta root) {
        if (root == null) {
            return;
        }
        
        getCategorias(root.getlC());
        categorias.add(root.getElemento().getCategoria());
        getCategorias(root.getrC());
    }
    
    public int getNumLeafs() {
        return getNumLeafs(root);
    }
    
    private int getNumLeafs(NodoHerramienta root) {
        if (root == null) {
            return 0;
        } 
        if (isLeaf(root)) return 1;
        
        return (getNumLeafs(root.getlC()) + getNumLeafs(root.getrC()));
    }
    
    public boolean isLeaf(NodoHerramienta node) {
        return (node.getlC() == null && node.getrC() == null);
    }
    
    public void ShowHighStock(JTable control) {
        String[] header = {"Codigo","Descripcion","Categoria","Stock"};
        DefaultTableModel modTable = new DefaultTableModel(header,0);
        control.setModel(modTable);   
        
        int highStock = getHighStock(root);
        inOrderHighStock(modTable, root, highStock);
    }
    
    private void inOrderHighStock(DefaultTableModel modTable, NodoHerramienta root, int highStock) {
        if (root == null) {
            return;
        }
        
        inOrderHighStock(modTable, root.getlC(), highStock);
        if (root.getElemento().getStock() == highStock) {
            modTable.addRow(root.getElemento().getRegistro());
        }
        inOrderHighStock(modTable, root.getrC(), highStock);
    }
    
    public int getHighStock(NodoHerramienta root) {
        if (root == null) {
            return 0;
        }
        int curStock = root.getElemento().getStock();
        
        return Integer.max(curStock, Integer.max(getHighStock(root.getlC()), getHighStock(root.getrC())));
    }
    
    public NodoHerramienta getRoot() {
        return root;
    }

    public void setRoot(NodoHerramienta root) {
        this.root = root;
    }    
}
