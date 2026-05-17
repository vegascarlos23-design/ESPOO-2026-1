package Modelo;

import Control.PilaContenedor;
import javax.swing.JTable;;

public class Columna {
    private int codColumna;
    private int pesoMaximo;
    private PilaContenedor contenedores;

    public Columna(int pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
        contenedores = new PilaContenedor();
    }
    
    public int Apilar(Contenedor elemento) {
        return contenedores.Apilar(elemento,pesoMaximo);
    }
    
    public void Listar(JTable control) {
        contenedores.Listar(control);
    }
    
    public void Decapitar() {
        contenedores.Decapitar();
    }
    
    public void EliminarPorPais(String paisEliminar) {
        contenedores.EliminarPorPais(paisEliminar);
    }
    public Contenedor DesapilarMedio() {
        return contenedores.DesapilarMedio();
    }
    
    public boolean isEmpty() {
        return contenedores.isEmpty();
    }
    
    /*public void Apilar(Contenedor elemento) {
        if (contenedores.getSize() >= contenedores.getMaxSize()) {
            JOptionPane.showMessageDialog(null, "Capacidad maxima de 6 contenedores alcanzada");
            return;
        }
        
        NodoContenedor newNode = new NodoContenedor(elemento);
        
        if (contenedores.getBottom() == null) {
            contenedores.setBottom(newNode);
            contenedores.setTop(newNode);
        } else {
            newNode.setNxt(contenedores.getTop());
            contenedores.setTop(newNode);
        }
        contenedores.setSize(contenedores.getSize()+1);
    }
    
    public void Listar(JTable control) {
        String[] header = {"ID Contenedor","Peso","Contenido","Pais de Origen"};
        DefaultTableModel modTabla = new DefaultTableModel(header, 0);
        control.setModel(modTabla);
        
        NodoContenedor cur = contenedores.getTop();
        while(cur != null) {
            modTabla.addRow(cur.getElemento().getRegistro());
            cur = cur.getNxt();
        }
    }
    
    public void EliminarPorPais(String paisEliminar) {
        PilaContenedor aux = new PilaContenedor();
        
        NodoContenedor cur = contenedores.getTop();
        while(cur != null) {
            
        }
    }*/
    
    
    
    public Object[] getRegistro() {
        return new Object[]{codColumna,pesoMaximo};
    }

    public int getCodColumna() {
        return codColumna;
    }

    public void setCodColumna(int codColumna) {
        this.codColumna = codColumna;
    }

    public int getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(int pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    public PilaContenedor getContenedores() {
        return contenedores;
    }

    public void setContenedores(PilaContenedor contenedores) {
        this.contenedores = contenedores;
    }
    
    
    
    
    
}
