package patrones.ej01;

public class Circulo implements FormaGeometrica {
	private double radio;
	
	public Circulo(double radio) {
		if(radio <= 0)
			throw new RuntimeException("Radio negativo.");
		
		this.radio = radio;
	}
	
	@Override
	public double getArea() {
		return Math.PI*Math.pow(radio, 2);
	}
}
