package Ejercicio5;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de productos
        Celular celular = new Celular("Samsung", 100.00, "Galaxy S21", 2);
        Camiseta camiseta = new Camiseta("M", 19.99, "Azul", 4);
        Novela novela = new Novela("Cien años de soledad", 12.99, "Gabriel García Márquez", 2);

        // Calcular precios y mostrar detalles
        JOptionPane.showMessageDialog(null, celular.mostrarDetalles());
        JOptionPane.showMessageDialog(null, camiseta.mostrarDetalles());
        JOptionPane.showMessageDialog(null, novela.mostrarDetalles());


    }
}
