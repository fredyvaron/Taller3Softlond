package Ejercicio2;

import Ejercicio2.interfaces.SistemaNotificaciones;

import javax.swing.*;

public class MensajeDeTexto implements SistemaNotificaciones {
    private  String mensaje;
    private String destinatario;

    public MensajeDeTexto(String mensaje, String destinatario) {
        this.mensaje = mensaje;
        this.destinatario = destinatario;
    }

    @Override
    public void enviar() {
        JOptionPane.showMessageDialog(null, "Se Envio El Mensaje De Texto Con: \n" +
                "Destinatario: "+ this.destinatario + " \n"+
                "Mensaje: "+ this.mensaje);
    }
}
