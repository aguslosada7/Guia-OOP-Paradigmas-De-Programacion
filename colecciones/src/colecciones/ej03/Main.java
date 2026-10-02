package colecciones.ej03;

import java.util.Set;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		Set<String> listaDePalabras;
		
		try {
			// Se lee el texto del archivo y se guarda en un String
			String texto = Files.readString(Path.of("src/colecciones/ej03/a-new-hope.txt"));
			
			// 1. Se separan las palabras del texto (los separadores en este caso son ".", "," y " ")
			// 2. Las palabras se guardan en una lista
			// 3. Dicha lista se convierte en un HashSet
			listaDePalabras = new HashSet<String>(Arrays.asList(texto.split("[,. ]")));
			
			for(String palabra: listaDePalabras)
				System.out.println(palabra);
		}
		catch(IOException e){
			e.printStackTrace();
		}
	
	}

}
