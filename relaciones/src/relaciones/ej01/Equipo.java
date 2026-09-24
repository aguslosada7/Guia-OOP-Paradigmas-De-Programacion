package relaciones.ej01;

import java.util.Arrays;

public class Equipo {
	private String nombre;
	private Robot[] robots;
	private static final int MAXIMO_ROBOTS = 5;
	private int cantidadActualDeRobots;
	private Registro registro;
	
	public Equipo(String nombre) {
		this.nombre = nombre;
		robots = new Robot[MAXIMO_ROBOTS];
		registro = new Registro();
	}
	
	public boolean darDeAlta(Robot robot) {
		if(robot == null || cantidadActualDeRobots >= MAXIMO_ROBOTS)
			return false;
		
		robots[cantidadActualDeRobots] = robot;
		cantidadActualDeRobots++;
		return true;
	}
	
	public boolean darDeBaja(Robot robot) {
		for (int i = 0; i < cantidadActualDeRobots; i++) {
			if(robot.equals(robots[i])) {
				for (int j = i; j < cantidadActualDeRobots-1; j++)
					robots[j] = robots[j+1];
				
				robots[cantidadActualDeRobots-1] = null;
				cantidadActualDeRobots--;
				return true;
			}
		}
		
		return false;
	}
	
	public Robot obtenerRobotMasPotente() {
		Robot robotMasPotente = robots[0];
		
		for (int i = 0; i < cantidadActualDeRobots; i++) {
			if(robots[i].getPotencia() > robotMasPotente.getPotencia())
				robotMasPotente = robots[i];
		}
		
		return robotMasPotente;
	}
	
	public double obtenerSumaDePotencias() {
		double resultado = 0;
		
		for (int i = 0; i < cantidadActualDeRobots; i++) {
			resultado += robots[i].getPotencia();
		}
		
		return resultado;
	}
	
	public void anotarVictoria() {
		registro.anotarVictoria();
	}
	
	public void anotarEmpate() {
		registro.anotarEmpate();
	}
	
	public void anotarDerrota() {
		registro.anotarDerrota();
	}
	
	public int calcularPuntaje() {
		return registro.calcularPuntaje();
	}
	
	public void generarResumen() {
		registro.generarResumen();
	}
	
	public void ordenarRobotsPorTipo() {
		Arrays.sort(robots, 0, cantidadActualDeRobots, new CompararRobotsPorTipo());
	}
	
	public void ordenarRobotsPorPotencia() {
		Arrays.sort(robots, 0, cantidadActualDeRobots, new CompararRobotsPorPotencia());
	}
	
	public void ordenarRobotsPorEnergia() {
		Arrays.sort(robots, 0, cantidadActualDeRobots, new CompararRobotsPorEnergia());
	}

	public Robot[] getRobots() {
		return robots;
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", robots=" + Arrays.toString(robots) + ", cantidadActualDeRobots="
				+ cantidadActualDeRobots + ", registro=" + registro + "]";
	}

	public String getNombre() {
		return nombre;
	}
	
	public void mostrarRobots() {
		for (int i = 0; i < cantidadActualDeRobots; i++)
			System.out.println(robots[i].toString());
	}
}
