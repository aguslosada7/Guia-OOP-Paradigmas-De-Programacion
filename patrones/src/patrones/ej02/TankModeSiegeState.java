package patrones.ej02;

public class TankModeSiegeState implements TankState {

	@Override
	public void moverse() {
		System.out.println("Moverse en Modo Asedio.");
	}

	@Override
	public void atacar() {
		System.out.println("Atacar en Modo Asedio.");
	}

}
