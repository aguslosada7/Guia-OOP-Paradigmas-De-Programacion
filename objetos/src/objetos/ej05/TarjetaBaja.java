package objetos.ej05;

public class TarjetaBaja {
	private double saldo;
	private int cantidadViajesEnColectivo;
	private int cantidadViajesEnSubte;
	
	public TarjetaBaja(double saldoInicial) {
		if(saldoInicial > 0)
			saldo = saldoInicial;
	}

	public double obtenerSaldo() {
		return saldo;
	}

	public void cargar(double monto) {
		if(monto > 0)
			saldo += monto;
	}

	public void pagarViajeEnColectivo() {
		if(saldo >= 39.59) {
			saldo -= 39.59;
			cantidadViajesEnColectivo++;
		}
	}

	public void pagarViajeEnSubte() {
		if(saldo >= 34.50) {
			saldo -= 34.50;
			cantidadViajesEnSubte++;
		}
	}

	public int contarViajes() {
		return cantidadViajesEnColectivo + cantidadViajesEnSubte;
	}

	public int contarViajesEnColectivo() {
		return cantidadViajesEnColectivo;
	}

	public int contarViajesEnSubte() {
		return cantidadViajesEnSubte;
	}
}
