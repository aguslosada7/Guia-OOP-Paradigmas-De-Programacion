package excepciones.ej06;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner1 = null;
		Scanner scanner2 = null;

		try {
			scanner1 = new Scanner(new File("src/excepciones/ej06/holaSoyUnArchivo.txt"));
			String nombreDelOtroArchivo = scanner1.nextLine();

			try {
				scanner2 = new Scanner(new File("src/excepciones/ej06/" + nombreDelOtroArchivo + ".txt"));

				while (scanner2.hasNextLine()) {
					System.out.println(scanner2.nextLine());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (scanner1 != null)
				scanner1.close();

			if (scanner2 != null)
				scanner2.close();
		}
	}

}
