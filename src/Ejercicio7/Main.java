package Ejercicio7;

import Ejercicio7.interfaces.Forma;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Forma[] formas = new Forma[2];

        formas[0] = new Circulo("Circulo", 5);
        formas[1] = new Rectangulo("Rectangulo", 4, 6);

        for (Forma forma: formas) {
            JOptionPane.showMessageDialog(null, "Area de "+ forma.obtenerNombre()+ ": " + forma.calcularArea());
        }
    }
}
