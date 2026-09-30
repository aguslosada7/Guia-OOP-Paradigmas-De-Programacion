package colecciones.ej04;

public class Main {

	public static void main(String[] args) {
		Libro l1 = new Libro("Harry Potter and the Prisoner of Azkaban", "J.K. Rowling", 11);
		Libro l2 = new Libro("All Tomorrows", "C.M. Kösemen", 7);
		Libro l3 = new Libro("Farenheit 451", "Ray Bradbury", 14);
		Libro l4 = new Libro("The Shadow over Innsmouth", "H.P. Lovecraft", 6);
		Libro l5 = new Libro("The Metamorphosis", "Franz Kafka", 28);
		Libro l6 = new Libro("All Tomorrows", "C.M. Kösemen", 3); // Duplicado
		Libro l7 = new Libro("Software Engineering", "Roger S. Pressman", 5);
		Libro l8 = new Libro("Software Engineering", "Roger S. Pressman", 1); // Duplicado
		Libro l9 = new Libro("I, Robot", "Isaac Asimov", 36);
		Libro l10 = new Libro("Farenheit 451", "Ray Bradbury", 45); // Duplicado
		Libro l11 = new Libro("The Lord of the Rings", "J.R.R. Tolkien", 16);
		Libro l12 = new Libro("Harry Potter and the Order of the Phoenix", "J.K. Rowling", 3); // No compara por autor, se agrega
		Libro l13 = new Libro("Thrawn", "Timothy Zahn", 66);
		Registro registro = new Registro();
		
		registro.agregarLibro(l1);
		registro.agregarLibro(l2);
		registro.agregarLibro(l3);
		registro.agregarLibro(l4);
		registro.agregarLibro(l5);
		registro.agregarLibro(l6);
		registro.agregarLibro(l7);
		registro.agregarLibro(l8);
		registro.agregarLibro(l9);
		registro.agregarLibro(l10);
		registro.agregarLibro(l11);
		registro.agregarLibro(l12);
		registro.agregarLibro(l13);
		
		registro.mostrarRegistro();
	}

}
