package colecciones.ej02;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Registro {
List<Venta> registro;
	
	public Registro() {
		registro = new LinkedList<Venta>();
	}
	
	public void agregarVenta(Venta venta) {
		registro.add(venta);
	}
	
	public boolean buscarVenta(Venta venta) {
		return registro.contains(venta);
	}

	public List<Venta> getRegistro() {
		return registro;
	}
	
	public void mostrarVentasRealizadasEnUnaFecha(LocalDate fecha) {
		for(Venta venta: registro) {
			if(venta.getFecha().equals(fecha))
				System.out.println(venta.toString());
		}
	}
}
