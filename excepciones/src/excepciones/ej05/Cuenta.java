package excepciones.ej05;

import java.io.IOException;

public class Cuenta {
	protected double saldo;

	public Cuenta(double saldo) throws SaldoNegativoException {
		if(saldo < 0)
			throw new SaldoNegativoException("Saldo negativo.");
		
		this.saldo = saldo;
	}
	
	public void depositar(double monto) throws MontoNegativoException {
		if(monto < 0)
			throw new MontoNegativoException("Monto negativo.");
		
		saldo += monto;
	}
	
	public void retirar(double monto) throws IOException, MontoNegativoException {
		if(monto > saldo)
			throw new IOException("Monto mayor al saldo de la cuenta.");
		
		if(monto < 0)
			throw new MontoNegativoException("Monto negativo.");
		
		saldo -= monto;
	}
}
