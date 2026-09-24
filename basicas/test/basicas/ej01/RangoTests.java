package basicas.ej01;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class RangoTests {

	@Test
	void creacionDeIntervaloAbierto() {
		Rango rango = Rango.crearIntervaloAbierto(-1, 1);
		double limiteInferiorEsperado = -1;
		double limiteSuperiorEsperado = 1;
		
		assertNotNull(rango);
		assertEquals(limiteInferiorEsperado, rango.getLimiteInferior());
		assertEquals(limiteSuperiorEsperado, rango.getLimiteSuperior());
		assertTrue(rango.isAbiertoADerecha());
		assertTrue(rango.isAbiertoAIzquierda());
	}

	@Test
	void creacionDeIntervaloCerrado() {
		Rango rango = Rango.crearIntervaloCerrado(-1, 1);
		double limiteInferiorEsperado = -1;
		double limiteSuperiorEsperado = 1;
		
		assertNotNull(rango);
		assertEquals(limiteInferiorEsperado, rango.getLimiteInferior());
		assertEquals(limiteSuperiorEsperado, rango.getLimiteSuperior());
		assertFalse(rango.isAbiertoADerecha());
		assertFalse(rango.isAbiertoAIzquierda());
	}
	
	@Test
	void creacionDeIntervaloAbiertoAIzquierda() {
		Rango rango = Rango.crearIntervaloAbiertoAIzquierda(-1, 1);
		double limiteInferiorEsperado = -1;
		double limiteSuperiorEsperado = 1;
		
		assertNotNull(rango);
		assertEquals(limiteInferiorEsperado, rango.getLimiteInferior());
		assertEquals(limiteSuperiorEsperado, rango.getLimiteSuperior());
		assertFalse(rango.isAbiertoADerecha());
		assertTrue(rango.isAbiertoAIzquierda());
	}
	
	@Test
	void creacionDeIntervaloAbiertoADerecha() {
		Rango rango = Rango.crearIntervaloAbiertoADerecha(-1, 1);
		double limiteInferiorEsperado = -1;
		double limiteSuperiorEsperado = 1;
		
		assertNotNull(rango);
		assertEquals(limiteInferiorEsperado, rango.getLimiteInferior());
		assertEquals(limiteSuperiorEsperado, rango.getLimiteSuperior());
		assertTrue(rango.isAbiertoADerecha());
		assertFalse(rango.isAbiertoAIzquierda());
	}
	
	@Test
	void numeroDentroDeRangoCerrado() {
		Rango rango = Rango.crearIntervaloCerrado(-3, 0);
		double numero = -3;
		
		assertTrue(rango.numeroSeEncuentraEnRango(numero));
	}
	
	@Test
	void limitesNoIncluidosEnRangoAbierto() {
		Rango rango = Rango.crearIntervaloAbierto(-3, 0);
		
		assertFalse(rango.numeroSeEncuentraEnRango(-3));
		assertFalse(rango.numeroSeEncuentraEnRango(0));
	}
	
	@Test
	void incluidoEnOtroRango() {
		Rango rango1 = Rango.crearIntervaloAbiertoADerecha(0, 3);
		Rango rango2 = Rango.crearIntervaloCerrado(0, 3);
		
		assertTrue(rango1.estaDentroDeOtroRango(rango2));
	}
	
	@Test
	void interseca() {
		Rango rango1 = Rango.crearIntervaloAbiertoADerecha(-1, 8);
		Rango rango2 = Rango.crearIntervaloCerrado(5, 33);
		
		assertTrue(rango1.intersecaConOtroRango(rango2));
	}
	
	@Test
	void noInterseca() {
		Rango rango1 = Rango.crearIntervaloAbiertoADerecha(0, 3);
		Rango rango2 = Rango.crearIntervaloCerrado(3, 33);
		
		assertFalse(rango1.intersecaConOtroRango(rango2));
	}
	
	@Test
	void ordenarMedianteInicio() {
		Rango r1 = Rango.crearIntervaloAbierto(5, 8);
		Rango r2 = Rango.crearIntervaloAbiertoAIzquierda(-12, 8);
		Rango r3 = Rango.crearIntervaloCerrado(-4, 12);
		Rango r4 = Rango.crearIntervaloAbiertoAIzquierda(5, 8);
		Rango r5 = Rango.crearIntervaloAbiertoADerecha(-4, 12);
		
		Rango rangos[] = {r1, r2, r3, r4, r5};
		Rango rangosEnOrdenEsperado[] = {r2, r3, r5, r4, r1};
		
		Arrays.sort(rangos, new CompararRangosPorInicio());
		
		assertArrayEquals(rangos, rangosEnOrdenEsperado);
	}
	
	@Test
	void desplazar() {
		Rango rango = Rango.crearIntervaloAbiertoAIzquierda(0, 0);
		int escalar = 3;
		
		assertTrue(rango.desplazarConEscalar(escalar).equals(Rango.crearIntervaloAbiertoAIzquierda(escalar, escalar)));
	}
	
	@Test
	void obtenerRangoInterseccion() {
		Rango rango1 = Rango.crearIntervaloAbierto(5, 12);
		Rango rango2 = Rango.crearIntervaloAbiertoAIzquierda(3, 8);
		Rango rangoInterseccion = rango1.rangoInterseccion(rango2);
		Rango rangoEsperado = Rango.crearIntervaloAbiertoAIzquierda(5, 8);
		
		assertTrue(rangoInterseccion.equals(rangoEsperado));
	}
	
	@Test
	void obtenerRangoInterseccionConRangosQueNoIntersecan() {
		Rango rango1 = Rango.crearIntervaloAbierto(55, 70);
		Rango rango2 = Rango.crearIntervaloAbiertoAIzquierda(-12, 8);
		Rango rangoInterseccion = rango1.rangoInterseccion(rango2);
		Rango rangoEsperado = Rango.crearIntervaloAbierto(0, 0);
		
		assertTrue(rangoInterseccion.equals(rangoEsperado));
	}
	
	@Test
	void sumaDeRangos() {
		Rango rango1 = Rango.crearIntervaloCerrado(-10, 33);
		Rango rango2 = Rango.crearIntervaloAbiertoADerecha(8, 60);
		Rango rangoEsperado = Rango.crearIntervaloAbiertoADerecha(-10, 60);
		
		rangoEsperado.equals(rango1.sumarRangos(rango2));
	}
	
	@Test
	void abarcaOtrosRangos() {
		Rango r1 = Rango.crearIntervaloAbierto(5, 8);
		Rango r2 = Rango.crearIntervaloAbiertoAIzquierda(-12, 8);
		Rango r3 = Rango.crearIntervaloCerrado(-9, 20);
		Rango r4 = Rango.crearIntervaloAbiertoAIzquierda(1, 15);
		Rango r5 = Rango.crearIntervaloAbiertoADerecha(-4, 12);
		
		Rango rangos[] = {r1, r2, r3, r4, r5};
		Rango rangoEsperado = Rango.crearIntervaloCerrado(-12, 20);
		
		assertTrue(rangoEsperado.equals(Rango.rangoQueAbarcaOtrosRangos(rangos)));
	}
}
