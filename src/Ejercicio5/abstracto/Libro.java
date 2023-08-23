package Ejercicio5.abstracto;

import javax.swing.*;

public abstract class Libro extends ProductoBase {
    protected String autor;

    public Libro(String nombre, double precio, String autor, Integer cantidad) {
        super(nombre, precio, cantidad);
        this.autor = autor;
    }
    public String mostrarDetalles() {
        return  super.mostrarDetalles().concat("Autor: "+ autor);
    }
}
