package Control;

import Modelo.Computadora;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Arreglo_Computadoras {
    private Computadora[] ARREGLO_COMPUTADORA = new Computadora[10];
    int i = 0;

    public void Registrar_Computadora(Computadora dato) {
        try {
            if (Buscar_Lineal(dato.getCodigo()).equals("")) {
                ARREGLO_COMPUTADORA[i] = dato;
                i++;
            } else {
                JOptionPane.showMessageDialog(null, "El código ya ha sido registrado.");
            }
        } catch (ArrayIndexOutOfBoundsException a) {
            JOptionPane.showMessageDialog(null, "La lista de computadoras ya está llena.");
        }
    }

    public void Listar_Computadoras(JTable control) {
        String[] cabecera = {"Código", "Modelo", "Marca", "Procesador", "Memoria RAM", "Precio por alquiler"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        for (int pos = 0; pos < i; pos++) {
            modTabla.addRow(ARREGLO_COMPUTADORA[pos].getRegistro_Computadora());
        }
    }

    public void Filtrar(JTable control, String filtro) {
        String[] cabecera = {"Código", "Modelo", "Marca", "Procesador", "Memoria RAM", "Precio por alquiler"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        for (int pos = 0; pos < i; pos++) {
            if (ARREGLO_COMPUTADORA[pos].getCadena().toUpperCase().contains(filtro.toUpperCase())) {
                modTabla.addRow(ARREGLO_COMPUTADORA[pos].getRegistro_Computadora());
            }
        }
    }

    public String Buscar_Lineal(String dato) {
        for (int pos = 0; pos < i; pos++) {
            if (ARREGLO_COMPUTADORA[pos].getCodigo().equals(dato)) {
                return ARREGLO_COMPUTADORA[pos].getCodigo();
            }
        }
        return "";
    }
    
    public void ActualizarPrecio(String marca, double nuevoPrecio){
        for (int pos = 0; pos < i; pos++) {
            if(ARREGLO_COMPUTADORA[pos].getMarca().equalsIgnoreCase(marca)){
                ARREGLO_COMPUTADORA[pos].setPrecio_alquiler(nuevoPrecio);
            }
        }
    }
}
