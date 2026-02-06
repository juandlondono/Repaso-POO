import java.time.Clock;

public class NotificacionWhatsApp extends Notificacion{

    protected NotificacionWhatsApp(String receptorNotificacion) {
        super(receptorNotificacion);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("WhatsApp: " + mensaje + " a: " + receptorNotificacion);
    }
}
