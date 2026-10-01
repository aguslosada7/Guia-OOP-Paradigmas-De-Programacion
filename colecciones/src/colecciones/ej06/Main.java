package colecciones.ej06;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		RegistroDeEstudiantes registro = new RegistroDeEstudiantes();
		registro.agregarNota("Lautaro Barreto", 9.33);
		registro.agregarNota("Alex Turner", 6);
		registro.agregarNota("Thomas Bangalter", 9);
		registro.agregarNota("Lautaro Barreto", 8);
		registro.agregarNota("Gerard Way", 7.5);
		registro.agregarNota("Kurt Cobain", 9);
		registro.agregarNota("Julian Casablancas", 5);
		registro.agregarNota("Thomas Bangalter", 10);
		registro.agregarNota("Thomas Bangalter", 8);
		registro.agregarNota("Thom Yorke", 7);
		
		System.out.println(registro.getPromedio("Lautaro Barreto")); // 8.665
		System.out.println(registro.getPromedio("Thomas Bangalter")); // 9
		System.out.println(registro.getPromedio("Hola soy un alumno")); // 0
		System.out.println("");
		
		List<String> promedio9 = registro.obtenerListadoDeEstudiantesPorPromedio(9); //Thomas Banglter, Kurt Cobain
		for(String nombre: promedio9)
			System.out.println(nombre);
	}

}
