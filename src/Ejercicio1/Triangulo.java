package Ejercicio1;

import interfaces.FiguraGeometrica;

public class Triangulo implements FiguraGeometrica {

    private double base;
    private double altura;
    public Triangulo(double base, double altura ){
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return base + altura + Math.sqrt(base* base + altura *altura);
    }
}
