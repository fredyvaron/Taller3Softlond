package Ejercicio8;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Empleado[] empleados = new Empleado[4];
        empleados[0] = new Asalariado("Alberto", 1400000);
        empleados[1] = new PorHora("Alex", 5000, 7);
        empleados[2] = new Asalariado("Liliana", 2000000);
        empleados[3] = new PorHora("Francisco", 4500 , 40);

        for (Empleado empleado: empleados) {
            JOptionPane.showMessageDialog(null, "Nombre"+ empleado.getNombre()+ " Obtuvo un salaario de: "+ empleado.calcularSalario());
        }
    }
}
