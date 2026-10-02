package diagnostico;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio04Tests {

	@Test
	void test() {
		int[][] matriz = {
			{1, 2, 3, 4},
			{5, -6, -6, 20},
			{1, 1, 10, 10}
		};
		
		int[] vectorDeModasEsperado = {4, -6, 10};
		
		assertArrayEquals(vectorDeModasEsperado, Ejercicio04.resolver(matriz));
	}

}
