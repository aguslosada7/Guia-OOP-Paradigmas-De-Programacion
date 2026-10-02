package diagnostico;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio02Tests {

	@Test
	void cumple() {
		int[][] matriz = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 0, 9},
			{10, 11, 12}
		};
		
		assertTrue(Ejercicio02.resolver(matriz));
	}
	
	@Test
	void noCumple() {
		int[][] matriz = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9},
				{10, 11, 12}
		};
		
		assertFalse(Ejercicio02.resolver(matriz));
	}

}
