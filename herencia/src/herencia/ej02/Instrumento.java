package herencia.ej02;

public class Instrumento {
	private String nombre;
	private String descripcion;
	
	public Instrumento(String nombre, String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public void tocar() {
		System.out.println("Tocar instrumento.");
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Descripcion: " + descripcion;
	}
}
