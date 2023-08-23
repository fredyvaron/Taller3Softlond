package Ejercicio5.abstracto;

import javax.swing.*;

public abstract class Electronica extends ProductoBase{
    protected String marca;
    public Electronica(String nombre, double precio, String marca, Integer cantidad) {
        super(nombre, precio, cantidad);
        this.marca = marca;
    }
    public String mostrarDetalles(){
        return  super.mostrarDetalles().concat("Marca: "+ marca);
    }
}
