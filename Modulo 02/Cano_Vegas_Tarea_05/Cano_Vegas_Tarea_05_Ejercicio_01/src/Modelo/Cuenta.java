package Modelo;

import Control.Lista_Transaccion;
import Control.Nodo_Transaccion;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Cuenta {
    private int numCuenta;
    private String tipoCuenta;
    private double saldoInicial;
    private Lista_Transaccion transacciones;

    public Cuenta(int numCuenta, String tipoCuenta, double saldoInicial) {
        this.numCuenta = numCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldoInicial = saldoInicial;
        transacciones = new Lista_Transaccion();
    }

    public Object[] getRegistro() {
        return new Object[]{numCuenta,tipoCuenta,saldoInicial};
    }
    
    public void Agregar(Transaccion elemento) {
        double diff = elemento.getMonto();
        if (elemento.getTipo().equalsIgnoreCase("retiro")) {
            diff *= -1;
            if (elemento.getMonto() > saldoInicial ) {
                JOptionPane.showMessageDialog(null, "Saldo Insuficiente");
                return;
            }
        }
        
        
        Nodo_Transaccion nuevo = new Nodo_Transaccion(elemento);
        if (transacciones.getInicio() == null) {
            transacciones.setInicio(nuevo);
            transacciones.setFin(nuevo);
        } else {
            transacciones.getFin().setSiguiente(nuevo);
            transacciones.setFin(nuevo);
        }
        setSaldoInicial(saldoInicial + diff);
    }
    
    public void Listar(JTable control) {
        String[] cabecera = {"ID Transaccion", "N° Cuenta", "Tipo", "Monto", "Fecha"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);

        for (Nodo_Transaccion cur = transacciones.getInicio(); cur != null; cur = cur.getSiguiente()) {
            modTabla.addRow(cur.getElemento().getRegistro());
        }
    }
    
    public void BubbleSort(int criterio) {
        boolean cambio;
        do {
            cambio = false;

            Nodo_Transaccion cur = transacciones.getInicio();

            while (cur != null && cur.getSiguiente() != null) {

                Transaccion a = cur.getElemento();
                Transaccion b = cur.getSiguiente().getElemento();
                if (criterio == 1 && a.getFecha().after(b.getFecha())) {
                    cur.setElemento(b);
                    cur.getSiguiente().setElemento(a);

                    cambio = true;

                } else if (criterio == 2 && a.getFecha().before(b.getFecha())) {
                    cur.setElemento(b);
                    cur.getSiguiente().setElemento(a);

                    cambio = true;
                }

                cur = cur.getSiguiente();
            }

        } while (cambio);
    }
    
    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public Lista_Transaccion getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(Lista_Transaccion transacciones) {
        this.transacciones = transacciones;
    }
    
    
}
