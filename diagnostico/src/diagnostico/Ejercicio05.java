package diagnostico;

public class Ejercicio05 {

	public static int[][] resolver(int[][] m) {
		int[][] matrizResultante = new int[2*m.length - 1][];
		int i, j, k, l = 0;
		
		// Diagonal principal y diagonales inferiores izquierdas
	    i = m.length - 1;
	    j = 0;
	    while(i >= 0){
	        k = i;
	        matrizResultante[l] = new int[l + 1];
	        while(k < m.length) {
	        	matrizResultante[l][j] = m[k][j];
	            k++;
	            j++;
	        }
	        
	        i--;
	        j = 0;
	        l++;
	    }
	    
	    // Diagonales superiores derechas
	    i = 0;
	    j = 1;
	    while(j < m.length){
	        k = j;
	        matrizResultante[l] = new int[l - j - k + 1]; // ???
	        while(k < m.length){
	        	matrizResultante[l][i] = m[i][k];
	            i++;
	            k++;
	        }
	        
	        i = 0;
	        j++;
	        l++;
	    }
		
		return matrizResultante;
	}
}