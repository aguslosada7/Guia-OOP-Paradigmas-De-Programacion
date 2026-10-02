package excepciones.ej02;

public class RaizCuadrada {
	public static double raizCuadrada(double numero) throws Exception {
		if(numero < 0)
			throw new NumeroNegativoException("Raíz cuadrada de un número negativo.");
		
		return Math.sqrt(numero);
	}
	
	public static void main(String[] args) throws Exception {
		try {
			double numero = -3;
			System.out.println("Raíz cuadrada de " + numero + ": " + raizCuadrada(numero));
		}
		catch(NumeroNegativoException e){
			e.printStackTrace();
		}
	}

}
