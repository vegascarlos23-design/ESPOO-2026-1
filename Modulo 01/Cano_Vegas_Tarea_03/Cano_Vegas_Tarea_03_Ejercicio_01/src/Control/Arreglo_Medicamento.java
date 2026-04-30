package Control;

import Modelo.Medicamento;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Arreglo_Medicamento {

    private Medicamento[] ARREGLO_MEDICAMENTO;
    int i = 0;

    public void setTamaño(int n) {
        ARREGLO_MEDICAMENTO = new Medicamento[n];
    }

    public void Registrar_Medicamento(Medicamento dato) {
        try {
            if (Buscar_Lineal(dato.getCodigo()) == -1) {
                ARREGLO_MEDICAMENTO[i] = dato;
                i++;
                OrdenarPorStockActual();
            } else {
                JOptionPane.showMessageDialog(null, "El medicamento ya ha sido registrado.");
            }
        } catch (ArrayIndexOutOfBoundsException a) {
            JOptionPane.showMessageDialog(null, "La lista de medicamentos ya está llena.");
        }
    }

    public void Editar_Medicamento(Medicamento dato, int codigo) {
        int pos = Buscar_Lineal(codigo);
        ARREGLO_MEDICAMENTO[pos] = dato;
        OrdenarPorStockActual();
    }

    public void Eliminar_Medicamento(int codigo) {
        int pos = Buscar_Lineal(codigo);
        if (pos != -1) {
            for (int j = pos; j < i - 1; j++) {
                ARREGLO_MEDICAMENTO[j] = ARREGLO_MEDICAMENTO[j + 1];
            }
            ARREGLO_MEDICAMENTO[i - 1] = null;
            i--;
            
            JOptionPane.showMessageDialog(null, "Medicamento eliminado correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el medicamento.");
        }
    }

    public void OrdenarPorStockActual() {
        for (int j = 0; j < i; j++) {
            Medicamento aux = ARREGLO_MEDICAMENTO[j];
            int k = j - 1;

            while (k >= 0 && ARREGLO_MEDICAMENTO[k].getStock_actual() > aux.getStock_actual()) {
                ARREGLO_MEDICAMENTO[k + 1] = ARREGLO_MEDICAMENTO[k];
                k = k - 1;
            }
            ARREGLO_MEDICAMENTO[k + 1] = aux;
        }
    }

    public Medicamento Buscar_Medicamento(int codigo) {
        for (int pos = 0; pos < i; pos++) {
            if (ARREGLO_MEDICAMENTO[pos].getCodigo() == codigo) {
                return ARREGLO_MEDICAMENTO[pos];
            }
        }
        return null;
    }

    public void Listar_Medicamento(JTable control) {
        String[] cabecera = {"Código", "Nombre", "laboratorio", "Stock actual", "Precio unitario", "Fecha de vencimiento", "Valor total"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        control.setDefaultEditor(Object.class, null);

        for (int pos = 0; pos < i; pos++) {
            modTabla.addRow(ARREGLO_MEDICAMENTO[pos].getRegistro_Medicamento());
        }
    }

    public int Buscar_Lineal(int codigo) {
        for (int pos = 0; pos < i; pos++) {
            if (ARREGLO_MEDICAMENTO[pos].getCodigo() == codigo) {
                return pos;
            }
        }
        return -1;
    }
    
    public void StockCritico(JTextField A) {
        int contador = 0;
        for (int pos = 0; pos < i; pos++) {
            if (ARREGLO_MEDICAMENTO[pos].getStock_actual() < 10) {
                contador++;
            }
        }
        A.setText(contador + "");
    }
}
