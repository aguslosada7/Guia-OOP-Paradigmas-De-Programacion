package objetos.ej02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PuntoTests {

	@Test
	void creacionPunto() {
		Punto punto = new Punto(3, 4);
		
		assertNotNull(punto);
		assertEquals(3, punto.obtenerX());
		assertEquals(4, punto.obtenerY());
	}

	@Test
	void modificacionX() {
		Punto punto = new Punto(3, 3);
		
		punto.cambiarX(5);
		assertEquals(5, punto.obtenerX());
	}
	
	@Test
	void modificacionY() {
		Punto punto = new Punto(3, 3);
		
		punto.cambiarY(6);
		assertEquals(6, punto.obtenerY());
	}
	
	@Test
	void puntoSobreEjeX() {
		Punto punto = new Punto(3, 0);
		
		assertTrue(punto.estaSobreEjeX());
	}
	
	@Test
	void puntoSobreEjeY() {
		Punto punto = new Punto(0, 3);
		
		assertTrue(punto.estaSobreEjeY());
	}
	
	@Test
	void puntoEnElOrigen() {
		Punto punto = new Punto(0, 0);
		
		assertTrue(punto.esElOrigen());
	}
	
	@Test
	void calcularDistanciaSimpleAlOrigen() {
		Punto punto = new Punto(3, 4);
		
		assertEquals(5, punto.distanciaAlOrigen());
	}
	
	@Test
	void calcularDistanciaComplejaAlOrigen() {
		Punto punto = new Punto(3, 4);
		
		assertEquals(Math.hypot(punto.obtenerX(), punto.obtenerY()), punto.distanciaAlOrigen());
	}
	
	@Test
	void calcularDistanciaSimpleEntreDosPuntos() {
		Punto punto1 = new Punto(3, 3);
		Punto punto2 = new Punto(6, 3);
		
		assertEquals(Math.hypot(punto1.obtenerX() - punto2.obtenerX(), punto1.obtenerY() - punto2.obtenerY()), punto1.distanciaAotroPunto(punto2));
	}
	
	@Test
	void calcularDistanciaComplejaEntreDosPuntos() {
		Punto punto1 = new Punto(3, 3);
		Punto punto2 = new Punto(1, -1);
		
		assertEquals(Math.hypot(punto1.obtenerX() - punto2.obtenerX(), punto1.obtenerY() - punto2.obtenerY()), punto1.distanciaAotroPunto(punto2));
	}
}