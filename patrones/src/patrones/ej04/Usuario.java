package patrones.ej04;

public class Usuario {
	private String correoElectronico;
	private int numeroDeTelefono;
	private String dispositivo;

	public Usuario(String correoElectronico, int numeroDeTelefono, String dispositivo) {
		this.correoElectronico = correoElectronico;
		this.numeroDeTelefono = numeroDeTelefono;
		this.dispositivo = dispositivo;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public int getNumeroDeTelefono() {
		return numeroDeTelefono;
	}

	public String getDispositivo() {
		return dispositivo;
	}
}
