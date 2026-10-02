package diagnostico;

public class Ejercicio04 {

	public static int[] resolver(int[][] m) {
		int contador;
		int contadorModa = 0;
		int[] vectorDeModas = new int[m.length];
		
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				contador = contarOcurrenciasEnVector(m[i], m[i][j]);
				
				if(j == 0 || contador > contadorModa || (contador == contadorModa && m[i][j] > vectorDeModas[i])){
	                vectorDeModas[i] = m[i][j];
	                contadorModa = contador;
	            }
			}
		}

		return vectorDeModas;
	}
	
	private static int contarOcurrenciasEnVector(int[] vector, int clave) {
		int contador = 0;
		int i = 0;
		
		while(i < vector.length) {
			if(vector[i] == clave)
	            contador++;
	        
	        i++;
		}
		
		return contador;
	}
}