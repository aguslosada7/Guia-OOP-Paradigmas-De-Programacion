package objetos.ej01;

public class Nota {
	
	private int nota;
	
    public Nota(int valorInicial) {
    	if(valorInicial>=1 && valorInicial<=10)
    		nota = valorInicial;
    }
    
    public int obtenerValor() {
    	return nota;
    }
    
    public boolean aprobado() {
    	if(nota >= 4)
    		return true;
    	
    	return false;
    }
    
    public boolean desaprobado() {
    	if(nota < 4)
    		return true;
    	
    	return false;
    }
    
    public void recuperar(int nuevoValor) {
    	if(nuevoValor >= 1 && nuevoValor <= 10 && nuevoValor > nota)
    		nota = nuevoValor;
    }
}
