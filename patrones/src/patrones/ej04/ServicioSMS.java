package patrones.ej04;

public class ServicioSMS {
	Usuario usuario;

	public ServicioSMS(Usuario usuario) {
		this.usuario = usuario;
	}

	public void enviarSMS(int numero, String mensaje) {
		System.out.println("Numero receptor: " + numero);
		System.out.println("Mensaje: " + mensaje);
	}
}
