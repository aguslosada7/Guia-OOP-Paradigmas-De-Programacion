package introduccion.ej01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/*
 * Un test por regla, escritos junto con la clase. Algunos tests interesantes:
 * - Bajar desde la planta baja (qué contesta y en qué piso queda)
 * - Subir desde el piso más alto
 * - Dos ascensores con distinta cantidad de movimientos
 * - Dos ascensores en el mismo piso
 * - Un ascensor comparado consigo mismo
 * */

class AscensorTests {

	@Test
	void bajarDesdePlantaBaja() {
		Ascensor ascensor = new Ascensor(3);
		assertFalse(ascensor.bajarPiso()); // Como se quiere ir mas abajo estando en PB, debe dar false
		assertEquals(0, ascensor.getPiso()); // El ascensor no se mueve
	}

	@Test
	void subirDesdePisoMasAlto() {
		Ascensor ascensor = new Ascensor(3);

		// Se usa un for para llegar hasta el ultimo piso
		for (int i = 0; i < 3; i++) {
			ascensor.subirPiso();
		}

		assertFalse(ascensor.subirPiso()); // Como se quiere ir mas arriba estando en el ultimo piso, debe dar false
		assertEquals(ascensor.getUltimoPiso(), ascensor.getPiso()); // El ascensor no se mueve
	}

	@Test
	void ascensoresConDistintaCantidadDeMovimientos() {
		// Arrange
		Ascensor ascensor1 = new Ascensor(5);
		Ascensor ascensor2 = new Ascensor(5);

		// Act
		ascensor1.subirPiso();
		// El ascensor 1 quedo en el piso 1 y el ascensor 2 quedo en el piso 0

		// Assert
		assertNotEquals(0, ascensor1.compararPisosConOtroAscensor(ascensor2));
	}

	@Test
	void ascensoresEnElMismoPiso() {
		// Arrange
		Ascensor ascensor1 = new Ascensor(5);
		Ascensor ascensor2 = new Ascensor(5);

		// Act
		ascensor1.subirPiso();
		ascensor2.subirPiso();
		
		// Assert
		assertEquals(0, ascensor1.compararPisosConOtroAscensor(ascensor2));
	}
	
	@Test
	void ascensorComparadoConsigoMismo() {
		Ascensor ascensor1 = new Ascensor(5);
		
		ascensor1.subirPiso();
		
		assertEquals(0, ascensor1.compararPisosConOtroAscensor(ascensor1));
	}
}
