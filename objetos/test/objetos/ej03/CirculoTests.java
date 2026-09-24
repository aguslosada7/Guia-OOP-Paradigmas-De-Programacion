package objetos.ej03;

import objetos.ej02.Punto;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CirculoTests {

	@Test
	void creacionCirculo() {
		Circulo circulo = new Circulo(0, -5, 3);
		Punto centro = new Punto(0, -5);
		
		assertNotNull(circulo);
		assertNotNull(circulo.getCentro());
		assertTrue(centro.equals(circulo.getCentro()));
		assertEquals(3, circulo.getRadio());
		assertEquals(circulo.getRadio()*2, circulo.getDiametro());
		assertEquals(2*Math.PI*circulo.getRadio(), circulo.getPerimetro());
		assertEquals(Math.PI*Math.pow(circulo.getRadio(), 2), circulo.getArea());
	}

	@Test
	void modificarRadio() {
		Circulo circulo = new Circulo(3, 3, 3);
		double nuevoRadio = 6;
		
		circulo.setRadio(nuevoRadio);
		assertEquals(nuevoRadio, circulo.getRadio());
		assertEquals(nuevoRadio*2, circulo.getDiametro());
		assertEquals(2*Math.PI*nuevoRadio, circulo.getPerimetro());
		assertEquals(Math.PI*Math.pow(nuevoRadio, 2), circulo.getArea());
	}
	
	@Test
	void modificarDiametro() {
		Circulo circulo = new Circulo(3, 3, 3);
		double nuevoDiametro = 9;
		
		circulo.setDiametro(nuevoDiametro);
		assertEquals(nuevoDiametro, circulo.getDiametro());
		assertEquals(nuevoDiametro/2, circulo.getRadio());
		assertEquals(Math.PI*nuevoDiametro, circulo.getPerimetro());
		assertEquals(Math.PI*Math.pow(nuevoDiametro/2, 2), circulo.getArea());
	}
	
	@Test
	void modificarPerimetro() {
		Circulo circulo = new Circulo(3, 3, 3);
		double nuevoPerimetro = 10;
		
		circulo.setPerimetro(nuevoPerimetro);
		assertEquals(nuevoPerimetro, circulo.getPerimetro());
		assertEquals(nuevoPerimetro/(2*Math.PI), circulo.getRadio());
		assertEquals(nuevoPerimetro/Math.PI, circulo.getDiametro());
		assertEquals(Math.PI*Math.pow(nuevoPerimetro/(2*Math.PI), 2), circulo.getArea());
	}
	
	@Test
	void modificarArea() {
		Circulo circulo = new Circulo(3, 3, 3);
		double nuevaArea = 33;
		
		circulo.setArea(nuevaArea);
		assertEquals(nuevaArea, circulo.getArea());
		assertEquals(Math.sqrt(nuevaArea/Math.PI), circulo.getRadio());
		assertEquals(Math.sqrt(nuevaArea/Math.PI)*2, circulo.getDiametro());
		assertEquals(2*Math.PI*Math.sqrt(nuevaArea/Math.PI), circulo.getPerimetro());
	}
	
	@Test
	void intersecaDosVecesConOtroCirculo() {
		Circulo circulo1 = new Circulo(3, 3, 3);
		Circulo circulo2 = new Circulo(-1, 5, 2);
		
		assertTrue(circulo1.intersecaConOtroCirculo(circulo2));
	}
	
	@Test
	void intersecaUnaVezConCirculoQueEstaAfuera() {
		Circulo circulo1 = new Circulo(3, 3, 3);
		Circulo circulo2 = new Circulo(3, -4, 4);
		
		assertTrue(circulo1.intersecaConOtroCirculo(circulo2));
	}
	
	@Test
	void intersecaUnaVezConCirculoQueEstaDentro() {
		Circulo circulo1 = new Circulo(3, 3, 3);
		Circulo circulo2 = new Circulo(3, 1, 1);
		
		assertTrue(circulo1.intersecaConOtroCirculo(circulo2));
	}
	
	@Test
	void noIntersecaConCirculoQueEstaAfuera() {
		Circulo circulo1 = new Circulo(3, 3, 3);
		Circulo circulo2 = new Circulo(-5, -7, 3);
		
		assertFalse(circulo1.intersecaConOtroCirculo(circulo2));
	}
	
	@Test
	void noIntersecaConCiculoQueEstaDentro() {
		Circulo circulo1 = new Circulo(3, 3, 3);
		Circulo circulo2 = new Circulo(4, 2, 1);
		
		assertFalse(circulo1.intersecaConOtroCirculo(circulo2));
	}
}