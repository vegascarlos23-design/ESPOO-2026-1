package Control;

import Modelo.Libro;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TreeLibros {
    private NodoLibro root;
    private Set<String> generos = new LinkedHashSet<>();
    
    public TreeLibros() {
        root = null;
    }
    
    public void Agregar(Libro elemento) {
        root = Agregar(elemento, root);
    }

    private NodoLibro Agregar(Libro elemento, NodoLibro root) {
        if (root == null) {
            return new NodoLibro(elemento);
        } else if (elemento.getIsbn() < root.getElemento().getIsbn()) {
            root.setlC(Agregar(elemento,root.getlC()));
        } else if (elemento.getIsbn() > root.getElemento().getIsbn()) {
            root.setrC(Agregar(elemento,root.getrC()));
        } else {
            JOptionPane.showMessageDialog(null, "El codigo ya existe");
            return root;
        }
        return root;
    }
    
    public void Editar(Libro elemento) {
        NodoLibro nodeEdit = getNodeIsbn(elemento.getIsbn());
        nodeEdit.setElemento(elemento);
    }
    
    public void Eliminar(int CodigoDel) {
        root = Eliminar(CodigoDel, root);
    }
    
    private NodoLibro Eliminar(int codigoDel, NodoLibro root) {
        if (root == null) {
            return null;
        } 
        if (codigoDel < root.getElemento().getIsbn()) {
            root.setlC(Eliminar(codigoDel, root.getlC()));
        } else if (codigoDel > root.getElemento().getIsbn()) {
            root.setrC(Eliminar(codigoDel, root.getrC()));
        } else if (root.getlC() != null && root.getrC() != null) {
            root.setElemento(getMaxLeft(root.getlC()).getElemento());
            root.setlC(EliminarMaxLeft(root.getlC()));
        } else {
            root = (root.getlC() != null) ? root.getlC() : root.getrC();
        }
        return root;
    }
    
    private NodoLibro getMaxLeft(NodoLibro root) {
        if (root != null) {
            while(root.getrC() != null) {
                root = root.getrC();
            }
        }
        return root;
    }
    
    private NodoLibro EliminarMaxLeft(NodoLibro root) {
        if (root == null) {
            return null;
        } else if (root.getrC() != null) {
            root.setrC(EliminarMaxLeft(root.getrC()));
            return root;
        } 
        return root.getlC();        
    }
    
    
    public void Listar(JTable control, String categoria) {
        String[] header = {"Isbn","Titulo","Genero","Paginas"};
        DefaultTableModel modTable = new DefaultTableModel(header,0);
        control.setModel(modTable);   
    
        InOrder(modTable, root, categoria);
    }
    
    private void InOrder(DefaultTableModel modTable, NodoLibro root, String genero) {
        if (root == null) {
            return;
        }
        InOrder(modTable, root.getlC(), genero);
        if (root.getElemento().getGenero().equalsIgnoreCase(genero) || genero.equalsIgnoreCase("Todos")) {
            modTable.addRow(root.getElemento().getRegistro());              
        }
        InOrder(modTable, root.getrC(), genero);
    }
    
    
    public NodoLibro getNodeIsbn(int codigo) {
        NodoLibro aux = root;
        while(aux != null) {
            if (aux.getElemento().getIsbn() == codigo) {
                return aux;
            } else if (aux.getElemento().getIsbn() > codigo) {
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
        
        generos.clear();
        generos.add("Todos");
        
        getGeneros(root);
        for (String elemento : generos) {
            modCombo.addElement(elemento);
        }
    }
    
    private void getGeneros(NodoLibro root) {
        if (root == null) {
            return;
        }
        
        getGeneros(root.getlC());
        generos.add(root.getElemento().getGenero());
        getGeneros(root.getrC());
    }
    
    public int ShowLeafs(JTable control) {
        String[] header = {"Isbn","Titulo","Genero","Paginas"};
        DefaultTableModel modTable = new DefaultTableModel(header,0);
        control.setModel(modTable);
        
        return getNumLeafs(root,modTable);
    }
    
    private int getNumLeafs(NodoLibro root, DefaultTableModel modTable) {
        if (root == null) {
            return 0;
        } 
        if (isLeaf(root)) {
            modTable.addRow(root.getElemento().getRegistro());
            return 1;
        }
        
        return (getNumLeafs(root.getlC(),modTable) + getNumLeafs(root.getrC(),modTable));
    }
    
    public boolean isLeaf(NodoLibro node) {
        return (node.getlC() == null && node.getrC() == null);
    }
    
    public void ShowLowPages(JTable control) {
        String[] header = {"Isbn","Titulo","Genero","Paginas"};
        DefaultTableModel modTable = new DefaultTableModel(header,0);
        control.setModel(modTable);   
        
        int lowPages = getLowPages(root);
        inOrderLowPages(modTable, root, lowPages);
    }
    
    private void inOrderLowPages(DefaultTableModel modTable, NodoLibro root, int lowPages) {
        if (root == null) {
            return;
        }
        
        inOrderLowPages(modTable, root.getlC(), lowPages);
        if (root.getElemento().getPaginas()== lowPages) {
            modTable.addRow(root.getElemento().getRegistro());
        }
        inOrderLowPages(modTable, root.getrC(), lowPages);
    }
    
    public int getLowPages(NodoLibro root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        int curStock = root.getElemento().getPaginas();
        
        return Integer.min(curStock, Integer.min(getLowPages(root.getlC()), getLowPages(root.getrC())));
    }
    
    public int getLevelNodes(int n) {
        return getLevelNodes(root,1,n);
    }
    
    private int getLevelNodes(NodoLibro root, int level, int n) {
        if (root == null) return 0;       
        
        if (level == n) return 1;
        
        return (getLevelNodes(root.getlC(), level+1, n) + getLevelNodes(root.getrC(), level+1, n));      
    }
    
    public NodoLibro getRoot() {
        return root;
    }

    public void setRoot(NodoLibro root) {
        this.root = root;
    }    
}
