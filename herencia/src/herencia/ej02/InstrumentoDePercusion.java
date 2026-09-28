package herencia.ej02;

public class InstrumentoDePercusion extends Instrumento implements Lustrable {
	public InstrumentoDePercusion(String nombre, String descripcion) {
		super(nombre, descripcion);
	}

	@Override
	public void tocar() {
		System.out.println("Tocar instrumento de percusión.");
	}
	
	@Override
	public void lustrar() {
		System.out.println("Lustrar instrumento de percusión.");
	}
}
