package Control;

import Modelo.Alarma;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class GestorAlarmas {
    private CopyOnWriteArrayList<Alarma> alarmas = new CopyOnWriteArrayList<>();
    
    public void AgregarAlarma(Alarma elemento) {
        alarmas.add(elemento);
    }
    
    public void EliminarAlarma(Alarma elemento) {
        alarmas.remove(elemento);
    }

    public List<Alarma> getAlarmas() {
        return alarmas;
    }
    
    public void ListarAlarmas(JTable control) {
        String[] header = {"Dia","Hora","Activo"};
        DefaultTableModel modTable = new DefaultTableModel(header, 0);
        control.setModel(modTable);
        
        for(Alarma cur : alarmas) {
            modTable.addRow(cur.getRegistro());
        }
    }
    
    public void AlternarAlarma(Alarma elemento) {   
        boolean nuevoEstado = !elemento.isActive();
        elemento.setIsActive(nuevoEstado);
        if (!nuevoEstado) elemento.setRinging(false);
    }
    
    public Alarma obtenerAlarma(int indice) {
        return alarmas.get(indice);
    }
    
    public List<Alarma> buscarAlarmas(LocalTime hora, int dia) {
        List<Alarma> resultado = new ArrayList<>();
        
        for(Alarma cur : alarmas) {
            if (cur.isActive() && !cur.isRinging()
                    &&cur.getDayOfWeek() == dia
                    && cur.getTime().equals(hora)) {
                cur.setRinging(true);
                resultado.add(cur);
            } 
            if (!cur.getTime().equals(hora)) {
                cur.setRinging(false);
            }
        }
        
        
        return resultado;
    }
}
