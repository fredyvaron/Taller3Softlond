package Ejercicio3;

import Ejercicio3.abstractas.CuentaBancaria;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<CuentaBancaria> cuentas = new ArrayList<>();

        cuentas.add(new CuentaAhorro(1000));
        cuentas.add(new CuentaCorriente(500, 1000));

        while (true) {
            String menu = "1. Mostrar saldo\n2. Depositar\n3. Retirar\n4. Salir";
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            if (opcion == 4) {
                break;
            }

            int cuentaIndex = Integer.parseInt(JOptionPane.showInputDialog("Selecciona una cuenta (0 o 1):"));
            CuentaBancaria cuenta = cuentas.get(cuentaIndex);

            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Saldo: " + cuenta.getSaldo());
                    break;
                case 2:
                    double deposito = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a depositar:"));
                    cuenta.depositar(deposito);
                    break;
                case 3:
                    double retiro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a retirar:"));
                    cuenta.retirar(retiro);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
            }
        }
    }
}
