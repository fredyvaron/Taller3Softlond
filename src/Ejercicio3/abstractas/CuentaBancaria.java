package Ejercicio3.abstractas;

public abstract class CuentaBancaria {
    public abstract void depositar(double cantidad);

    public abstract boolean retirar(double cantidad);

    public abstract double getSaldo();
}

