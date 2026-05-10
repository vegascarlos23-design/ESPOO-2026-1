package Control;

import Modelo.Cuenta;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Lista_Cuenta {

    private Nodo_Cuenta inicio, fin;

    public Lista_Cuenta() {
        inicio = fin = null;
    }

    public void Agregar(Cuenta elemento) {
        if (getNodoPorId(elemento.getNumCuenta()) != null) {
            JOptionPane.showMessageDialog(null, "La cuenta ya existe");
            return;
        }
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

    public boolean Eliminar(int numCuentaE) {
        if (getNodoPorId(numCuentaE).getElemento().getSaldoInicial() != 0) {
            JOptionPane.showMessageDialog(null, "Esta cuenta aun tiene saldo");
            return false;
        }
        
        Nodo_Cuenta preCur = null;

        for (Nodo_Cuenta cur = inicio; cur != null; cur = cur.getSiguiente()) {
            if (cur.getElemento().getNumCuenta() == numCuentaE) {
                if (inicio == fin) {
                    inicio = fin = null;
                    return true;
                }
                if (cur == inicio) {
                    inicio = cur.getSiguiente();
                    return true;
                }
                if (cur == fin) {
                    fin = preCur;
                    fin.setSiguiente(null);
                    return true;
                }
                preCur.setSiguiente(cur.getSiguiente());
                return true;
            }
            preCur = cur;
        }
        return true;
    }
    
    public void ListarBusqueda(JTable control, int numCuenta) {
        String[] cabecera = {"N° Cuenta", "Tipo Cuenta", "Saldo Inicial"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);

        for (Nodo_Cuenta cur = inicio; cur != null; cur = cur.getSiguiente()) {
            if (cur.getElemento().getNumCuenta() == numCuenta) {
                modTabla.addRow(cur.getElemento().getRegistro());
                return;
            }            
        }
    }
    
    public Nodo_Cuenta getNodoPorId(int numCuenta) {
        for (Nodo_Cuenta cur = inicio; cur != null; cur = cur.getSiguiente()) {
            if (cur.getElemento().getNumCuenta() == numCuenta) {
                return cur;
            }
        }
        return null;
    }

}
