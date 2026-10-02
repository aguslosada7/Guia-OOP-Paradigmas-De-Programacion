package diagnostico;

public class Ejercicio01 {

	public static boolean resolver(int[][] m) {
		int contador;
		
		if(m[0][0] != m[1][1])
			return false;
		
		contador = m[0][0] + m[1][1];
		for (int i = 2; i < m.length; i++) {
			if(m[i][i] != contador)
	            return false;
	            
	        contador += m[i][i];
		}

		return true;
	}
}