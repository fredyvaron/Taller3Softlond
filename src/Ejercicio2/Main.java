package Ejercicio2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int op = 0;
        String mensaje = "";
        String destinatario = "";
        String asunto = "";
        String cuerpo = "";
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Una Opcion Para Notificacion \n"+
                    "1. Correo Electronico \n"+
                    "2. Mensaje De Texto \n"+
                    "3. Notificacion Push"));
            switch (op){
                case 1:
                    destinatario = JOptionPane.showInputDialog("Escriba el Nombre Del Destinatario");
                    asunto = JOptionPane.showInputDialog("Escriba El Asunto Del Mensaje");
                    cuerpo = JOptionPane.showInputDialog("Escriba El Cuerpo Del Mensaje");
                    CorreoElectronico correoelectronico = new CorreoElectronico(destinatario, asunto, cuerpo);
                    correoelectronico.enviar();
                    break;
                case 2:
                    destinatario = JOptionPane.showInputDialog("Escriba el Nombre Del Destinatario");
                    mensaje = JOptionPane.showInputDialog("Escriba El Cuerpo Del Mensaje");
                    MensajeDeTexto mensaje1 = new MensajeDeTexto(mensaje, destinatario);
                    mensaje1.enviar();
                    break;
                case 3:
                    destinatario = JOptionPane.showInputDialog("Escriba el Nombre Del Destinatario");
                    mensaje = JOptionPane.showInputDialog("Escriba El Cuerpo Del Mensaje");
                    NotificationPush notificacion1 = new NotificationPush(mensaje, destinatario);
                    notificacion1.enviar();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion No Valida");
            }
        }while (op != 3);
    }
}
