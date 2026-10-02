package excepciones.ej07;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner1 = new Scanner(new File("src/excepciones/ej06/holaSoyUnArchivo.txt"))) {
			String nombreDelOtroArchivo = scanner1.nextLine();

			try (Scanner scanner2 = new Scanner(new File("src/excepciones/ej06/" + nombreDelOtroArchivo + ".txt"))) {
				while (scanner2.hasNextLine()) {
					System.out.println(scanner2.nextLine());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
