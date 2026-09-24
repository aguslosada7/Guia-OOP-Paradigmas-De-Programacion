package herencia.ej01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuentaTests {

	@Test
	void saldoInicial() {
		Cuenta cuenta = new Cuenta();

		assertEquals(0, cuenta.consultarSaldo());
	}

	@Test
	void depositarDinero() {
		Cuenta cuenta = new Cuenta();
		double montoADepositar = 33;

		cuenta.depositar(montoADepositar);
		assertEquals(montoADepositar, cuenta.consultarSaldo());
	}

	@Test
	void retirarDinero() {
		Cuenta cuenta = new Cuenta();
		double montoADepositar = 100;
		double montoARetirar = 75;

		cuenta.depositar(montoADepositar);
		cuenta.retirar(montoARetirar);
		assertEquals(montoADepositar - montoARetirar, cuenta.consultarSaldo());
	}

	@Test
	void depositarMontoNegativo() {
		Cuenta cuenta = new Cuenta();

		assertFalse(cuenta.depositar(-3));
	}

	@Test
	void extraerMontoMayorAlSaldo() {
		Cuenta cuenta = new Cuenta();

		assertFalse(cuenta.retirar(100));
	}

	@Test
	void transferenciaExitosa() {
		Cuenta cuenta1 = new Cuenta();
		Cuenta cuenta2 = new Cuenta();
		double montoATransferir = 25;
		double saldoInicialCuenta1 = 150;

		cuenta1.depositar(saldoInicialCuenta1);
		cuenta1.transferir(montoATransferir, cuenta2);
		assertEquals(montoATransferir, cuenta2.consultarSaldo());
		assertEquals(saldoInicialCuenta1 - montoATransferir, cuenta1.consultarSaldo());
	}

	@Test
	void transferenciaFallida() {
		Cuenta cuenta1 = new Cuenta();
		Cuenta cuenta2 = new Cuenta();
		double montoATransferir = -25;
		double saldoInicialCuenta1 = 150;

		cuenta1.depositar(saldoInicialCuenta1);
		assertFalse(cuenta1.transferir(montoATransferir, cuenta2));
		assertEquals(saldoInicialCuenta1, cuenta1.consultarSaldo());
	}

	@Test
	void reservarEnCuentaDeAhorros() {
		CuentaDeAhorros cuenta = new CuentaDeAhorros();

		cuenta.depositar(150);
		cuenta.reservar(50);
		assertEquals(100, cuenta.consultarSaldo());
	}

	@Test
	void reservarDeMasEnCuentaDeAhorros() {
		CuentaDeAhorros cuenta = new CuentaDeAhorros();

		cuenta.depositar(150);
		assertFalse(cuenta.reservar(250));
		assertEquals(150, cuenta.consultarSaldo());
	}

	@Test
	void reintegrarReservaEnCuentaDeAhorro() {
		CuentaDeAhorros cuenta = new CuentaDeAhorros();

		cuenta.depositar(150);
		cuenta.reservar(50);
		cuenta.reintegrarReserva();
		assertEquals(150, cuenta.consultarSaldo());
	}

	@Test
	void retirarMontoMenorAlSaldoEnCuentaCorriente() {
		CuentaCorriente cuenta = new CuentaCorriente(50);

		cuenta.depositar(150);
		cuenta.retirar(75);
		assertEquals(75, cuenta.consultarSaldo());
		assertEquals(50, cuenta.consultarMontoEnDescubierto());
	}

	@Test
	void giroEnDescubierto() {
		CuentaCorriente cuenta = new CuentaCorriente(50);

		cuenta.depositar(150);
		cuenta.retirar(175);
		assertEquals(0, cuenta.consultarSaldo());
		assertEquals(25, cuenta.consultarMontoEnDescubierto());
	}

	@Test
	void retirarMasDineroDelQueSeTieneEnCuentaCorriente() {
		CuentaCorriente cuenta = new CuentaCorriente(50);

		cuenta.depositar(150);
		assertFalse(cuenta.retirar(250));
		assertEquals(150, cuenta.consultarSaldo());
		assertEquals(50, cuenta.consultarMontoEnDescubierto());
	}
}
