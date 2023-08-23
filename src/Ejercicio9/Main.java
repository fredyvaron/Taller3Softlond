package Ejercicio9;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        InstrumentosMusical[] musical = new InstrumentosMusical[3];

        musical[0] = new Guitarras("Guitarra", "Guir Guir");
        musical[1] = new Pianos("Piano", "Pir Pir");
        musical[2] = new Violines("Violin", "Vir Vir");

        for (InstrumentosMusical instrumento: musical) {
            JOptionPane.showMessageDialog(null, "Instrumento: "+ instrumento.getNombre()+ " -  Suena: "+ instrumento.hacerSonido());
        }
;    }
}
