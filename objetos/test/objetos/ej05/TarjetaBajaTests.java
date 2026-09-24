package objetos.ej05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TarjetaBajaTests {

	@Test
	void creacionTarjetaBaja() {
		TarjetaBaja tarjeta = new TarjetaBaja(100);
		
		assertNotNull(tarjeta);
		assertEquals(100, tarjeta.obtenerSaldo());
		assertEquals(0, tarjeta.contarViajesEnColectivo());
		assertEquals(0, tarjeta.contarViajesEnSubte());
		assertEquals(0, tarjeta.contarViajes());
	}

	@Test
	void cargarSaldo() {
		TarjetaBaja tarjeta = new TarjetaBaja(100);
		
		tarjeta.cargar(33.3);
		assertEquals(133.3, tarjeta.obtenerSaldo());
	}
	
	@Test
	void viajeEnColectivo() {
		TarjetaBaja tarjeta = new TarjetaBaja(100);
		
		tarjeta.pagarViajeEnColectivo();
		assertEquals(60.41, tarjeta.obtenerSaldo());
		assertEquals(1, tarjeta.contarViajesEnColectivo());
	}
	
	@Test
	void viajeEnSubte() {
		TarjetaBaja tarjeta = new TarjetaBaja(100);
		
		tarjeta.pagarViajeEnSubte();
		assertEquals(65.50, tarjeta.obtenerSaldo());
		assertEquals(1, tarjeta.contarViajesEnSubte());
	}
	
	@Test
	void contarViajesEnTotal() {
		TarjetaBaja tarjeta = new TarjetaBaja(300);
		
		tarjeta.pagarViajeEnColectivo();
		tarjeta.pagarViajeEnColectivo();
		tarjeta.pagarViajeEnSubte();
		assertEquals(3, tarjeta.contarViajes());
	}
}