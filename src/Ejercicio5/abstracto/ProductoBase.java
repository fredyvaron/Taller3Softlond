package Ejercicio5.abstracto;

import Ejercicio5.interfaces.SistemaTienda;

import javax.swing.*;

public abstract class ProductoBase implements SistemaTienda {
    protected String nombre;
    protected double precio;

    protected Integer cantidad;

    public ProductoBase(String nombre, double precio, Integer cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public double calcularPrecio(){
        return precio*cantidad;
    }
    public String mostrarDetalles(){
         return "Nombre: "+ nombre + " \n" +"Precio: "+ calcularPrecio()+ " \n";
    }
}
