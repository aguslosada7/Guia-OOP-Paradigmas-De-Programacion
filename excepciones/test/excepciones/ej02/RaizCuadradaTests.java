package excepciones.ej02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RaizCuadradaTests {

	@Test
	void test() {
		assertThrows(NumeroNegativoException.class, () -> {
			RaizCuadrada.raizCuadrada(-1);
		});
	}

}
