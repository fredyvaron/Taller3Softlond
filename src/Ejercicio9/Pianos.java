package Ejercicio9;

public class Pianos extends InstrumentosMusical{
    private String sonido;

    public Pianos(String nombre, String sonido) {
        super(nombre);
        this.sonido = sonido;
    }

    @Override
    public String hacerSonido() {
        return sonido;
    }
}
