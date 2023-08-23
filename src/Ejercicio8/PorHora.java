package Ejercicio8;

public class PorHora extends Empleado{
    private double precioHora;
    private double horasTrabajadas;

    public PorHora(String nombre, double precioHora, double horasTrabajadas) {
        super(nombre);
        this.precioHora = precioHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        return precioHora * horasTrabajadas;
    }
}
