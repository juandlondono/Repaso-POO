public class NotificacionCelular extends Notificacion {
    public NotificacionCelular(String receptorNotificacion) {
        super(receptorNotificacion);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Nueva notificacion: " + mensaje + " Para: " + receptorNotificacion);
    }
}

