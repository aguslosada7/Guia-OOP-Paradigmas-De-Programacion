package excepciones.ej03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DividirEnterosTests {

	@Test
	void dividirPorCero() {
		assertThrows(DivisionPorCero.class, () -> {
			DividirEnteros.dividirEnteros(30, 0);
		});
	}

}
