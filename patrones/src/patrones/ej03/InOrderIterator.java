package patrones.ej03;

import java.util.Iterator;
import java.util.Stack;

public class InOrderIterator<T> implements Iterator<T> {
	private Stack<Nodo> nodos;
	
	public InOrderIterator(Nodo raiz) {
		nodos = new Stack<>();
		moverseALaIzquierda(raiz);
	}
	
	private void moverseALaIzquierda(Nodo nodoActual) {
		while(nodoActual != null) {
			nodos.push(nodoActual); // push es para apilar
			nodoActual = nodoActual.nodoIzquierdo;
		}
	}

	@Override
	public boolean hasNext() {
		return !nodos.isEmpty();
	}

	@SuppressWarnings("unchecked")
	@Override
	public T next() {
		Nodo nodoActual = nodos.pop(); // pop es para desapilar
		
		if(nodoActual.nodoDerecho != null)
			moverseALaIzquierda(nodoActual.nodoDerecho);
		
		return (T) nodoActual;
	}

}
