package Control;

import Modelo.AlumnoMatriculado;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TreeAlumnos {
    private NodoAVLAlumno root;

    public TreeAlumnos() {
        root = null;
    }
    
    public void Agregar(AlumnoMatriculado elemento) {
        root = Agregar(root, elemento);
        Equilibrar();
    }
    
    private NodoAVLAlumno Agregar(NodoAVLAlumno root, AlumnoMatriculado elemento) {
        if (root == null) {
            NodoAVLAlumno newNode = new NodoAVLAlumno(elemento);
            return newNode;
        }
        
        if (elemento.getCodigoEstudiante() < root.getElemento().getCodigoEstudiante()) {
            root.setNl(Agregar(root.getNl(), elemento));
        } else if (elemento.getCodigoEstudiante() > root.getElemento().getCodigoEstudiante()) {
            root.setNr(Agregar(root.getNr(), elemento));
        } else {
            JOptionPane.showMessageDialog(null, "El Codigo de estudiante ya existe");
        }
        
        return root;
    }
    
    public void Listar(JTable control) {
        String[] Header = {"Cod Estudiante","Nombre completo","Promedio Ponderado","Situacion Academica"};
        DefaultTableModel modTable = new DefaultTableModel(Header, 0);
        control.setModel(modTable);
        
        InOrder(root, modTable);
    }
    
    private void InOrder(NodoAVLAlumno root, DefaultTableModel modTable) {
        if (root == null) return;
        
        InOrder(root.getNl(), modTable);
        modTable.addRow(root.getRegistro());
        InOrder(root.getNr(), modTable);
    }
    
    public void Eliminar(int numSerie) {
        root = Eliminar(root, numSerie);
        Equilibrar();
    }
    
    private NodoAVLAlumno Eliminar(NodoAVLAlumno root, int numSerie) {
        if (root == null) return null;
        
        if (numSerie < root.getElemento().getCodigoEstudiante()) {
            root.setNl(Eliminar(root.getNl(), numSerie));
        } else if (numSerie > root.getElemento().getCodigoEstudiante()) {
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
    
    private NodoAVLAlumno getMayorIzq(NodoAVLAlumno root) {
        if (root == null) return null;
        
        if (root.getNr() != null) return getMayorIzq(root.getNr());
        
        return root;
    }
    
    private NodoAVLAlumno EliminarMayotIzq(NodoAVLAlumno root) {
        if (root == null) return null;
        
        if (root.getNr() != null) {
            root.setNr(EliminarMayotIzq(root.getNr()));
            return root;
        }
        
        return root.getNl();
    }
    public void Editar(AlumnoMatriculado elemento,int numSerieAnt) {
        if (elemento.getCodigoEstudiante() == numSerieAnt) {
            NodoAVLAlumno nodoEditar = getNodoPorNum(root, numSerieAnt);
            nodoEditar.setElemento(elemento);
        } else if (elemento.getCodigoEstudiante() != numSerieAnt && getNodoPorNum(root, elemento.getCodigoEstudiante()) == null) {
            Eliminar(numSerieAnt);
            Agregar(elemento);
        } else {
            JOptionPane.showMessageDialog(null, "El codigo de estudiante nuevo ya existe");
        }
    }
    
    private NodoAVLAlumno getNodoPorNum(NodoAVLAlumno root, int numSerie) {
        if (root == null) return null;
        
        if (numSerie < root.getElemento().getCodigoEstudiante()) {
            return getNodoPorNum(root.getNl(), numSerie);
        } else if (numSerie > root.getElemento().getCodigoEstudiante()) {
            return getNodoPorNum(root.getNr(), numSerie);
        } else {
            return root;
        }
    } 
    
    private void Equilibrar() {
        root = Equilibrar(root);
    }
    
    private NodoAVLAlumno Equilibrar(NodoAVLAlumno root) {
        if (root == null) return null;
        
        root.setNl(Equilibrar(root.getNl()));
        root.setNr(Equilibrar(root.getNr()));
        
        return Estructurar(root);
    }
    
    
    private int ExtraerFE(NodoAVLAlumno root) {
        if (root == null) return 0;
        return root.getFE();
    }
    
    private NodoAVLAlumno Estructurar(NodoAVLAlumno root) {
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
    
    private NodoAVLAlumno RotacionSimpleIzq(NodoAVLAlumno root) {
        JOptionPane.showMessageDialog(null, "Rotacion Simple Izquierda");
        
        NodoAVLAlumno tmp = root.getNr();
        root.setNr(tmp.getNl());
        tmp.setNl(root);
        
        return tmp;
    } 
    
    private NodoAVLAlumno RotacionSimpleDer(NodoAVLAlumno root) {
        JOptionPane.showMessageDialog(null, "Rotacion Simple Derecha");
        
        NodoAVLAlumno tmp = root.getNl();
        root.setNl(tmp.getNr());
        tmp.setNr(root);
        
        return tmp;
    }
    
    private NodoAVLAlumno RotacionCompuestaIzq(NodoAVLAlumno root) {
        JOptionPane.showMessageDialog(null, "Rotacion Compuesta Izquierda");
        
        root.setNr(RotacionSimpleDer(root.getNr()));
        return RotacionSimpleIzq(root);
    }
    
    private NodoAVLAlumno RotacionCompuestaDer(NodoAVLAlumno root) {
        JOptionPane.showMessageDialog(null, "Rotacion Compuesta Derecha");
        root.setNl(RotacionSimpleIzq(root.getNl()));
        return RotacionSimpleDer(root);
    }
    
    public void TransferirAlumnos(TreeAlumnos origen) {
        InOrderTransferencia(origen.getRoot());
    }
    
    private void InOrderTransferencia(NodoAVLAlumno root) {
        if (root == null) return;
        
        InOrderTransferencia(root.getNl());
        
        AlumnoMatriculado origen = root.getElemento();
        
        NodoAVLAlumno nodoDestino = getNodoPorNum(getRoot(), root.getElemento().getCodigoEstudiante());
        
        if (nodoDestino == null) {
            Agregar(origen);
        } else {
            AlumnoMatriculado destino = nodoDestino.getElemento();
            
            if (origen.getPromedioPonderado() > destino.getPromedioPonderado()) {
                Eliminar(destino.getCodigoEstudiante());
                Agregar(origen);
            }
        }
            
        InOrderTransferencia(root.getNr());
    }

    public NodoAVLAlumno getRoot() {
        return root;
    }

    public void setRoot(NodoAVLAlumno root) {
        this.root = root;
    }
    
    public void GuardarAlumnos(PrintWriter pw) {
        GuardarAlumnos(root, pw);
    }
    
    private void GuardarAlumnos(NodoAVLAlumno root,PrintWriter pw) {
        if (root == null) return;
        
        GuardarAlumnos(root.getNl(), pw);
        
        AlumnoMatriculado elemento = root.getElemento();
        pw.println(elemento.getCodigoEstudiante()+";"+
                elemento.getNombreCompleto()+";"+
                elemento.getPromedioPonderado()+";"+
                elemento.getSituacionAcademica()
        );
        
        GuardarAlumnos(root.getNr(), pw);
    }
}
