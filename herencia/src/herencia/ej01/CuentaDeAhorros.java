package herencia.ej01;

public class CuentaDeAhorros extends Cuenta {
	private double saldoSecundario;
	
	public boolean reservar(double monto) {
		if(monto > super.saldo)
			return false;
		
		super.saldo -= monto;
		saldoSecundario += monto;
		return true;
	}
	
	public void reintegrarReserva() {
		super.saldo += saldoSecundario;
		saldoSecundario = 0;
	}
}
