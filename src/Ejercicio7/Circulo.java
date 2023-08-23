package Ejercicio7;

import Ejercicio7.abstrac.FormaGeometrica;

public class Circulo extends FormaGeometrica {
    private double radio;
    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
