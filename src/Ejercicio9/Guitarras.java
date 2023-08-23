package Ejercicio9;

public class Guitarras  extends InstrumentosMusical{
    public String sonido;

    public Guitarras(String nombre, String sonido) {
        super(nombre);
        this.sonido = sonido;
    }

    @Override
    public String hacerSonido() {
        return sonido;
    }
}
