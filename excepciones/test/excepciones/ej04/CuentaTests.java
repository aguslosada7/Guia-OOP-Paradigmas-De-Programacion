package excepciones.ej04;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class CuentaTests {

	@Test
	void retirarMontoMayorAlSaldo() {
		Cuenta cuenta = new Cuenta();
		cuenta.depositar(100);
		
		assertThrows(IOException.class, () -> {
			cuenta.retirar(150);
		});
	}

}
