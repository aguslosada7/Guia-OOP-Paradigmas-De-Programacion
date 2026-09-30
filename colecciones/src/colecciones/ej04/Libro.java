package colecciones.ej04;

import java.util.Objects;

public class Libro implements Comparable<Libro> {
	private String nombre;
	private String autor;
	private int numeroDeEjemplar;

	public Libro(String nombre, String autor, int numeroDeEjemplar) {
		this.nombre = nombre;
		this.autor = autor;
		this.numeroDeEjemplar = numeroDeEjemplar;
	}

	@Override
	public int compareTo(Libro o) {
		return nombre.compareTo(o.nombre);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(nombre, other.nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public String getAutor() {
		return autor;
	}
}
