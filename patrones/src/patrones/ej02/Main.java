package patrones.ej02;

public class Main {

	public static void main(String[] args) {
		Tank tanque = new Tank(new TankModeTankState());
		
		tanque.moverse();
		tanque.atacar();
		tanque.cambiarEstado(new TankModeSiegeState());
		tanque.moverse();
		tanque.atacar();
	}

}
