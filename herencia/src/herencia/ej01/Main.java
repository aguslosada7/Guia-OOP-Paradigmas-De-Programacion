package herencia.ej01;

public class Main {

	public static void main(String[] args) {
		Cuenta cuentaOrigen = new Cuenta();
		cuentaOrigen.depositar(10000);
		System.out.println(cuentaOrigen.consultarSaldo()); // 10000
		Cuenta cuentaDestino = new Cuenta();
		System.out.println(cuentaDestino.consultarSaldo()); // 0
		cuentaOrigen.transferir(550, cuentaDestino);
		System.out.println(cuentaOrigen.consultarSaldo()); // 9450
		System.out.println(cuentaDestino.consultarSaldo()); // 550
	}

}
