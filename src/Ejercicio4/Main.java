package Ejercicio4;

import Ejercicio4.interfaces.Carta;

public class Main {
    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        baraja.barajar();

        for (int i = 0; i < 5; i++) {
            Carta carta = baraja.repartir();
            if (carta != null) {
                carta.mostrarCarta();
            } else {
                System.out.println("No quedan cartas en la baraja.");
            }
        }
    }
}
