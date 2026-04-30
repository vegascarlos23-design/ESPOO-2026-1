package Control;

import Modelo.Repuesto;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Arreglo_Repuesto {

    private Repuesto[] ARREGLO_REPUESTO = new Repuesto[13];
    int i = 0;

    public void Registrar_Repuesto(Repuesto dato) {
        try {
            if (Buscar_Lineal(dato.getId()) == -1) {
                ARREGLO_REPUESTO[i] = dato;
                i++;
            } else {
                JOptionPane.showMessageDialog(null, "Este ID ya está registrado.");
            }
        } catch (ArrayIndexOutOfBoundsException a) {
            JOptionPane.showMessageDialog(null, "La lista de repuestos ya está llena.");
        }
    }

    public void Listar_Repuesto(JTable control) {
        String[] cabecera = {"ID", "Nombre", "Tipo", "Código", "Precio", "Stock", "Marca", "Peso", "Fecha de ingreso", "Ubicación"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        control.setDefaultEditor(Object.class, null);

        for (int pos = 0; pos < i; pos++) {
            modTabla.addRow(ARREGLO_REPUESTO[pos].getRegistro_Repuesto());
        }
    }

    public void Filtrar_Por_Marca(JTable control, String marca) {
        String[] cabecera = {"ID", "Nombre", "Tipo", "Código", "Precio", "Stock", "Marca", "Peso", "Fecha de ingreso", "Ubicación"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        control.setDefaultEditor(Object.class, null);

        for (int pos = 0; pos < i; pos++) {
            if (marca.equals("Mostrar todo") || ARREGLO_REPUESTO[pos].getMarca().equals(marca)) {
                modTabla.addRow(ARREGLO_REPUESTO[pos].getRegistro_Repuesto());
            }
        }
    }

    public void FiltrarPorStock(JTable control, int stock_r, String condicion) {
        String[] cabecera = {"ID", "Nombre", "Tipo", "Código", "Precio", "Stock", "Marca", "Peso", "Fecha de ingreso", "Ubicación"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        control.setDefaultEditor(Object.class, null);

        for (int pos = 0; pos < i; pos++) {
            int stock = ARREGLO_REPUESTO[pos].getStock();
            switch (condicion) {
                case "Menor que":
                    if (stock < stock_r) {
                        modTabla.addRow(ARREGLO_REPUESTO[pos].getRegistro_Repuesto());
                    }
                    break;
                case "Igual que":
                    if (stock == stock_r) {
                        modTabla.addRow(ARREGLO_REPUESTO[pos].getRegistro_Repuesto());
                    }
                    break;
                case "Mayor que":
                    if (stock > stock_r) {
                        modTabla.addRow(ARREGLO_REPUESTO[pos].getRegistro_Repuesto());
                    }
                    break;
                case "Mostrar todo":
                    modTabla.addRow(ARREGLO_REPUESTO[pos].getRegistro_Repuesto());
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error al filtrar.");
            }
        }
    }

    public int Buscar_Lineal(int dato) {
        for (int pos = 0; pos < i; pos++) {
            if (ARREGLO_REPUESTO[pos].getId() == dato) {
                return pos;
            }
        }
        return -1;
    }
    
    public Repuesto[] listar() {
        return ARREGLO_REPUESTO;
    }
}
