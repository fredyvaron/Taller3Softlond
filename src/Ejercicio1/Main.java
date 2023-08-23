package Ejercicio1;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int op = 0;
        double radio = 0;
        double base = 0;
        double altura = 0;
        double area = 0;
        double perimetro = 0;
        double lado = 0;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("¿Que figuras geometricas quiere calcular \n"+
                    "1. Circulo\n"+
                    "2. Triangulo\n"+
                    "3. Cuadrado"));
            switch (op){
                case 1:
                    radio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el radio del circulo"));
                    Circulo circulo1 = new Circulo(radio);
                    area = circulo1.calcularArea();
                    perimetro = circulo1.calcularPerimetro();
                    JOptionPane.showMessageDialog(null, "El area es "+ area + " Perimetro "+ perimetro);
                    break;
                case 2:
                    base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base del triangulo"));
                    altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura del triangulo"));
                    Triangulo triangulo1 = new Triangulo(base, altura);
                    area = triangulo1.calcularArea();
                    perimetro = triangulo1.calcularPerimetro();
                    JOptionPane.showMessageDialog(null, "El area es "+ area + " Perimetro "+ perimetro);
                    break;
                case 3:
                    lado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el lado del cuadrado"));
                    Cuadrado cuadrado1 = new Cuadrado(lado);
                    area = cuadrado1.calcularArea();
                    perimetro = cuadrado1.calcularPerimetro();
                    JOptionPane.showMessageDialog(null, "El area es "+ area + " Perimetro "+ perimetro);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion Ivalidad");
            }
        }while (op != 3);
    }
}