package excepciones.ej01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DividirEnterosTests {

	@Test
	void dividirPorCero() {
		assertThrows(ArithmeticException.class, () -> {
			DividirEnteros.dividirEnteros(30, 0);
		});
	}

}
