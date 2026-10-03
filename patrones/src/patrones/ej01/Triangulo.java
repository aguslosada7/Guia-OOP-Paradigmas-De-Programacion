package patrones.ej01;

public class Triangulo implements FormaGeometrica {
	private double base;
	private double altura;
	
	public Triangulo(double base, double altura) {
		if(base <= 0 || altura <= 0)
			throw new RuntimeException("Base y/o altura negativas.");
		
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double getArea() {
		return (base*altura)/2;
	}
}
