package Modelo;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Helipuerto {
    private String nombre;
    private int altitudMsnm;
    private ArrayList<Dron> hangar;

    public Helipuerto(String nombre, int altitudMsnm) {
        this.nombre = nombre;
        this.altitudMsnm = altitudMsnm;
        hangar = new ArrayList<>();
    }

    public void AgregarDron(Dron elemento) {
        hangar.add(elemento);
        hangar.sort((a,b) -> Integer.compare(a.getAutonomiaMinutos(), b.getAutonomiaMinutos()));
    }
    
    public void ListarDron(JTable control) {
        String[] header = {"Matricula","Autonomia (min.)","Carga Maxima (Kg)"};
        DefaultTableModel modTable = new DefaultTableModel(header, 0);
        control.setModel(modTable);
        
        for (int pos = 0; pos < hangar.size(); pos++) {
            modTable.addRow(hangar.get(pos).getRegistro());
        }
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAltitudMsnm() {
        return altitudMsnm;
    }

    public void setAltitudMsnm(int altitudMsnm) {
        this.altitudMsnm = altitudMsnm;
    }

    public ArrayList<Dron> getHangar() {
        return hangar;
    }

    public void setHangar(ArrayList<Dron> hangar) {
        this.hangar = hangar;
    }
    
    
}
