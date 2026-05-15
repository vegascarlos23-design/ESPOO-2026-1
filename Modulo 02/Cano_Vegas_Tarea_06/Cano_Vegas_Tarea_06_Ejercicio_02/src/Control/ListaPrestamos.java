package Control;

import Modelo.Libro;
import Modelo.Prestamo;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListaPrestamos {
    private NodoPrestamo head,end;
    private int codeGenerator;

    public ListaPrestamos() {
        head = end = null;
        codeGenerator = 1;
    }
    
    public void Registrar(Prestamo elemento, ListaLibros objListaLibros) {
        elemento.setIdPrestamo(codeGenerator);
        
        NodoPrestamo newNode = new NodoPrestamo(elemento);
        
        Libro objLibro = objListaLibros.getNodoPorCodigo(elemento.getCodigoLibro()).getElemento();
        objLibro.setCantidadPrestamos(objLibro.getCantidadPrestamos()+1);
        
        if (head == null) {
            head = end = newNode;
            end.setNxt(head);
            end.setPre(head);
        } else {
            newNode.setPre(end);
            newNode.setNxt(head);
            end.setNxt(newNode);
            head.setPre(newNode);
            end = newNode;
        }
        codeGenerator++;
        
    }
    
    public void Eliminar(int idPrestamoEliminar, ListaLibros objListaLibros) {
        NodoPrestamo nodoAeliminar = getNodoPorId(idPrestamoEliminar);
        if (nodoAeliminar == null) return;
        
        if (head == end) {
            head = end = null;
        } else if(nodoAeliminar == head) {
            head = nodoAeliminar.getNxt();
            head.setPre(end);
            end.setNxt(head);
        } else if(nodoAeliminar == end) {
            nodoAeliminar.getPre().setNxt(head);
            end = nodoAeliminar.getPre();
            head.setPre(end);
        } else {
            nodoAeliminar.getPre().setNxt(nodoAeliminar.getNxt());
            nodoAeliminar.getNxt().setPre(nodoAeliminar.getPre());
        }
        
        Libro objLibro = objListaLibros.getNodoPorCodigo(nodoAeliminar.getElemento().getCodigoLibro()).getElemento();
        objLibro.setCantidadPrestamos(objLibro.getCantidadPrestamos()-1);
    }
    
    public void EliminarPorLibro(int codigoLibro, ListaLibros objListaLibros) {
        if (head == null) return;
        int cantidad = Contar();
        NodoPrestamo cur = head;
        for (int i = 0; i < cantidad; i++) {
            NodoPrestamo siguiente = cur.getNxt();
            if (cur.getElemento().getCodigoLibro()== codigoLibro) {                
                if (head == end) {
                    head = end = null;
                    return;
                } else if (cur == head) {
                    head = head.getNxt();
                    head.setPre(end);
                    end.setNxt(head);
                } else if (cur == end) {
                    end = end.getPre();
                    end.setNxt(head);
                    head.setPre(end);
                } else {
                    cur.getPre().setNxt(cur.getNxt());
                    cur.getNxt().setPre(cur.getPre());
                }
            }

            cur = siguiente;
            if (head == null) break;
        }
    }
    
    public int Contar() {
        if (head == null) return 0;
        int c = 0;
        NodoPrestamo cur = head;
        do {
            c++;
            cur = cur.getNxt();
        } while (cur != head);

        return c;
    }
    
    public void Listar(JTable control) {
        String[] header = {"ID", "Nombre Usuario","Fecha Salida","Fecha Entrada","Cod Libro"};
        DefaultTableModel modTabla = new DefaultTableModel(header, 0);
        control.setModel(modTabla);
        
        NodoPrestamo cur = end;
        if (cur == null) return;
        do {            
            modTabla.addRow(cur.getElemento().getRegistro());
            cur = cur.getPre();
        } while (cur != end);

    }
    
    public void ListarPorUsuario(JTable control, String usuario) {
        String[] header = {"ID", "Nombre Usuario","Fecha Salida","Fecha Entrada","Cod Libro"};
        DefaultTableModel modTabla = new DefaultTableModel(header, 0);
        control.setModel(modTabla);
        
        NodoPrestamo cur = end;
        if (cur == null) return;
        do {      
            if (cur.getElemento().getNombreUsuario().toLowerCase().contains(usuario.toLowerCase())) {
                modTabla.addRow(cur.getElemento().getRegistro());
            }
            cur = cur.getPre();
        } while (cur != end);
    }
    
    public NodoPrestamo getNodoPorId(int idPrestamo) {
        NodoPrestamo cur = head;
        if (cur == null) return null;
        do {            
            if (cur.getElemento().getIdPrestamo() == idPrestamo) return cur;
            cur = cur.getNxt();
        } while (cur != head);
        return null;
    }
    
    public NodoPrestamo getNodoPorFila(int fila) {
        if (head == null) return null;
        NodoPrestamo cur = end;
        int i = 0;
        do {
            if (i == fila) return cur;
            cur = cur.getPre();
            i++;
        } while (cur != end);
        return null;
    }

    public NodoPrestamo getHead() {
        return head;
    }

    public void setHead(NodoPrestamo head) {
        this.head = head;
    }

    public NodoPrestamo getEnd() {
        return end;
    }

    public void setEnd(NodoPrestamo end) {
        this.end = end;
    }       
}
