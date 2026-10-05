package patrones.ej04;

public class ServicioCorreoElectronico {
	Usuario usuario;
	
	public ServicioCorreoElectronico(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public void enviarCorreo(String destinatario, String mensaje) {
		System.out.println("Correo del destinatario: " + destinatario);
		System.out.println("Mensaje: " + mensaje);
	}
}
