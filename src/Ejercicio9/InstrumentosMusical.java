package Ejercicio9;

public class InstrumentosMusical {
    private String nombre;

    public InstrumentosMusical(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public String hacerSonido() {
        return "Sonido Generico";
    }
}
