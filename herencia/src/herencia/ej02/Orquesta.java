package herencia.ej02;

import java.util.ArrayList;
import java.util.List;

public class Orquesta {
	private List<Instrumento> orquesta = new ArrayList<Instrumento>();

	public void agregarInstrumento(Instrumento instrumento) {
		orquesta.add(instrumento);
	}

	public void tocarTodosLosInstrumentos() {
		for (Instrumento instrumento : orquesta)
			instrumento.tocar();
	}

	public void tocarInstrumentosDeCuerda() {
		for (Instrumento instrumento : orquesta) {
			if(instrumento instanceof InstrumentoDeCuerda)
				instrumento.tocar();
		}
	}

	public void tocarInstrumentosDePercusion() {
		for (Instrumento instrumento : orquesta) {
			if(instrumento instanceof InstrumentoDePercusion)
				instrumento.tocar();
		}
	}

	public void tocarInstrumentosDeViento() {
		for (Instrumento instrumento : orquesta) {
			if(instrumento instanceof InstrumentoDeViento)
				instrumento.tocar();
		}
	}
}
