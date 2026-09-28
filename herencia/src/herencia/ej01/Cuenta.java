package herencia.ej01;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cuenta {
	protected double saldo;
	protected List<Transaccion> transacciones;
	
	public Cuenta() {
		transacciones = new ArrayList<Transaccion>();
	}

	public boolean depositar(double monto) {
		if(monto < 0)
			return false;
		
		saldo += monto;
		transacciones.add(new Transaccion("Acreditación", monto, LocalDate.now()));
		return true;
	}
	
	public boolean retirar(double monto) {
		if(monto > saldo || monto < 0)
			return false;
		
		saldo -= monto;
		transacciones.add(new Transaccion("Débito", monto, LocalDate.now()));
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
		transacciones.add(new Transaccion("Transferencia", monto, LocalDate.now()));
		return true;
	}

	public List<Transaccion> getTransacciones() {
		return transacciones;
	}
}
