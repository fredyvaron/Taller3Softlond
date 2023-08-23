package Ejercicio4;

import Ejercicio4.interfaces.Carta;

import javax.swing.*;

public class CartaPoker implements Carta {
    private String palo;
    private String valor;

    public CartaPoker(String palo, String valor) {
        this.palo = palo;
        this.valor = valor;
    }

    @Override
    public void mostrarCarta() {
        JOptionPane.showMessageDialog(null, valor+ " de "+ palo);
    }

    @Override
    public int valorNumerico() {
        return 0;
    }
}
