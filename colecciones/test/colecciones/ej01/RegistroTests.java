package colecciones.ej01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.LinkedList;

class RegistroTests {

	@Test
	void agregar() {
		Paquete paquete = new Paquete(123, "Caseros", "Rafael Castillo", 33);
		Registro registro = new Registro();
		List<Paquete> registroEsperado = new LinkedList<Paquete>();
		
		registroEsperado.add(paquete);
		registro.agregarPaquete(paquete);
		assertTrue(registroEsperado.containsAll(registro.getRegistro()));
	}
	
	@Test
	void buscarPorNumeroDeSeguimiento() {
		Paquete paquete = new Paquete(123, "Caseros", "Rafael Castillo", 33);
		Registro registro = new Registro();
		
		registro.agregarPaquete(paquete);
		assertTrue(registro.buscarPaquete(paquete));
	}

}
