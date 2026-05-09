package Control;

import Modelo.Cuenta;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Lista_Cuenta {

    private Nodo_Cuenta inicio, fin;

    public Lista_Cuenta() {
        inicio = fin = null;
    }

    public void Agregar(Cuenta elemento) {
        Nodo_Cuenta nuevo = new Nodo_Cuenta(elemento);
        if (fin == null) {
            inicio = fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }

    public void Listar(JTable control) {
        String[] cabecera = {"N° Cuenta", "Tipo Cuenta", "Saldo Inicial"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);

        for (Nodo_Cuenta cur = inicio; cur != null; cur = cur.getSiguiente()) {
            modTabla.addRow(cur.getElemento().getRegistro());
        }
    }

    public void Eliminar(int numCuentaE) {
      
        Nodo_Cuenta preCur = null;

        for (Nodo_Cuenta cur = inicio; cur != null; cur = cur.getSiguiente()) {
            if (cur.getElemento().getNumCuenta() == numCuentaE) {
                if (inicio == fin) {
                    inicio = fin = null;
                    return;
                }
                if (cur == inicio) {
                    inicio = cur.getSiguiente();
                    return;
                }
                if (cur == fin) {
                    fin = preCur;
                    fin.setSiguiente(null);
                    return;
                }
                preCur.setSiguiente(cur.getSiguiente());
                return;
            }
            preCur = cur;
        }
    }

    public Nodo_Cuenta getNodoId(int numCuenta) {
        for (Nodo_Cuenta cur = inicio; cur != null; cur = cur.getSiguiente()) {
            if (cur.getElemento().getNumCuenta() == numCuenta) {
                return cur;
            }
        }
        return null;
    }

}
