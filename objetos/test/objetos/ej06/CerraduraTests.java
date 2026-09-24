package objetos.ej06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CerraduraTests {

	@Test
	void creacionCerradura() {
		Cerradura cerradura = new Cerradura(1234, 3);
		
		assertNotNull(cerradura);
		assertEquals(1234, cerradura.getClaveDeApertura());
		assertEquals(3, cerradura.getCantidadDeFallosConsecutivosQueLaBloquean());
	}
	
	@Test
	void abrirCerradura() {
		Cerradura cerradura = new Cerradura(1234, 3);
		
		assertTrue(cerradura.abrir(1234));
		assertTrue(cerradura.estaAbierta());
	}
	
	@Test
	void cerrarCerradura() {
		Cerradura cerradura = new Cerradura(1234, 3);
		
		cerradura.cerrar();
		assertTrue(cerradura.estaCerrada());
	}
	
	@Test
	void cerraduraBloqueada() {
		Cerradura cerradura = new Cerradura(1234, 3);
		
		cerradura.abrir(3333);
		cerradura.abrir(3333);
		cerradura.abrir(3333);
		assertTrue(cerradura.fueBloqueada());
	}
	
	@Test
	void contarAperturas() {
		Cerradura cerradura = new Cerradura(1234, 3);
		
		cerradura.abrir(3333);
		cerradura.abrir(3333);
		cerradura.abrir(1234);
		
		assertEquals(2, cerradura.contarAperturasFallidas());
		assertEquals(1, cerradura.contarAperturasExitosas());
	}
	
	@Test
	void abrirCerraduraBloqueada() {
		Cerradura cerradura = new Cerradura(1234, 3);
		
		cerradura.abrir(3333);
		cerradura.abrir(3333);
		cerradura.abrir(3333);
		assertFalse(cerradura.abrir(1234));
	}
}