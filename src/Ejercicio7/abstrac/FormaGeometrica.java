package Ejercicio7.abstrac;

import Ejercicio7.interfaces.Forma;

public abstract class FormaGeometrica implements Forma {
    protected String nombre;

    public FormaGeometrica(String nombre) {
        this.nombre = nombre;
    }
    public String obtenerNombre(){
        return nombre;
    }
}
