package diagnostico;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio05Tests {

	@Test
	void randomTest() {
		int[][] matriz = {
			{1, 2, 3, 4},
			{5, 6, 7, 8},
			{9, 10, 11, 12},
			{13, 14, 15, 16}
		};
		
		int[][] matrizEsperada = {
			{13},
			{9, 14},
			{5, 10, 15},
			{1, 6, 11, 16},
			{2, 7, 12},
			{3, 8},
			{4}
		};
		
		int[][] matrizResultante = Ejercicio05.resolver(matriz);
		
		for(int i = 0; i < 2*matriz.length - 1; i++) {
			assertArrayEquals(matrizEsperada[i], matrizResultante[i]);
		}
	}

}
