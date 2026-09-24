package objetos.ej04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuboTests {

	@Test
	void creacionCubo() {
		Cubo cubo = new Cubo(3);
		
		assertNotNull(cubo);
		assertEquals(3, cubo.obtenerLado());
		assertEquals(9, cubo.obtenerAreaCara());
		assertEquals(27, cubo.obtenerVolumen());
	}

	@Test
	void modificarLado() {
		Cubo cubo = new Cubo(3);
		double nuevoLado = 5;
		
		cubo.cambiarLado(nuevoLado);
		assertEquals(nuevoLado, cubo.obtenerLado());
		assertEquals(Math.pow(nuevoLado, 2), cubo.obtenerAreaCara());
		assertEquals(Math.pow(nuevoLado, 3), cubo.obtenerVolumen());
	}
	
	@Test
	void modificarArea() {
		Cubo cubo = new Cubo(3);
		double nuevaArea = 33;
		
		cubo.cambiarAreaCara(nuevaArea);
		assertEquals(nuevaArea, cubo.obtenerAreaCara());
		assertEquals(Math.sqrt(nuevaArea), cubo.obtenerLado());
		assertEquals(Math.pow(nuevaArea, 1.5), cubo.obtenerVolumen());
	}
	
	@Test
	void modificarVolumen() {
		Cubo cubo = new Cubo(3);
		double nuevoVolumen = 100;
		
		cubo.cambiarVolumen(nuevoVolumen);
		assertEquals(nuevoVolumen, cubo.obtenerVolumen());
		assertEquals(Math.cbrt(nuevoVolumen), cubo.obtenerLado());
		assertEquals(Math.pow(Math.cbrt(nuevoVolumen), 2), cubo.obtenerAreaCara());
	}
}