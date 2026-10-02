package excepciones.ej05;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws SaldoNegativoException, MontoNegativoException, IOException {
		Cuenta cuenta;
		
		try {
			cuenta = new Cuenta(-100);
		}
		catch(SaldoNegativoException e) {
			e.printStackTrace();
		}

		cuenta = new Cuenta(50);
		
		try {
			cuenta.depositar(-1);
		}
		catch(MontoNegativoException e) {
			e.printStackTrace();
		}
		
		try {
			cuenta.retirar(100);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
