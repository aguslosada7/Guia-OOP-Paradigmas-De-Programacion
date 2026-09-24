package introduccion.ej01;

/*
 * Modelar el ascensor de un edificio.
 * El ascensor conoce hasta qué piso llega, y arranca en la planta baja (piso 0).
 * Se le puede pedir que suba un piso o que baje un piso, y se le puede preguntar en qué piso está.
 * Arriba del piso más alto no hay nada, y abajo de la planta baja tampoco, cuando el pedido es imposible
 * el ascensor no se mueve, y quien lo pidió tiene que poder enterarse.
 * Dos ascensores son independientes: mover uno no mueve al otro. Un ascensor puede comparar su posición
 * con la de otro para decir cuál de los dos está más arriba.
 * */

public class Ascensor {
	private int pisoActual; //inicia en la planta baja
	private int fin;
	
	Ascensor(int fin){
		this.fin = fin;
	}
	
	boolean subirPiso() {
		pisoActual++;
		
		if(pisoActual >= fin) {
			pisoActual = fin;
			return false;
		}
		else
			return true;
	}
	
	boolean bajarPiso() {
		pisoActual--;
		
		if(pisoActual <= 0) {
			pisoActual = 0;
			return false;
		}
		else
			return true;
	}
	
	int getPiso() {
		return pisoActual;
	}
	
	int getUltimoPiso() {
		return fin;
	}
	
	int compararPisosConOtroAscensor(Ascensor ascensor2) {
		return (this.pisoActual - ascensor2.pisoActual);
	}
}
