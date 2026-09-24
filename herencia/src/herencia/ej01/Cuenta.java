package herencia.ej01;

public class Cuenta {
	protected double saldo;
	
	public boolean depositar(double monto) {
		if(monto < 0)
			return false;
		
		saldo += monto;
		return true;
	}
	
	public boolean retirar(double monto) {
		if(monto > saldo || monto < 0)
			return false;
		
		saldo -= monto;
		return true;
	}

	public double consultarSaldo() {
		return saldo;
	}
	
	public boolean transferir(double monto, Cuenta cuentaDestino) {
		if(monto > saldo || monto < 0)
			return false;
		
		cuentaDestino.saldo += monto;
		saldo -= monto;
		return true;
	}
}
