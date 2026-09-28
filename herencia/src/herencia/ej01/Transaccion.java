package herencia.ej01;

import java.time.LocalDate;
import java.util.Objects;

public class Transaccion {
	private String motivo;
	private double monto;
	private LocalDate fecha;
	
	public Transaccion(String motivo, double monto, LocalDate fecha) {
		this.motivo = motivo;
		this.monto = monto;
		this.fecha = fecha;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fecha, Double.valueOf(monto), motivo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transaccion other = (Transaccion) obj;
		return Objects.equals(fecha, other.fecha)
				&& Double.doubleToLongBits(monto) == Double.doubleToLongBits(other.monto)
				&& Objects.equals(motivo, other.motivo);
	}
}
