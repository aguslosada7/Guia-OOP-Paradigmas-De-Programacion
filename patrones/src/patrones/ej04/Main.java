package patrones.ej04;

public class Main {

	public static void main(String[] args) {
		EnviadorDeMensajes enviador = new EnviadorDeMensajes();
		Usuario destinatario = new Usuario("clown@gmail.com", 8675309, "Samsung Galaxy Z33");
		String mensaje = "Hola, soy un mensaje de prueba.";
		ServicioCorreoElectronico correo = new ServicioCorreoElectronico(destinatario);
		ServicioSMS sms = new ServicioSMS(destinatario);
		ServicioPush push = new ServicioPush(destinatario);
		
		enviador.enviarMensaje(new CorreoElectronicoAdapter(correo), destinatario, mensaje);
		System.out.println();
		enviador.enviarMensaje(new SMSAdapter(sms), destinatario, mensaje);
		System.out.println();
		enviador.enviarMensaje(new PushAdapter(push), destinatario, mensaje);
	}

}
