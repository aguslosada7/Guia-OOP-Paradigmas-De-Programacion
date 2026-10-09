package patrones.ej02;

/*
 * Considere que tiene una clase llamada "Tank" que representa a un tanque Terran en Starcraft 2. Implemente el patrón State para modelar los
 * dos posibles estados del tanque: el estado "Modo Tanque" y el estado "Modo Asedio". A continuación, se proporcionan varios métodos que puede
 * incluir en la implementación:
 * - Tank: la clase principal que representa un tanque Terran y contiene una referencia a un objeto de estado concreto.
 * - TankState: la interfaz que define los métodos comunes que deben implementar los estados concretos.
 * - TankModeTankState: una clase que implementa la interfaz TankState y representa el estado "Modo Tanque" del tanque. Debe proporcionar
 *   implementaciones para los métodos específicos de este estado, como moverse() y atacar().
 * - TankModeSiegeState: una clase que implementa la interfaz TankState y representa el estado "Modo Asedio" del tanque. Debe proporcionar
 *   implementaciones para los métodos específicos de este estado, como moverse() y atacar().
 * */

public class Tank {
	private TankState estado;
	
	public Tank(TankState estado) {
		this.estado = estado;
	}
	
	public void cambiarEstado(TankState nuevoEstado) {
		estado = nuevoEstado;
	}
	
	public void moverse() {
		estado.moverse();
	}
	
	public void atacar() {
		estado.atacar();
	}
}
