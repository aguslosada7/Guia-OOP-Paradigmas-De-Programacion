package patrones.ej04;

public class SMSAdapter implements MensajesAdapter {
	ServicioSMS sms;

	public SMSAdapter(ServicioSMS sms) {
		this.sms = sms;
	}

	@Override
	public void enviar(Usuario usuario, String mensaje) {
		sms.enviarSMS(usuario.getNumeroDeTelefono(), mensaje);
	}
}
