package Control;

import Modelo.Dispositivo;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Dispositivos {
    private Map<String, Dispositivo> hashDispositivo = new HashMap<>();
    
    public void AgregarDispositivo(Dispositivo elemento) {
        if (hashDispositivo.get(elemento.getId()) != null) {
            JOptionPane.showMessageDialog(null, "El Dispositivo ya existe");
            return;
        }
        hashDispositivo.put(elemento.getId(), elemento);
    }
    
    public void EliminarDispositivo (String id) {
        hashDispositivo.remove(id);
    }
    
    public void EditarConsumo(String id, double consumo) {
        Dispositivo objDispositivo = hashDispositivo.get(id);
        objDispositivo.setConsumoWats(consumo);
    }
    
    public void CambiarEstadoDispotivo(String id) {
        Dispositivo objDispositivo = hashDispositivo.get(id);
        objDispositivo.setEstado(!objDispositivo.isEstado());
    }
    
    public void ListarDipositivos(JTable control) {
        String[] header = new String[]{"ID","Tipo","Estado","Consumo (Watios)"};
        DefaultTableModel modTable = new DefaultTableModel(header, 0);
        control.setModel(modTable);
        
        for(Dispositivo cur : hashDispositivo.values()) {
            modTable.addRow(cur.getRegistro());
        }
    }
    
    public void FiltroEncendidos(JTable control) {
        String[] header = new String[]{"ID","Tipo","Estado","Consumo (Watios)"};
        DefaultTableModel modTable = new DefaultTableModel(header, 0);
        control.setModel(modTable);
        
        for(Dispositivo cur : hashDispositivo.values()) {
            if (cur.isEstado()) {
                modTable.addRow(cur.getRegistro());
            }
        }
    }
    
    public void FiltroWatios(JTable control, double consumoX) {
        String[] header = new String[]{"ID","Tipo","Estado","Consumo (Watios)"};
        DefaultTableModel modTable = new DefaultTableModel(header, 0);
        control.setModel(modTable);
        
        for(Dispositivo cur : hashDispositivo.values()) {
            if (cur.getConsumoWats() > consumoX) {
                modTable.addRow(cur.getRegistro());
            }
        }
    }
    
    public String BuscarDispositivoId(String id) {
        Dispositivo objDispositivo = hashDispositivo.get(id);
        if (objDispositivo == null) return null;
        
        Object[] registro = objDispositivo.getRegistro();
        String msg = "ID: " + registro[0] + "\n"
                + "Tipo: " + registro[1] + "\n"
                + "Estado: " + registro[2] + "\n"
                + "Consumo (Watios): " + registro[3];
        return msg;
    }
}
