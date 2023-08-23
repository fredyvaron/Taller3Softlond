package Ejercicio9;

public class Violines extends InstrumentosMusical{

    private String sonido;

    public Violines(String nombre, String sonido) {
        super(nombre);
        this.sonido = sonido;
    }

    @Override
    public String hacerSonido() {

        return sonido;
    }
}
