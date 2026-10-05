package patrones.ej04;

public class ServicioPush {
	Usuario usuario;

	public ServicioPush(Usuario usuario) {
		this.usuario = usuario;
	}

	public void enviarPush(String dispositivo, String mensaje) {
		System.out.println("Dispositivo receptor: " + dispositivo);
		System.out.println("Mensaje: " + mensaje);
	}
}
