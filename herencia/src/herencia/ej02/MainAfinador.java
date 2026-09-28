package herencia.ej02;

public class MainAfinador {

	public static void main(String[] args) {
		Afinador afinador = new Afinador();
		InstrumentoDeCuerda i1 = new InstrumentoDeCuerda("Guitarra", "Les Paul");
		InstrumentoDeCuerda i2 = new InstrumentoDeCuerda("Piano", "Yamaha");
		InstrumentoDeCuerda i3 = new InstrumentoDeCuerda("Bajo", "Ibanez");
		InstrumentoDeCuerda i4 = new InstrumentoDeCuerda("Guitarra", "Gibson");
		InstrumentoDeCuerda i5 = new InstrumentoDeCuerda("Guitarra", "Telecaster");
		InstrumentoDeViento i6 = new InstrumentoDeViento("Flauta", "Yamaha", TipoDeInstrumentoDeViento.MADERA);
		InstrumentoDeCuerda i7 = new InstrumentoDeCuerda("Piano", "Steinway");
		InstrumentoDeViento i8 = new InstrumentoDeViento("Clarinete", "Calamardo", TipoDeInstrumentoDeViento.METAL);
		InstrumentoDeCuerda i9 = new InstrumentoDeCuerda("Violín", "Hola soy un violín");
		
		afinador.agregarInstrumento(i1);
		afinador.agregarInstrumento(i2);
		afinador.agregarInstrumento(i3);
		afinador.agregarInstrumento(i4);
		afinador.agregarInstrumento(i5);
		afinador.agregarInstrumento(i6);
		afinador.agregarInstrumento(i7);
		afinador.agregarInstrumento(i8);
		afinador.agregarInstrumento(i9);
		
		afinador.afinarInstrumentos();
	}

}
