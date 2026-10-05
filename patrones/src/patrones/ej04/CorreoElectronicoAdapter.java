package patrones.ej04;

public class CorreoElectronicoAdapter implements MensajesAdapter {
	ServicioCorreoElectronico correo;

	public CorreoElectronicoAdapter(ServicioCorreoElectronico correo) {
		this.correo = correo;
	}

	@Override
	public void enviar(Usuario usuario, String mensaje) {
		correo.enviarCorreo(usuario.getCorreoElectronico(), mensaje);
	}
}
