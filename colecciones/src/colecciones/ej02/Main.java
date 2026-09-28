package colecciones.ej02;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

	public static void main(String[] args) {
		Venta v1 = new Venta(123, LocalDate.now(), LocalTime.now(), "Clancy", 500);
		Venta v2 = new Venta(456, LocalDate.of(2026, 6, 5), LocalTime.of(15, 33), "Lautaro", 333);
		Venta v3 = new Venta(789, LocalDate.now(), LocalTime.of(11, 11), "Rohan", 750);
		Registro registro = new Registro();
		
		registro.agregarVenta(v1);
		registro.agregarVenta(v2);
		registro.agregarVenta(v3);
		
		registro.mostrarVentasRealizadasEnUnaFecha(LocalDate.now());
	}

}
