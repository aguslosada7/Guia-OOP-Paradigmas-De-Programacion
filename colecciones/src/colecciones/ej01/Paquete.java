package colecciones.ej01;

import java.util.Objects;

public class Paquete {
	private int numeroDeSeguimiento;
	private String direccionDeOrigen;
	private String direccionDeDestino;
	private double peso;
	
	public Paquete(int numeroDeSeguimiento, String direccionDeOrigen, String direccionDeDestino, double peso) {
		super();
		this.numeroDeSeguimiento = numeroDeSeguimiento;
		this.direccionDeOrigen = direccionDeOrigen;
		this.direccionDeDestino = direccionDeDestino;
		this.peso = peso;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Integer.valueOf(numeroDeSeguimiento));
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paquete other = (Paquete) obj;
		return numeroDeSeguimiento == other.numeroDeSeguimiento;
	}
	
	public double getPeso() {
		return peso;
	}

	@Override
	public String toString() {
		return "Paquete [numeroDeSeguimiento=" + numeroDeSeguimiento + ", direccionDeOrigen=" + direccionDeOrigen
				+ ", direccionDeDestino=" + direccionDeDestino + ", peso=" + peso + "]";
	}
}
