package patrones.ej01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GrupoTests {
	private static final double TOLERANCIA = 1e-3; // 1*10^-3
	private Grupo grupo;
	
	@BeforeEach
	void setUp() {
		grupo = new Grupo();
		Rectangulo rectangulo = new Rectangulo(4, 6);
		Circulo circulo = new Circulo(3);
		Triangulo triangulo = new Triangulo(5, 9);
		Cuadrado cuadrado = new Cuadrado(7);
		Circulo circulo2 = new Circulo(2);
		
		grupo.agregarForma(rectangulo);
		grupo.agregarForma(triangulo);
		grupo.agregarForma(circulo);
		grupo.agregarForma(cuadrado);
		grupo.agregarForma(circulo2);
	}

	@Test
	void area() {
		assertEquals(136.340, grupo.getArea(), TOLERANCIA);
	}
	
	@Test
	void cantidadDePomosDeTempera() {
		assertEquals(2, grupo.getCantidadDePomosDeTempera());
	}
}
