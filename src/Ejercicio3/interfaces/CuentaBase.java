package Ejercicio3.interfaces;

import Ejercicio3.abstractas.CuentaBancaria;

import javax.swing.JOptionPane;

public abstract class CuentaBase extends CuentaBancaria {
    protected double saldo;

    public CuentaBase(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    @Override
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            JOptionPane.showMessageDialog(null, "Depósito exitoso: " + cantidad);
        } else {
            JOptionPane.showMessageDialog(null, "Cantidad inválida para depósito.");
        }
    }

    @Override
    public boolean retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            JOptionPane.showMessageDialog(null, "Retiro exitoso: " + cantidad);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente o cantidad inválida para retiro.");
            return false;
        }
    }

    @Override
    public double getSaldo() {
        return saldo;
    }
}