package colecciones.ej02;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Venta {
	private int numeroDeVenta;
	private LocalDate fecha;
	private LocalTime hora;
	private String nombreDelCliente;
	private double monto;
	
	public Venta(int numeroDeVenta, LocalDate fecha, LocalTime hora, String nombreDelCliente, double monto) {
		super();
		this.numeroDeVenta = numeroDeVenta;
		this.fecha = fecha;
		this.hora = hora;
		this.nombreDelCliente = nombreDelCliente;
		this.monto = monto;
	}

	@Override
	public String toString() {
		return "Venta [numeroDeVenta=" + numeroDeVenta + ", fecha=" + fecha + ", hora=" + hora + ", nombreDelCliente="
				+ nombreDelCliente + ", monto=" + monto + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Integer.valueOf(numeroDeVenta));
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Venta other = (Venta) obj;
		return numeroDeVenta == other.numeroDeVenta;
	}

	public LocalDate getFecha() {
		return fecha;
	}
}
