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
			String texto = Files.readString(Path.of("src/colecciones/ej03/a-new-hope.txt"));
			listaDePalabras = new HashSet<String>(Arrays.asList(texto.split("[,. ]")));
			for(String palabra: listaDePalabras)
				System.out.println(palabra);
		}
		catch(IOException e){
			e.printStackTrace();
		}
	
	}

}
