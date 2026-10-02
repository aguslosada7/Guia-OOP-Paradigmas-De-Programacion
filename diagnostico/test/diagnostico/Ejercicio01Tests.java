package diagnostico;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio01Tests {

	@Test
	void cumple() {
		int[][] matriz = {
			{2, 2, -3, 4},
			{5, 2, -6, 20},
			{21, 1, 4, 0},
			{5, -9, 6, 8}
		};
		
		assertTrue(Ejercicio01.resolver(matriz));
	}
	
	@Test
	void noCumple() {
		int[][] matriz = {
			{8, 2, -3, 4},
			{5, 8, -6, 20},
			{21, 1, -5, 0},
			{5, -9, 6, 10}
		};
		
		assertFalse(Ejercicio01.resolver(matriz));
	}

}