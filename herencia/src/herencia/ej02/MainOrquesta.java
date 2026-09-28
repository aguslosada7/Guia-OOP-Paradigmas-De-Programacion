package herencia.ej02;

public class MainOrquesta {

	public static void main(String[] args) {
		Orquesta orquesta = new Orquesta();
		Instrumento i1 = new InstrumentoDeCuerda("Guitarra", "Les Paul");
		Instrumento i2 = new InstrumentoDeCuerda("Piano", "Yamaha");
		Instrumento i3 = new InstrumentoDeCuerda("Bajo", "Ibanez");
		Instrumento i4 = new InstrumentoDePercusion("Batería", "Yamaha");
		Instrumento i5 = new InstrumentoDeCuerda("Guitarra", "Gibson");
		Instrumento i6 = new InstrumentoDeCuerda("Guitarra", "Telecaster");
		Instrumento i7 = new InstrumentoDeViento("Flauta", "Yamaha", TipoDeInstrumentoDeViento.MADERA);
		Instrumento i8 = new InstrumentoDeCuerda("Piano", "Steinway");
		Instrumento i9 = new InstrumentoDeViento("Clarinete", "Calamardo", TipoDeInstrumentoDeViento.METAL);
		Instrumento i10 = new InstrumentoDeCuerda("Violín", "Hola soy un violín");
		
		orquesta.agregarInstrumento(i1);
		orquesta.agregarInstrumento(i2);
		orquesta.agregarInstrumento(i3);
		orquesta.agregarInstrumento(i4);
		orquesta.agregarInstrumento(i5);
		orquesta.agregarInstrumento(i6);
		orquesta.agregarInstrumento(i7);
		orquesta.agregarInstrumento(i8);
		orquesta.agregarInstrumento(i9);
		orquesta.agregarInstrumento(i10);
		
		orquesta.tocarTodosLosInstrumentos();
		System.out.println("");
		orquesta.tocarInstrumentosDeViento();
		System.out.println("");
		orquesta.tocarInstrumentosDePercusion();
		System.out.println("");
		orquesta.tocarInstrumentosDeCuerda();
	}

}
