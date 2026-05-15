package Control;

import Modelo.Tienda;
import Modelo.VentaDiaria;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListaVentasDiarias {
    private NodoVentaDiaria head,end;
    private int codeGenerator;

    public ListaVentasDiarias() {
        head = end = null;
        codeGenerator = 1;
    }
    
    public void Registrar(VentaDiaria elemento, ListaTiendas objListaTiendas) {
        elemento.setCodigoVenta(codeGenerator);
        
        NodoVentaDiaria newNode = new NodoVentaDiaria(elemento);
        
        Tienda objTienda = objListaTiendas.getNodoPorId(elemento.getIdTienda()).getElemento();
        objTienda.setTotalVentasAcumuladas(objTienda.getTotalVentasAcumuladas()+elemento.getMonto());
        
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
    
    public void Eliminar(int codVentaEliminar, ListaTiendas objListaTiendas) {
        NodoVentaDiaria nodoAeliminar = getNodoPorCodigo(codVentaEliminar);
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
        
        Tienda objTienda = objListaTiendas.getNodoPorId(nodoAeliminar.getElemento().getIdTienda()).getElemento();
        objTienda.setTotalVentasAcumuladas(objTienda.getTotalVentasAcumuladas() - nodoAeliminar.getElemento().getMonto());
    }
    
    public void EliminarPorTienda(int idTienda, ListaTiendas objListaTiendas) {
        if (head == null) return;
        int cantidad = Contar();
        NodoVentaDiaria cur = head;
        for (int i = 0; i < cantidad; i++) {
            NodoVentaDiaria siguiente = cur.getNxt();
            if (cur.getElemento().getIdTienda() == idTienda) {                
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
        NodoVentaDiaria cur = head;
        do {
            c++;
            cur = cur.getNxt();
        } while (cur != head);

        return c;
    }
    
    public void Listar(JTable control) {
        BubbleSort();
        String[] header = {"Cod Venta", "Fecha","Monto","ID Tienda"};
        DefaultTableModel modTabla = new DefaultTableModel(header, 0);
        control.setModel(modTabla);
        
        NodoVentaDiaria cur = end;
        if (cur == null) return;
        do {            
            modTabla.addRow(cur.getElemento().getRegistro());
            cur = cur.getPre();
        } while (cur != end);
    }
    
    public void BubbleSort() {
        boolean cambio;
        
        do {           
            cambio = false;
            NodoVentaDiaria cur = head;
            if (cur == null) return;
            do {
                NodoVentaDiaria sig = cur.getNxt();
                if (sig == head) break;

                VentaDiaria a = cur.getElemento();
                VentaDiaria b = sig.getElemento();

                if (a.getMonto() > b.getMonto()) {
                    cur.setElemento(b);
                    sig.setElemento(a);

                    cambio = true;
                }
                cur = cur.getNxt();
            } while (cur != head);
        } while (cambio);
    }
   
    public NodoVentaDiaria getNodoPorCodigo(int codVenta) {
        NodoVentaDiaria cur = head;
        if (cur == null) return null;
        do {            
            if (cur.getElemento().getCodigoVenta()== codVenta) return cur;
            cur = cur.getNxt();
        } while (cur != head);
        return null;
    }
    
}
