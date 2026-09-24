package relaciones.ej01;

public class Registro {
	private int cantidadDeVictorias;
	private int cantidadDeEmpates;
	private int cantidadDeDerrotas;
	private static final int PUNTAJE_VICTORIA = 3;
	private static final int PUNTAJE_EMPATE = 1;
	private int puntaje;
	
	public void anotarVictoria() {
		cantidadDeVictorias++;
	}
	
	public void anotarEmpate() {
		cantidadDeEmpates++;
	}
	
	public void anotarDerrota() {
		cantidadDeDerrotas++;
	}
	
	public int calcularPuntaje() {
		puntaje = cantidadDeVictorias*PUNTAJE_VICTORIA + cantidadDeEmpates*PUNTAJE_EMPATE;
		return puntaje;
	}
	
	public void generarResumen() {
		System.out.println("Victorias: " + cantidadDeVictorias);
		System.out.println("Empates: " + cantidadDeEmpates);
		System.out.println("Derrotas: " + cantidadDeDerrotas);
		System.out.println("Puntaje total: " + puntaje);
	}
}
