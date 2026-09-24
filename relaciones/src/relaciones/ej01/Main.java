package relaciones.ej01;

public class Main {

	public static void main(String[] args) {
		Equipo equipo1 = new Equipo("NERV");
		Equipo equipo2 = new Equipo("The Galactic Empire");
		Equipo [] equipos = {equipo1, equipo2};
		
		Piloto p0 = new Piloto("Rei", 0);
		Piloto p1 = new Piloto("Shinji", 1);
		Piloto p2 = new Piloto("Asuka", 2);
		Piloto p3 = new Piloto("Darth Sidious", 3);
		Piloto p4 = new Piloto("Darth Vader", 4);
		
		Robot r1 = new Robot(000, "EVA-00", TipoDeRobot.LIVIANO, 75, 23.33, p0);
		Robot r2 = new Robot(001, "EVA-01", TipoDeRobot.PESADO, 50, 15.9, p1);
		Robot r3 = new Robot(002, "EVA-02", TipoDeRobot.PESADO, 50, 39.6, p2);
		Robot r4 = new Robot(66, "TIE Fighter", TipoDeRobot.LIVIANO, 60, 20, p4);
		Robot r5 = new Robot(81, "AT-AT", TipoDeRobot.PESADO, 45, 33.3, null);
		Robot r6 = new Robot(12, "Star Destroyer", TipoDeRobot.AEREO, 80, 17.4, p3);
		
		equipo1.darDeAlta(r1);
		equipo1.darDeAlta(r2);
		equipo1.darDeAlta(r3);
		equipo1.anotarVictoria();
		equipo1.anotarVictoria();
		equipo1.anotarDerrota();
		equipo1.anotarEmpate();
		equipo1.anotarVictoria();
		equipo1.anotarEmpate();
		equipo1.calcularPuntaje();
		
		equipo2.darDeAlta(r4);
		equipo2.darDeAlta(r5);
		equipo2.darDeAlta(r6);
		equipo2.anotarDerrota();
		equipo2.anotarEmpate();
		equipo2.anotarDerrota();
		equipo2.anotarVictoria();
		equipo2.anotarVictoria();
		equipo2.anotarDerrota();
		equipo2.calcularPuntaje();
		
		
		for (Equipo equipo : equipos) {
			System.out.println("NOMBRE DEL EQUIPO: " + equipo.getNombre());
			
			System.out.println("\nROBOTS ORDENADOS POR TIPO:");
			equipo.ordenarRobotsPorTipo();
			equipo.mostrarRobots();
			
			System.out.println("\nROBOTS ORDENADOS POR POTENCIA:");
			equipo.ordenarRobotsPorPotencia();
			equipo.mostrarRobots();
			
			System.out.println("\nROBOTS ORDENADOS POR ENERGÍA:");
			equipo.ordenarRobotsPorEnergia();
			equipo.mostrarRobots();
			
			System.out.println("\nROBOT MÁS POTENTE");
			System.out.println(equipo.obtenerRobotMasPotente().toString());
			
			System.out.println("\nPOTENCIA TOTAL: " + equipo.obtenerSumaDePotencias());
			
			System.out.println("\nRESUMEN DE TEMPORADA:");
			equipo.generarResumen();
			
			System.out.println("\n");
		}
	}

}
