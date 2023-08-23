package Ejercicio5;

import Ejercicio5.abstracto.Electronica;

public class Celular extends Electronica {
    public Celular(String marca, double precio, String modelo, Integer cantidad) {
        super("Ceular "+modelo, precio, marca, cantidad);
    }
}
