package herencia.ej02;

public class InstrumentoDeViento extends Instrumento implements Afinable, Lustrable {
	private TipoDeInstrumentoDeViento tipoDeInstrumentoDeViento;
	
	public InstrumentoDeViento(String nombre, String descripcion, TipoDeInstrumentoDeViento tipo) {
		super(nombre, descripcion);
		tipoDeInstrumentoDeViento = tipo;
	}

	@Override
	public void tocar() {
		System.out.println("Tocar instrumento de viento.");
	}
	
	@Override
	public void afinarManualmente() {
		System.out.println("Afinar instrumento de viento manualmente.");
	}
	
	@Override
	public void afinarAutomaticamente() {
		System.out.println("Afinar instrumento de viento automáticamente.");
	}
	
	@Override
	public void lustrar() {
		System.out.println("Lustrar instrumento de viento.");
	}
}
