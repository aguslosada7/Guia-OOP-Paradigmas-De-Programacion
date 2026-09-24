package objetos.ej03;

import java.util.Objects;

import objetos.ej02.Punto;

/*
 * Implementar una clase que modele un círculo, del que se desea manipular (obtener y cambiar):
 * - radio
 * - diámetro
 * - perímetro
 * - área
 * 
 * - si interseca con otro circulo
 * - si está centrado en el origen LA CLASE PUNTO YA TIENE UN MÉTODO PARA ESTO
 * - distancia con el centro de otro círculo ÍDEM
 * Realizar todas las pruebas que considere convenientes. Se pueden agregar métodos privados.
 * */

public class Circulo {
	private double radio;
	private double diametro;
	private double perimetro;
	private double area;
	private Punto centro;
	
	public Circulo(double x, double y, double radio) {
		this.radio = radio;
		diametro = radio*2;
		perimetro = 2*Math.PI*radio;
		area = Math.PI*Math.pow(radio, 2);
		centro = new Punto(x, y);
	}

	public void setRadio(double nuevoRadio) {
		if(nuevoRadio > 0) {
			radio = nuevoRadio;
			diametro = radio*2;
			perimetro = 2*Math.PI*radio;
			area = Math.PI*Math.pow(radio, 2);
		}
	}

	public double getRadio() {
		return radio;
	}
	
	public void setDiametro(double nuevoDiametro) {
		if(nuevoDiametro > 0) {
			diametro = nuevoDiametro;
			radio = diametro/2;
			perimetro = 2*Math.PI*radio;
			area = Math.PI*Math.pow(radio, 2);
		}
	}
	
	public double getDiametro() {
		return diametro;
	}
	
	public void setPerimetro(double nuevoPerimetro) {
		if(nuevoPerimetro > 0) {
			perimetro = nuevoPerimetro;
			radio = perimetro/(2*Math.PI);
			diametro = radio*2;
			area = Math.PI*Math.pow(radio, 2);
		}
	}
	
	public double getPerimetro() {
		return perimetro;
	}
	
	public void setArea(double nuevaArea) {
		if(nuevaArea > 0) {
			area = nuevaArea;
			radio = Math.sqrt(area/Math.PI);
			diametro = radio*2;
			perimetro = 2*Math.PI*radio;
		}
	}
	
	public double getArea() {
		return area;
	}
	
	public void setCentro(double x, double y){
		centro.cambiarX(x);
		centro.cambiarY(y);
	}
	
	public Punto getCentro() {
		return centro;
	}
	
	public boolean intersecaConOtroCirculo(Circulo otroCirculo) {
		double distanciaEntreCentros = Math.hypot(centro.obtenerX() - otroCirculo.centro.obtenerX(), centro.obtenerY() - otroCirculo.centro.obtenerY());
		
		if(distanciaEntreCentros > radio + otroCirculo.radio || distanciaEntreCentros < Math.abs(radio - otroCirculo.radio))
			return false;
		
		return true;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Double.valueOf(area), centro, Double.valueOf(diametro), Double.valueOf(perimetro),
				Double.valueOf(radio));
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circulo other = (Circulo) obj;
		return Double.doubleToLongBits(area) == Double.doubleToLongBits(other.area)
				&& Objects.equals(centro, other.centro)
				&& Double.doubleToLongBits(diametro) == Double.doubleToLongBits(other.diametro)
				&& Double.doubleToLongBits(perimetro) == Double.doubleToLongBits(other.perimetro)
				&& Double.doubleToLongBits(radio) == Double.doubleToLongBits(other.radio);
	}
}
