package Modelo;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Microservicio {
    private String nombre;
    private String ipContenedor;
    private ArrayList<PoliticaSeguridad> politicas;

    public Microservicio(String nombre, String ipContenedor) {
        this.nombre = nombre;
        this.ipContenedor = ipContenedor;
        politicas = new ArrayList<>();
    }

    public void AgregarPolitica(PoliticaSeguridad elemento) {
        politicas.add(elemento);
        politicas.sort((a,b) -> Integer.compare(a.getNivelEncriptacion(), b.getNivelEncriptacion()));
    }
    
    public void ListarPolitica(JTable control) {
        String[] header = {"ID Regla","Nivel de Encriptacion","Protocolo"};
        DefaultTableModel modTable = new DefaultTableModel(header, 0);
        control.setModel(modTable);
        
        for (int pos = 0; pos < politicas.size(); pos++) {
            modTable.addRow(politicas.get(pos).getRegistro());
        }
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIpContenedor() {
        return ipContenedor;
    }

    public void setIpContenedor(String IpContenedor) {
        this.ipContenedor = IpContenedor;
    }

    public ArrayList<PoliticaSeguridad> getPoliticas() {
        return politicas;
    }

    public void setPoliticas(ArrayList<PoliticaSeguridad> politicas) {
        this.politicas = politicas;
    }
    
    
}
