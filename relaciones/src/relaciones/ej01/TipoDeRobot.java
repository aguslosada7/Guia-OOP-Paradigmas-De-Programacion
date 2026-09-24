package relaciones.ej01;

public enum TipoDeRobot {
	PESADO(1),
	LIVIANO(2),
	AEREO(3);

	private final int prioridad;
	
	TipoDeRobot(int prioridad) {
		this.prioridad = prioridad;
	}
	
	public int getPrioridad() {
		return prioridad;
	}
}
