package Modelo;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EstacionElectrica {
    private String nombre;
    private double voltajeOperacion;
    private ArrayList<Transformador> transformadores;

    public EstacionElectrica(String nombre, double voltajeOperacion) {
        this.nombre = nombre;
        this.voltajeOperacion = voltajeOperacion;
        transformadores = new ArrayList<>();
    }

    public void AgregarTransformador(Transformador elemento) {
        transformadores.add(elemento);
        transformadores.sort((a,b) -> Integer.compare(a.getCapacidadKva(),b.getCapacidadKva()));      
    }
    
    public void ListarTransformador(JTable control) {
        String[] header = {"Codigo de Serie","Capacidad (KVA)","Tipo de Aislamiento"};
        DefaultTableModel modTable = new DefaultTableModel(header, 0);
        control.setModel(modTable);       
        
        for (int pos = 0; pos < transformadores.size(); pos++) {
            modTable.addRow(transformadores.get(pos).getRegistro());
        }
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getVoltajeOperacion() {
        return voltajeOperacion;
    }

    public void setVoltajeOperacion(double voltajeOperacion) {
        this.voltajeOperacion = voltajeOperacion;
    }

    public ArrayList<Transformador> getTransformadores() {
        return transformadores;
    }

    public void setTransformadores(ArrayList<Transformador> transformadores) {
        this.transformadores = transformadores;
    }
    
    
    
}
