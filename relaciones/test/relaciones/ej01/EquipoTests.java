package relaciones.ej01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EquipoTests {

	@Test
	void robotMasPotente() {
		Equipo equipo = new Equipo("Rebel Alliance");
		Robot r1 = new Robot(123, "R2D2", TipoDeRobot.PESADO, 100, 23.33, null);
		Robot r2 = new Robot(639, "X-Wing", TipoDeRobot.AEREO, 100, 15.9, null);
		Robot r3 = new Robot(333, "BB8", TipoDeRobot.PESADO, 100, 39.6, null);
		
		equipo.darDeAlta(r1);
		equipo.darDeAlta(r2);
		equipo.darDeAlta(r3);
		
		assertEquals(r3, equipo.obtenerRobotMasPotente());
	}

	@Test
	void sumarPotencias() {
		Equipo equipo = new Equipo("Rebel Alliance");
		Robot r1 = new Robot(123, "R2D2", TipoDeRobot.PESADO, 100, 23.33, null);
		Robot r2 = new Robot(639, "X-Wing", TipoDeRobot.AEREO, 100, 15.9, null);
		Robot r3 = new Robot(333, "BB8", TipoDeRobot.PESADO, 100, 39.6, null);
		
		equipo.darDeAlta(r1);
		equipo.darDeAlta(r2);
		equipo.darDeAlta(r3);
		
		assertEquals(78.83, equipo.obtenerSumaDePotencias());
	}
	
	@Test
	void ordenarPorEnergia() {
		Equipo equipo = new Equipo("Fantastic Beasts");
		Robot r1 = new Robot(123, "Fang", TipoDeRobot.PESADO, 75, 23.33, null);
		Robot r2 = new Robot(639, "Hedwig", TipoDeRobot.AEREO, 30, 15.9, null);
		Robot r3 = new Robot(333, "Buckbeak", TipoDeRobot.AEREO, 50, 39.6, null);
		Robot r4 = new Robot(456, "Scabbers", TipoDeRobot.LIVIANO, 43, 50, null);
		Robot r5 = new Robot(720, "Crookshanks", TipoDeRobot.LIVIANO, 60, 17.77, null);
		Robot[] robotsOrdenadosPorEnergia = {r2, r4, r3, r5, r1};
		
		equipo.darDeAlta(r1);
		equipo.darDeAlta(r2);
		equipo.darDeAlta(r3);
		equipo.darDeAlta(r4);
		equipo.darDeAlta(r5);
		
		equipo.ordenarRobotsPorEnergia();
		
		assertArrayEquals(robotsOrdenadosPorEnergia, equipo.getRobots());
	}
	
	@Test
	void ordenarPorPotencia() {
		Equipo equipo = new Equipo("Fantastic Beasts");
		Robot r1 = new Robot(123, "Fang", TipoDeRobot.PESADO, 75, 23.33, null);
		Robot r2 = new Robot(639, "Hedwig", TipoDeRobot.AEREO, 30, 15.9, null);
		Robot r3 = new Robot(333, "Buckbeak", TipoDeRobot.AEREO, 50, 39.6, null);
		Robot r4 = new Robot(456, "Scabbers", TipoDeRobot.LIVIANO, 43, 50, null);
		Robot r5 = new Robot(720, "Crookshanks", TipoDeRobot.LIVIANO, 60, 17.77, null);
		Robot[] robotsOrdenadosPorPotencia = {r4, r3, r1, r5, r2};
		
		equipo.darDeAlta(r1);
		equipo.darDeAlta(r2);
		equipo.darDeAlta(r3);
		equipo.darDeAlta(r4);
		equipo.darDeAlta(r5);
		
		equipo.ordenarRobotsPorPotencia();
		
		assertArrayEquals(robotsOrdenadosPorPotencia, equipo.getRobots());
	}
	
	@Test
	void ordenarPorTipo() {
		Equipo equipo = new Equipo("Fantastic Beasts");
		Robot r1 = new Robot(123, "Fang", TipoDeRobot.PESADO, 75, 23.33, null);
		Robot r2 = new Robot(639, "Hedwig", TipoDeRobot.AEREO, 30, 15.9, null);
		Robot r3 = new Robot(720, "Crookshanks", TipoDeRobot.LIVIANO, 60, 17.77, null);
		Robot r4 = new Robot(333, "Buckbeak", TipoDeRobot.AEREO, 50, 39.6, null);
		Robot r5 = new Robot(456, "Scabbers", TipoDeRobot.LIVIANO, 43, 50, null);
		Robot[] robotsOrdenadosPorTipo = {r1, r5, r3, r4, r2};
		
		equipo.darDeAlta(r1);
		equipo.darDeAlta(r2);
		equipo.darDeAlta(r3);
		equipo.darDeAlta(r4);
		equipo.darDeAlta(r5);
		
		equipo.ordenarRobotsPorTipo();
		
		assertArrayEquals(robotsOrdenadosPorTipo, equipo.getRobots());
	}
	
	@Test
	void equipoNuevoSinRobots() {
		Equipo equipo = new Equipo("Daft Punk");
		Robot[] robots = new Robot[5];
		
		assertArrayEquals(robots, equipo.getRobots());
	}
	
	@Test
	void inscribirRobotsHastaElLimite() {
		Equipo equipo = new Equipo("Fantastic Beasts");
		Robot r1 = new Robot(123, "Fang", TipoDeRobot.PESADO, 75, 23.33, null);
		Robot r2 = new Robot(639, "Hedwig", TipoDeRobot.AEREO, 30, 15.9, null);
		Robot r3 = new Robot(333, "Buckbeak", TipoDeRobot.AEREO, 50, 39.6, null);
		Robot r4 = new Robot(456, "Scabbers", TipoDeRobot.LIVIANO, 43, 50, null);
		Robot r5 = new Robot(720, "Crookshanks", TipoDeRobot.LIVIANO, 60, 17.77, null);
		Robot[] robots = {r1, r2, r3, r4, r5};
		
		equipo.darDeAlta(r1);
		equipo.darDeAlta(r2);
		equipo.darDeAlta(r3);
		equipo.darDeAlta(r4);
		equipo.darDeAlta(r5);
		
		assertArrayEquals(robots, equipo.getRobots());
	}
	
	@Test
	void darDeBajaConOtroObjetoDeIgualCodigo() {
		Equipo equipo = new Equipo("Daft Punk");
		Robot robot = new Robot(909, "TB3", TipoDeRobot.PESADO, 75, 23.33, null);
		Robot robotADarDeBaja = new Robot(909, "GM-08", TipoDeRobot.AEREO, 30, 15.9, null);
		Robot[] robots = new Robot[5];
		
		equipo.darDeAlta(robot);
		equipo.darDeBaja(robotADarDeBaja);
		
		assertArrayEquals(robots, equipo.getRobots());
	}
	
	@Test
	void darDeBajaRobotQueNoEstaEnElEquipo() {
		Equipo equipo = new Equipo("Daft Punk");
		Robot robot = new Robot(303, "TB3", TipoDeRobot.PESADO, 75, 23.33, null);
		Robot robotADarDeBaja = new Robot(909, "GM-08", TipoDeRobot.AEREO, 30, 15.9, null);
		
		equipo.darDeAlta(robot);
		
		assertFalse(equipo.darDeBaja(robotADarDeBaja));
	}
	
	@Test
	void agregarSextoRobot() {
		Equipo equipo = new Equipo("The Stardust Crusaders");
		Robot r1 = new Robot(123, "Jotaro", TipoDeRobot.PESADO, 75, 23.33, null);
		Robot r2 = new Robot(639, "Joseph", TipoDeRobot.AEREO, 30, 15.9, null);
		Robot r3 = new Robot(333, "Avdol", TipoDeRobot.PESADO, 50, 39.6, null);
		Robot r4 = new Robot(456, "Kakyoin", TipoDeRobot.PESADO, 43, 50, null);
		Robot r5 = new Robot(720, "Polnareff", TipoDeRobot.AEREO, 60, 17.77, null);
		Robot r6 = new Robot(111, "Iggy", TipoDeRobot.LIVIANO, 78, 10.55, null);
		Robot[] robots = {r1, r2, r3, r4, r5};
		
		equipo.darDeAlta(r1);
		equipo.darDeAlta(r2);
		equipo.darDeAlta(r3);
		equipo.darDeAlta(r4);
		equipo.darDeAlta(r5);
		
		assertFalse(equipo.darDeAlta(r6));
	}
	
	@Test
	void potenciaCuandoNoHayRobots() {
		Equipo equipo = new Equipo("Daft Punk");
		
		assertEquals(0, equipo.obtenerSumaDePotencias());
	}
	
	@Test
	void robotMasPotenteEnUnEquipoSinRobots() {
		Equipo equipo = new Equipo("Daft Punk");
		
		assertNull(equipo.obtenerRobotMasPotente());
	}
	
	@Test
	void robotsSonIgualesPorCodigo() {
		Robot r1 = new Robot(123, "TB3", TipoDeRobot.PESADO, 75, 23.33, null);
		Robot r2 = new Robot(123, "GM-08", TipoDeRobot.AEREO, 30, 15.9, null);
		
		assertTrue(r1.equals(r2));
	}
	
	@Test
	void puntajeDeRegistroRecienCreado() {
		Equipo equipo = new Equipo("Team Rocket");
		
		assertEquals(0, equipo.calcularPuntaje());
	}
	
	@Test
	void puntajeDeRegistroConTresVictorias() {
		Equipo equipo = new Equipo("Team Rocket");
		
		equipo.anotarVictoria();
		equipo.anotarVictoria();
		equipo.anotarVictoria();
		
		assertEquals(9, equipo.calcularPuntaje());
	}
	
	@Test
	void puntajeDeRegistroConDosVictoriasYUnEmpate() {
		Equipo equipo = new Equipo("Team Rocket");
		
		equipo.anotarVictoria();
		equipo.anotarVictoria();
		equipo.anotarEmpate();
		
		assertEquals(7, equipo.calcularPuntaje());
	}
	
	@Test
	void puntajeDeRegistroConDerrotas() {
		Equipo equipo = new Equipo("Team Rocket");
		
		equipo.anotarVictoria();
		equipo.anotarVictoria();
		equipo.anotarEmpate();
		equipo.anotarDerrota();
		
		assertEquals(7, equipo.calcularPuntaje());
	}
}
