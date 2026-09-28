package herencia.ej02;

import java.util.ArrayList;
import java.util.List;

public class Afinador {
	private List<Afinable> afinador = new ArrayList<Afinable>();
	
	public void agregarInstrumento(Afinable instrumento) {
			afinador.add(instrumento);
	}
	
	public void afinarInstrumentos() {
		for (Afinable instrumento : afinador) {
			instrumento.afinarAutomaticamente();
			instrumento.afinarManualmente();
		}
	}
}
