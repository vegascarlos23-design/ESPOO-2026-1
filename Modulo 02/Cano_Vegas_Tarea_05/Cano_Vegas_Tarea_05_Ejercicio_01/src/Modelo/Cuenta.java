package Modelo;

import Control.Lista_Transaccion;

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
