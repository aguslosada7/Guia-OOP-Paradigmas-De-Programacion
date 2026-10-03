package patrones.ej03;

import java.util.Iterator;

class Nodo {
	int clave;
	Nodo nodoIzquierdo;
	Nodo nodoDerecho;
	
	public Nodo(int clave) {
		this.clave = clave;
	}
}

public class ArbolBinario<T> implements Iterable<T> {
	Nodo raiz;
	
	public void insertarNodo(int clave) {
		raiz = insertarRecursivo(raiz, clave);
	}
	
	private Nodo insertarRecursivo(Nodo raiz, int clave) {
		if(raiz == null) {
			raiz = new Nodo(clave);
			return raiz;
		}
		
		if(clave < raiz.clave)
			raiz.nodoIzquierdo = insertarRecursivo(raiz.nodoIzquierdo, clave);
		
		else if(clave > raiz.clave)
			raiz.nodoDerecho = insertarRecursivo(raiz.nodoDerecho, clave);
		
		return raiz;
	}
	
	@Override
	public Iterator<T> iterator() {
		return new InOrderIterator<T>(raiz);
	}
}