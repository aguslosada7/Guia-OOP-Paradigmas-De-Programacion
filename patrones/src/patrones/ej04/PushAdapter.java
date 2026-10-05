package patrones.ej04;

public class PushAdapter implements MensajesAdapter {
	ServicioPush push;
	
	public PushAdapter(ServicioPush push) {
		this.push = push;
	}

	@Override
	public void enviar(Usuario usuario, String mensaje) {
		push.enviarPush(usuario.getDispositivo(), mensaje);
	}
}
