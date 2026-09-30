package colecciones.ej04;

import java.util.Set;
import java.util.TreeSet;

public class Registro {
	private Set<Libro> registro;
	
	public Registro() {
		registro = new TreeSet<Libro>();
	}
	
	public void agregarLibro(Libro libro) {
		registro.add(libro);
	}
	
	public void mostrarRegistro() {
		for(Libro libro: registro) {
			System.out.println("Nombre: " + libro.getNombre() + ", Autor: " + libro.getAutor());
		}
	}
}
