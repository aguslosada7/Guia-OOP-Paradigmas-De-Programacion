package relaciones.ej01;

import java.util.Objects;

public class Robot {
	private int codigo;
	private String nombre;
	private TipoDeRobot tipoDeRobot;
	private double energia;
	private double potencia;
	private Piloto piloto;
	
	public Robot(int codigo, String nombre, TipoDeRobot tipoDeRobot, double energia, double potencia, Piloto piloto) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.tipoDeRobot = tipoDeRobot;
		this.energia = energia;
		this.potencia = potencia;
		this.piloto = piloto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Integer.valueOf(codigo));
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Robot other = (Robot) obj;
		return codigo == other.codigo;
	}

	public double getPotencia() {
		return potencia;
	}

	public TipoDeRobot getTipoDeRobot() {
		return tipoDeRobot;
	}

	public double getEnergia() {
		return energia;
	}
	
	public int getCodigo() {
		return codigo;
	}

	@Override
	public String toString() {
		return "Codigo: " + codigo + " | Nombre: " + nombre + " | Tipo: " + tipoDeRobot + " | Energia: "
				+ energia + " | Potencia: " + potencia + " | Piloto: " + piloto;
	}
}
