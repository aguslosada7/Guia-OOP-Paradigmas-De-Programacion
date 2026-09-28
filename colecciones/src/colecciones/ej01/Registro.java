package colecciones.ej01;

import java.util.List;
import java.util.LinkedList;

public class Registro {
	List<Paquete> registro;
	
	public Registro() {
		registro = new LinkedList<Paquete>();
	}
	
	public void agregarPaquete(Paquete paquete) {
		registro.add(paquete);
	}
	
	public boolean buscarPaquete(Paquete paquete) {
		return registro.contains(paquete);
	}

	public List<Paquete> getRegistro() {
		return registro;
	}
	
	public void mostrarPaquetesQueSuperanUnPeso(double peso) {
		for(Paquete paquete: registro) {
			if(paquete.getPeso() > peso)
				System.out.println(paquete.toString());
		}
	}
}
