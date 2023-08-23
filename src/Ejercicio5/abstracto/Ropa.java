package Ejercicio5.abstracto;

import javax.swing.*;

public abstract class Ropa extends ProductoBase {
    protected String talla;

    public Ropa(String nombre, double precio, String talla, Integer cantidad) {
        super(nombre, precio, cantidad);
        this.talla = talla;
    }
    public String mostrarDetalles(){
        return  super.mostrarDetalles().concat("Talla : "+ talla);
    }
}
