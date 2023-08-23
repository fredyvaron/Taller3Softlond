package Ejercicio7;

import Ejercicio7.abstrac.FormaGeometrica;

public class Rectangulo extends FormaGeometrica {
    private double altura;
    private double ancho;

    public Rectangulo(String nombre, double ancho, double altura) {
        super(nombre);
        this.altura = altura;
        this.ancho = ancho;
    }

    @Override
    public double calcularArea() {
        return ancho * altura;
    }
}
