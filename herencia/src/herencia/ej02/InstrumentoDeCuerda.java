package herencia.ej02;

public class InstrumentoDeCuerda extends Instrumento implements Afinable {
	public InstrumentoDeCuerda(String nombre, String descripcion) {
		super(nombre, descripcion);
	}

	@Override
	public void tocar() {
		System.out.println("Tocar instrumento de cuerda.");
	}
	
	@Override
	public void afinarManualmente() {
		System.out.println("Afinar instrumento de cuerda manualmente.");
	}
	
	@Override
	public void afinarAutomaticamente() {
		System.out.println("Afinar instrumento de cuerda automáticamente.");
	}
}
