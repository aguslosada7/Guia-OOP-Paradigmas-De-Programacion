package excepciones.ej04;

import java.io.IOException;

public class Cuenta {
	protected double saldo;

	public boolean depositar(double monto) {
		if(monto < 0)
			return false;
		
		saldo += monto;
		return true;
	}
	
	public boolean retirar(double monto) throws IOException {
		if(monto > saldo)
			throw new IOException("Monto mayor al saldo de la cuenta.");
		
		if(monto < 0)
			return false;
		
		saldo -= monto;
		return true;
	}
}
