package Control;

import Modelo.Transaccion;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Lista_Transaccion {

    private Nodo_Transaccion inicio, fin;

    public Lista_Transaccion() {
        inicio = fin = null;
    }

    public void Agregar(Transaccion elemento) {
        Nodo_Transaccion nuevo = new Nodo_Transaccion(elemento);
        if (fin == null) {
            inicio = fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }
    
    public void Listar(JTable control) {
        String[] cabecera = {"ID Transaccion","N° Cuenta","Tipo","Monto","Fecha"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        
        for(Nodo_Transaccion cur = inicio; cur != null; cur = cur.getSiguiente()) {
            modTabla.addRow(cur.getElemento().getRegistro());
        }
    }
}
