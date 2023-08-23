package Ejercicio2;

import Ejercicio2.interfaces.SistemaNotificaciones;

import javax.swing.*;

public class CorreoElectronico implements SistemaNotificaciones {
    private String distinatario;
    private String asunto;
    private String cuerpo;

    public CorreoElectronico(String distinatario, String asunto, String cuerpo) {
        this.distinatario = distinatario;
        this.asunto = asunto;
        this.cuerpo = cuerpo;
    }

    @Override
    public void enviar() {
        JOptionPane.showMessageDialog(null, "Se Envio El Mensaje Con: \n" +
                "Destinatario: "+ this.distinatario + " \n" +
                "Asunto:  " + this.asunto + " \n" +
                "Cuerpo: " + this.cuerpo );
    }
}
