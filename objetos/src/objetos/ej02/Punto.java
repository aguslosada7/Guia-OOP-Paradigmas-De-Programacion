package objetos.ej02;

import java.util.Objects;

public class Punto {
	private double x;
	private double y;
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double obtenerX() {
		return x;
	}
	
	public double obtenerY() {
		return y;
	}
	
	public void cambiarX(double nuevoX) {
		x = nuevoX;
	}
	
	public void cambiarY(double nuevoY) {
		y = nuevoY;
	}
	
	public boolean estaSobreEjeX() {
		if(y == 0)
			return true;
		
		return false;
	}
	
	public boolean estaSobreEjeY() {
		if(x == 0)
			return true;
		
		return false;
	}
	
	public boolean esElOrigen() {
		if(x == 0 && y == 0)
			return true;
		
		return false;
	}
	
	public double distanciaAlOrigen() {
		return Math.hypot(x, y);
	}
	
	public double distanciaAotroPunto(Punto otro) {
		return Math.hypot(x - otro.x, y - otro.y);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(Double.valueOf(x), Double.valueOf(y));
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		return Double.doubleToLongBits(x) == Double.doubleToLongBits(other.x)
				&& Double.doubleToLongBits(y) == Double.doubleToLongBits(other.y);
	}
}
