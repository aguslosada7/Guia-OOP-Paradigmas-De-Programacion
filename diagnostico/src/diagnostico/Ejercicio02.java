package diagnostico;

public class Ejercicio02 {

	public static boolean resolver(int[][] m) {
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				if(m[i][j] == 0)
					return true;
			}
		}
		
		return false;
	}
}