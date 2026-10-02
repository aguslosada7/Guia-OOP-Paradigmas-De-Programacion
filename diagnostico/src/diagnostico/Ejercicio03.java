package diagnostico;

public class Ejercicio03 {

	public static int[][] resolver(int[][] m) {
		int[][] matrizResultante = new int[m.length][m[0].length];
		
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				matrizResultante[i][j] = m[i][j];
	            
	            if(j < m[i].length - 1)
	            	matrizResultante[i][j] += m[i][j+1];
	            
	            if(i < m.length - 1)
	            	matrizResultante[i][j] += m[i+1][j];
	            
	            if(j > 0)
	            	matrizResultante[i][j] += m[i][j-1];
	            
	            if(i > 0)
	            	matrizResultante[i][j] += m[i-1][j];
			}
		}
		
		return matrizResultante;
	}
}

/*
void matrizConValoresQueSonSumaDeAdyacentesOriginales(int mat[][N], int matRes[][N], int filas){
    int i, j;
    
    for(i=0; i<filas; i++){
        for(j=0; j<N; j++){
            matRes[i][j] = mat[i][j];
            
            if(j < N-1)
                matRes[i][j] += mat[i][j+1];
            
            if(i < filas-1)
                matRes[i][j] += mat[i+1][j];
            
            if(j > 0)
                matRes[i][j] += mat[i][j-1];
            
            if(i > 0)
                matRes[i][j] += mat[i-1][j];
        }
    }
}
*/