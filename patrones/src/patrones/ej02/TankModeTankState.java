package patrones.ej02;

public class TankModeTankState implements TankState {

	@Override
	public void moverse() {
		System.out.println("Moverse en Modo Tanque.");
	}

	@Override
	public void atacar() {
		System.out.println("Atacar en Modo Tanque.");
	}

}
