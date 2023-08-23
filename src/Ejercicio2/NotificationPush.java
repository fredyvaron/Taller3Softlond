package Ejercicio2;

import Ejercicio2.interfaces.SistemaNotificaciones;

import javax.swing.*;

public class NotificationPush implements SistemaNotificaciones {

    private String mensaje;
    private String destinatario;

    public NotificationPush(String mensaje, String destinatario) {
        this.mensaje = mensaje;
        this.destinatario = destinatario;
    }

    @Override
    public void enviar() {
        JOptionPane.showMessageDialog(null, "Se Envio La Notificacion: \n" +
                "Destinatario: "+ this.destinatario + " \n"+
                "Mensaje: "+ this.mensaje);
    }
}
