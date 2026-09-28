package herencia.ej02;

public class MainLustrador {

	public static void main(String[] args) {
		Lustrador lustrador = new Lustrador();
		InstrumentoDePercusion i1 = new InstrumentoDePercusion("Batería", "Yamaha");
		InstrumentoDeViento i2 = new InstrumentoDeViento("Flauta", "Yamaha", TipoDeInstrumentoDeViento.MADERA);
		InstrumentoDeViento i3 = new InstrumentoDeViento("Clarinete", "Calamardo", TipoDeInstrumentoDeViento.METAL);
		
		lustrador.agregarInstrumento(i1);
		lustrador.agregarInstrumento(i2);
		lustrador.agregarInstrumento(i3);
		
		lustrador.lustrarInstrumentos();
	}
}
