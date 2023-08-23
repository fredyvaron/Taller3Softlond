package Ejercicio3;

import Ejercicio3.interfaces.CuentaBase;

import javax.swing.JOptionPane;

public class CuentaCorriente extends CuentaBase {
    private double sobregiro;

    public CuentaCorriente(double saldoInicial, double sobregiro) {
        super(saldoInicial);
        this.sobregiro = sobregiro;
    }

    @Override
    public boolean retirar(double cantidad) {
        if (cantidad > 0 && (saldo + sobregiro) >= cantidad) {
            saldo -= cantidad;
            JOptionPane.showMessageDialog(null, "Retiro exitoso: " + cantidad);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente o cantidad inválida para retiro.");
            return false;
        }
    }
}
