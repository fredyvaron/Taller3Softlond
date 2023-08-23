package Ejercicio5;

import Ejercicio5.abstracto.Ropa;

public class Camiseta extends Ropa {
    public Camiseta(String nombre, double precio, String talla, Integer cantidad) {
        super("Camiseta "+nombre, precio, talla, cantidad);
    }
}
