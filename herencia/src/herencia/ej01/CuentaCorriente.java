package herencia.ej01;

public class CuentaCorriente extends Cuenta {
	private double montoEnDescubierto;
	
	public CuentaCorriente(double montoEnDescubierto) {
		this.montoEnDescubierto = montoEnDescubierto;
	}
	
	@Override
	public boolean retirar(double monto) {
		if(monto < 0 || monto > super.saldo + montoEnDescubierto)
			return false;
		
		if(monto > super.saldo) {
			montoEnDescubierto -= monto - saldo;
			super.saldo = 0;
		}
		else {
			super.saldo -= monto;
		}
		
		return true;
	}
	
	public double consultarMontoEnDescubierto() {
		return montoEnDescubierto;
	}
}
