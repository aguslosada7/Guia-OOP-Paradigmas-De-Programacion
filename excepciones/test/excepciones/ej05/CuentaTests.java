package excepciones.ej05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuentaTests {

	@Test
	void crearConSaldoNegativo() {
		assertThrows(SaldoNegativoException.class, () -> {
			new Cuenta(-300);
		});
	}

	@Test
	void depositarMontoNegativo() {
		assertThrows(MontoNegativoException.class, () -> {
			try {
				Cuenta cuenta = new Cuenta(100);
				cuenta.depositar(-10);
			} catch(MontoNegativoException e) {
				throw new MontoNegativoException("Monto negativo.");
			}
		});
	}
	
	@Test
	void retirarMontoNegativo() {
		assertThrows(MontoNegativoException.class, () -> {
			try {
				Cuenta cuenta = new Cuenta(100);
				cuenta.retirar(-10);
			} catch(MontoNegativoException e) {
				throw new MontoNegativoException("Monto negativo.");
			}
		});
	}
}
