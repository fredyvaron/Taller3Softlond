package Ejercicio6;

public class Main {
    public static void main(String[] args) {
        Animal[] animales = new Animal[3];
        animales[0] = new Perro();
        animales[1] = new Gato();
        animales[2] = new Pajaro();

        for (Animal animal: animales) {
            animal.hacerSonido();
        }
    }
}
