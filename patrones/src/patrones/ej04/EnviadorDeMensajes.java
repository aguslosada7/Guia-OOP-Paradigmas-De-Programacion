package patrones.ej04;

public class EnviadorDeMensajes {
	public void enviarMensaje(MensajesAdapter servicio, Usuario usuario, String mensaje) {
		servicio.enviar(usuario, mensaje);
	}
}
