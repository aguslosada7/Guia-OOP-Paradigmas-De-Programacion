package herencia.ej02;

import java.util.ArrayList;
import java.util.List;

public class Lustrador {
	List<Lustrable> lustrador = new ArrayList<Lustrable>();
	
	public void agregarInstrumento(Lustrable instrumento) {
			lustrador.add(instrumento);
	}
	
	public void lustrarInstrumentos() {
		for (Lustrable instrumento : lustrador) {
			instrumento.lustrar();
		}
	}
}
