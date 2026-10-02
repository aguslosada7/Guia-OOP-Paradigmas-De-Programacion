package excepciones.ej03;

public class DividirEnteros {
	public static double dividirEnteros(int n1, int n2) {
		if(n2 == 0)
			throw new DivisionPorCero("División por 0.");
		
		return (double) n1/n2;
	}
	
	public static void main(String[] args) {
		try {
			int numero1 = 30;
			int numero2 = 0;
			
			System.out.println("Resultado de la división " + numero1 + "/" + numero2 + ": " + dividirEnteros(numero1, numero2));
		}
		catch(ArithmeticException e){
			e.printStackTrace();
		}
	}

}
