package Ejercicio6;

import javax.swing.*;

public class Perro extends Animal{
    @Override
    public void hacerSonido() {
        JOptionPane.showMessageDialog(null, "Gua Gua");
    }
}
