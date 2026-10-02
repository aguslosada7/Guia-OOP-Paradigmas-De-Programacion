package diagnostico;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio03Tests {

	@Test
	void cumple() {
		int[][] matriz = {
			{8, 2, -3, 4},
			{5, -6, -6, 20},
			{21, 1, -5, 0}
		};
		
		int[][] matrizEsperada = {
			{15, 1, -3, 21},
			{28, -4, 0, 18},
			{27, 11, -10, 15}
		};
		
		int[][] matrizResultante = Ejercicio03.resolver(matriz);
		
		for(int i = 0; i < matriz.length; i++) {
			assertArrayEquals(matrizEsperada[i], matrizResultante[i]);
		}
	}

}
