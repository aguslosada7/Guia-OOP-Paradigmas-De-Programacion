package colecciones.ej05;

import java.util.Map;
import java.util.HashMap;

public class RegistroDeVentas {
	private Map<Integer, Double> registro;
	
	public RegistroDeVentas() {
		registro = new HashMap<>();
	}
	
	public void agregarVenta(int mes, double monto) {
		if(mes >= 1 && mes <= 12 && monto > 0) 
			registro.put(mes, registro.getOrDefault(mes, 0.0) + monto);
	}
	
	public double getVentasDeUnMes(int mes) {
		return registro.getOrDefault(mes, 0.0);
	}
}
