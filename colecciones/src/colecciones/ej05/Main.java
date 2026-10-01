package colecciones.ej05;

public class Main {

	public static void main(String[] args) {
		RegistroDeVentas registro = new RegistroDeVentas();
		registro.agregarVenta(1, 10);
		registro.agregarVenta(3, 40);
		registro.agregarVenta(1, 23);
		registro.agregarVenta(2, 30);
		
		System.out.println(registro.getVentasDeUnMes(1)); // 33.0
		System.out.println(registro.getVentasDeUnMes(2)); // 30.0
		System.out.println(registro.getVentasDeUnMes(3)); // 40.0
		System.out.println(registro.getVentasDeUnMes(4)); // 0.0
	}

}
