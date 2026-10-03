package patrones.ej01;

public class Cuadrado implements FormaGeometrica {
	private double lado;
	
	public Cuadrado(double lado) {
		if(lado <= 0)
			throw new RuntimeException("Lado negativo.");
		
		this.lado = lado;
	}
	
	@Override
	public double getArea() {
		return Math.pow(lado, 2);
	}
}
