package Control;

import Modelo.Producto;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TreeProductos {
    private NodoAVLProducto root;

    public TreeProductos() {
        root = null;
    }
    
    public void Agregar(Producto elemento) {
        root = Agregar(root, elemento);
    }
    
    private NodoAVLProducto Agregar(NodoAVLProducto root, Producto elemento) {
        if (root == null) {
            NodoAVLProducto newNode = new NodoAVLProducto(elemento);
            return newNode;
        }
        if (elemento.getCodigo_sku() < root.getElemento().getCodigo_sku()) {
            root.setlC(Agregar(root.getlC(), elemento));
        } else if (elemento.getCodigo_sku() > root.getElemento().getCodigo_sku()) {
            root.setrC(Agregar(root.getrC(), elemento));
        } else {
            JOptionPane.showMessageDialog(null, "El codigo SKU ya existe");
        }
        return root;
    }
    
    public void Listar(JTable control) {
        String[] header = {"Cod. Sku", "Nombre", "Stock Disp.", "Precio Unitario"};
        DefaultTableModel modTable = new DefaultTableModel(header, 0);
        control.setModel(modTable);
        
        InOrder(root, modTable);
    }
    
    private void InOrder(NodoAVLProducto root, DefaultTableModel modTable) {
        if (root == null) return;
        InOrder(root.getlC(), modTable);
        modTable.addRow(root.getElemento().getRegistro());
        InOrder(root.getrC(), modTable);
    }
    
    public void Editar(Producto elemento, int codAnt) {
        if (elemento.getCodigo_sku() == codAnt) {
            NodoAVLProducto NodoEditar = getNodoPorCod(root, codAnt);
            NodoEditar.setElemento(elemento);
        } else if (getNodoPorCod(root, elemento.getCodigo_sku()) == null) {
            Eliminar(codAnt);
            Agregar(elemento);
        } else {
            JOptionPane.showMessageDialog(null, "El nuevo codigo ya existe");
        }
    }
    
    public NodoAVLProducto getNodoPorCod(NodoAVLProducto root, int cod) {
        if (root == null) return null;
        if (cod < root.getElemento().getCodigo_sku()) {
            return getNodoPorCod(root.getlC(), cod);
        }
        if (cod > root.getElemento().getCodigo_sku()) {
            return getNodoPorCod(root.getrC(), cod);
        }
        return root;
        
    }
    
    public void Eliminar(int cod) {
        root = Eliminar(root, cod);
    }
    
    private NodoAVLProducto Eliminar(NodoAVLProducto root, int cod) {
        if (root == null) return null;
        
        if (cod < root.getElemento().getCodigo_sku()) {
            root.setlC(Eliminar(root.getlC(), cod));
        }
        else if (cod > root.getElemento().getCodigo_sku()) {
            root.setrC(Eliminar(root.getrC(), cod));
        }
        else {
            if (root.getlC() != null && root.getrC() != null) {
                root.setElemento(getMayorIzq(root.getlC()).getElemento());
                root.setlC(EliminarMayorIzq(root.getlC()));
            } else {
                root = (root.getlC() == null) ? root.getrC() : root.getlC();
            }
        }
        return root;
    }
    
    private NodoAVLProducto getMayorIzq(NodoAVLProducto root) {
        if (root == null) {
            return null;
        }
        if (root.getrC() != null) {
            return getMayorIzq(root.getrC());
        }
        return root;
    }
    
    private NodoAVLProducto EliminarMayorIzq(NodoAVLProducto root) {
        if (root == null) {
            return null;
        }
        if (root.getrC() != null) {
            root.setrC(EliminarMayorIzq(root.getrC()));
            return root;
        }
        return root.getlC();
    }
    
    private int ExtraerFe(NodoAVLProducto root) {
        if (root == null) return 0;
        return root.getFE();
    }
    
    public void Equilibrar() {
        root = Equilibrar(root);
    }
    
    private NodoAVLProducto Equilibrar(NodoAVLProducto root) {
        if (root == null) return null;
        
        if (!EstaEquilibrado(root)) {
            root.setlC(Equilibrar(root.getlC()));
            root.setrC(Equilibrar(root.getrC()));
            root = Estructurar(root);
        }
        return root;
    }
    
    private boolean EstaEquilibrado(NodoAVLProducto root) {
        if (root == null) return true;
        
        int fe = root.getFE();
        if (Math.abs(fe) > 1) return false;
        
        return EstaEquilibrado(root.getlC()) && EstaEquilibrado(root.getrC());
    }
    
    private NodoAVLProducto Estructurar(NodoAVLProducto root) {
        if (ExtraerFe(root) == -2) {
            if (ExtraerFe(root.getlC()) == -1 || ExtraerFe(root.getlC()) == 0) {
                root = RotacionSimpleDer(root);
            } if (ExtraerFe(root.getlC()) == 1) {
                root = RotacionCompuestaDer(root);
            }
        }
        if (ExtraerFe(root) == 2) {
            if (ExtraerFe(root.getrC()) == 1 || ExtraerFe(root.getrC()) == 0) {
                root = RotacionSimpleIzq(root);
            } if (ExtraerFe(root.getrC()) == -1) {
                root = RotacionCompuestaIzq(root);
            }
        }
        return root;
    }
    
    private NodoAVLProducto RotacionSimpleIzq(NodoAVLProducto root) {
        JOptionPane.showMessageDialog(null, "Rotacion Simple Izquierda");
        NodoAVLProducto tmp = root;
        root = tmp.getrC();
        tmp.setrC(root.getlC());
        root.setlC(tmp);
        return root;
    }
    
    private NodoAVLProducto RotacionSimpleDer(NodoAVLProducto root) {
        JOptionPane.showMessageDialog(null, "Rotacion Simple Derecha");
        NodoAVLProducto tmp = root;
        root = tmp.getlC();
        tmp.setlC(root.getrC());
        root.setrC(tmp);
        return root;
    }
    
    private NodoAVLProducto RotacionCompuestaIzq(NodoAVLProducto root) {
        JOptionPane.showMessageDialog(null, "Rotacion Compuesta Izquierda");
        NodoAVLProducto tmp = root;
        tmp = RotacionSimpleDer(tmp.getrC());
        root.setrC(tmp);
        tmp = RotacionSimpleIzq(root);
        return tmp;
    }
    
    private NodoAVLProducto RotacionCompuestaDer(NodoAVLProducto root) {
        JOptionPane.showMessageDialog(null, "Rotacion Compuesta Derecha");
        NodoAVLProducto tmp = root;
        tmp = RotacionSimpleIzq(tmp.getlC());
        root.setlC(tmp);
        tmp = RotacionSimpleDer(root);
        return tmp;
    }
    
    public void TransferirProductos(NodoAVLProducto root) {
        InOrderTransferencia(root);
    }
    
    private void InOrderTransferencia(NodoAVLProducto root) {
        if (root == null) return;
        InOrderTransferencia(root.getlC());
        Agregar(root.getElemento());
        Equilibrar();
        InOrderTransferencia(root.getrC());
    }

    public NodoAVLProducto getRoot() {
        return root;
    }

    public void setRoot(NodoAVLProducto root) {
        this.root = root;
    }
    
    public void GuardarProductos(PrintWriter pw) {
        GuardarProductos(root, pw);
    }
    
    private void GuardarProductos(NodoAVLProducto root, PrintWriter pw) {
        if (root == null) return;
        
        GuardarProductos(root.getlC(), pw);
        
        Producto elemento = root.getElemento();
        pw.println(
            elemento.getCodigo_sku() + ";" +
            elemento.getNombreProducto() + ";" +
            elemento.getStockDisponible() + ";" +
            elemento.getPrecioUnitario()
        );
        
        GuardarProductos(root.getrC(), pw);
    }
    
}
