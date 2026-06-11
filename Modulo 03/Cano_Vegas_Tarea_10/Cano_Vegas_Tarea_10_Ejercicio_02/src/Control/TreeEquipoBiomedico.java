package Control;

import Modelo.EquipoBiomedico;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TreeEquipoBiomedico {
    private NodoAVLEquipo root;

    public TreeEquipoBiomedico() {
        root = null;
    }
    
    public void Agregar(EquipoBiomedico elemento) {
        root = Agregar(root, elemento);
        Equilibrar();
    }
    
    private NodoAVLEquipo Agregar(NodoAVLEquipo root, EquipoBiomedico elemento) {
        if (root == null) {
            NodoAVLEquipo newNode = new NodoAVLEquipo(elemento);
            return newNode;
        }
        
        if (elemento.getNumeroSerie() < root.getElemento().getNumeroSerie()) {
            root.setNl(Agregar(root.getNl(), elemento));
        } else if (elemento.getNumeroSerie() > root.getElemento().getNumeroSerie()) {
            root.setNr(Agregar(root.getNr(), elemento));
        } else {
            JOptionPane.showMessageDialog(null, "El Numero de serie ya existe");
        }
        
        return root;
    }
    
    public void Listar(JTable control) {
        String[] Header = {"Num Serie","Tipo Equipo","Horas uso","Estado Mantenimiento"};
        DefaultTableModel modTable = new DefaultTableModel(Header, 0);
        control.setModel(modTable);
        
        InOrder(root, modTable);
    }
    
    private void InOrder(NodoAVLEquipo root, DefaultTableModel modTable) {
        if (root == null) return;
        
        InOrder(root.getNl(), modTable);
        modTable.addRow(root.getRegistro());
        InOrder(root.getNr(), modTable);
    }
    
    public void Eliminar(int numSerie) {
        root = Eliminar(root, numSerie);
        Equilibrar();
    }
    
    private NodoAVLEquipo Eliminar(NodoAVLEquipo root, int numSerie) {
        if (root == null) return null;
        
        if (numSerie < root.getElemento().getNumeroSerie()) {
            root.setNl(Eliminar(root.getNl(), numSerie));
        } else if (numSerie > root.getElemento().getNumeroSerie()) {
            root.setNr(Eliminar(root.getNr(), numSerie));
        } else {
            if (root.getNl() != null && root.getNr() != null) {
                root.setElemento(getMayorIzq(root.getNl()).getElemento());
                root.setNl(EliminarMayotIzq(root.getNl()));
            } else {
                root = (root.getNl() == null) ? root.getNr() : root.getNl();
                
            }
        }
        return root;
    }
    
    private NodoAVLEquipo getMayorIzq(NodoAVLEquipo root) {
        if (root == null) return null;
        
        if (root.getNr() != null) return getMayorIzq(root.getNr());
        
        return root;
    }
    
    private NodoAVLEquipo EliminarMayotIzq(NodoAVLEquipo root) {
        if (root == null) return null;
        
        if (root.getNr() != null) {
            root.setNr(EliminarMayotIzq(root.getNr()));
            return root;
        }
        
        return root.getNl();
    }
    public void Editar(EquipoBiomedico elemento,int numSerieAnt) {
        if (elemento.getNumeroSerie() == numSerieAnt) {
            NodoAVLEquipo nodoEditar = getNodoPorNum(root, numSerieAnt);
            nodoEditar.setElemento(elemento);
        } else if (elemento.getNumeroSerie() != numSerieAnt && getNodoPorNum(root, elemento.getNumeroSerie()) == null) {
            Eliminar(numSerieAnt);
            Agregar(elemento);
        } else {
            JOptionPane.showMessageDialog(null, "El numero de Serie nuevo ya existe");
        }
    }
    
    private NodoAVLEquipo getNodoPorNum(NodoAVLEquipo root, int numSerie) {
        if (root == null) return null;
        
        if (numSerie < root.getElemento().getNumeroSerie()) {
            return getNodoPorNum(root.getNl(), numSerie);
        } else if (numSerie > root.getElemento().getNumeroSerie()) {
            return getNodoPorNum(root.getNr(), numSerie);
        } else {
            return root;
        }
    } 
    
    private void Equilibrar() {
        root = Equilibrar(root);
    }
    
    private NodoAVLEquipo Equilibrar(NodoAVLEquipo root) {
        if (root == null) return null;
        
        root.setNl(Equilibrar(root.getNl()));
        root.setNr(Equilibrar(root.getNr()));
        
        return Estructurar(root);
    }
    
    
    private int ExtraerFE(NodoAVLEquipo root) {
        if (root == null) return 0;
        return root.getFE();
    }
    
    private NodoAVLEquipo Estructurar(NodoAVLEquipo root) {
        if (root == null) return null;
        
        int fe = ExtraerFE(root);
        
        if (fe == -2) {
            return (ExtraerFE(root.getNl()) <= 0) ? RotacionSimpleDer(root) : RotacionCompuestaDer(root);
        }
        
        if (fe == 2) {
            return (ExtraerFE(root.getNr()) >= 0) ? RotacionSimpleIzq(root) : RotacionCompuestaIzq(root);
        }
        
        return root;
    }
    
    private NodoAVLEquipo RotacionSimpleIzq(NodoAVLEquipo root) {
        JOptionPane.showMessageDialog(null, "Rotacion Simple Izquierda");
        
        NodoAVLEquipo tmp = root.getNr();
        root.setNr(tmp.getNl());
        tmp.setNl(root);
        
        return tmp;
    } 
    
    private NodoAVLEquipo RotacionSimpleDer(NodoAVLEquipo root) {
        JOptionPane.showMessageDialog(null, "Rotacion Simple Derecha");
        
        NodoAVLEquipo tmp = root.getNl();
        root.setNl(tmp.getNr());
        tmp.setNr(root);
        
        return tmp;
    }
    
    private NodoAVLEquipo RotacionCompuestaIzq(NodoAVLEquipo root) {
        JOptionPane.showMessageDialog(null, "Rotacion Compuesta Izquierda");
        
        root.setNr(RotacionSimpleDer(root.getNr()));
        return RotacionSimpleIzq(root);
    }
    
    private NodoAVLEquipo RotacionCompuestaDer(NodoAVLEquipo root) {
        JOptionPane.showMessageDialog(null, "Rotacion Compuesta Derecha");
        root.setNl(RotacionSimpleIzq(root.getNl()));
        return RotacionSimpleDer(root);
    }
    
    public void TransferirEquipos(TreeEquipoBiomedico origen) {
        InOrderTransferencia(origen.getRoot());
    }
    
    private void InOrderTransferencia(NodoAVLEquipo root) {
        if (root == null) return;
        
        InOrderTransferencia(root.getNl());
        
        EquipoBiomedico origen = root.getElemento();
        
        NodoAVLEquipo nodoDestino = getNodoPorNum(getRoot(), root.getElemento().getNumeroSerie());
        
        if (nodoDestino == null) {
            Agregar(origen);
        } else {
            EquipoBiomedico destino = nodoDestino.getElemento();
            
            if (origen.getHorasUso() < destino.getHorasUso()) {
                Eliminar(destino.getNumeroSerie());
                Agregar(origen);
            }
        }
            
        InOrderTransferencia(root.getNr());
    }

    public NodoAVLEquipo getRoot() {
        return root;
    }

    public void setRoot(NodoAVLEquipo root) {
        this.root = root;
    }
    
    public void GuardarEquipos(PrintWriter pw) {
        GuardarEquipos(root, pw);
    }
    
    private void GuardarEquipos(NodoAVLEquipo root,PrintWriter pw) {
        if (root == null) return;
        
        GuardarEquipos(root.getNl(), pw);
        
        EquipoBiomedico elemento = root.getElemento();
        pw.println(elemento.getNumeroSerie()+";"+
                elemento.getTipoEquipo()+";"+
                elemento.getHorasUso()+";"+
                elemento.getEstadoMantenimiento()
        );
        
        GuardarEquipos(root.getNr(), pw);
    }
}
