package patrones.ej03;

public class Main {

	public static void main(String[] args) {
		ArbolBinario<Nodo> arbol = new ArbolBinario<>();
		
		arbol.insertarNodo(8);
		arbol.insertarNodo(9);
		arbol.insertarNodo(3);
		arbol.insertarNodo(2);
		arbol.insertarNodo(4);
		arbol.insertarNodo(5);
		
		for(Nodo elemento: arbol) {
			System.out.println(elemento.clave);
		}
	}

}
