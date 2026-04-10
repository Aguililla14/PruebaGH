package org.example;


public class CuentaBancaria {

    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Cambio en GitHub
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo = saldo + cantidad; // Cambio en intellijei para conflicto
        }
    }

    public boolean retirar(double cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }

    public double consultarSaldo() {
        return saldo;
    }

}
