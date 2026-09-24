package introduccion.ej02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/*
 * Un test por regla, escritos junto con la clase. Algunos tests interesantes:
 * - Un golpe más grande que la vida restante
 * - Una curación que se pasa del máximo
 * - Curar a un personaje muerto
 * - Atacar estando muerto (qué contesta y qué le pasa a la vida del otro)
 * - Un ataque a sí mismo
 * */

class PersonajeTests {

	@Test
	void golpeMasGrandeQueVidaRestante() {
		Personaje personaje1 = new Personaje("Ryu", 110, 45);
		Personaje personaje2 = new Personaje("Ken", 100, 30);
		
		personaje1.atacar(personaje2); // vida = 55
		personaje1.atacar(personaje2); // vida = 10
		personaje1.atacar(personaje2); // debe quedar vida = 0
		
		assertEquals(0, personaje2.vidaActual);
	}

	@Test
	void curacionQueSuperaMaxima() {
		Personaje personaje = new Personaje("Ryu", 110, 45);
		
		personaje.curarse(10);
		
		assertEquals(personaje.vida, personaje.vidaActual);
	}
	
	@Test
	void curarPersonajeMuerto() {
		Personaje personaje1 = new Personaje("Ryu", 100, 30);
		Personaje personaje2 = new Personaje("Ken", 130, 50);
		
		personaje2.atacar(personaje1);
		personaje2.atacar(personaje1);
		
		assertFalse(personaje1.curarse(33));
	}
	
	@Test
	void atacarEstandoMuerto() {
		Personaje personaje1 = new Personaje("Ryu", 100, 30);
		Personaje personaje2 = new Personaje("Ken", 130, 50);
		
		personaje2.atacar(personaje1);
		personaje2.atacar(personaje1);
		
		assertFalse(personaje1.atacar(personaje2));
		assertEquals(personaje2.vida, personaje2.vidaActual);
	}
	
	@Test
	void atacarseASiMismo() {
		Personaje personaje = new Personaje("Ken", 100, 30);
		
		personaje.atacar(personaje);
		
		assertEquals(personaje.vida - personaje.danio, personaje.vidaActual);
	}
}
