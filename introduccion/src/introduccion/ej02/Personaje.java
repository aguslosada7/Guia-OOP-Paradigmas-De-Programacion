package introduccion.ej02;

/*
 * Modelar el personaje de un juego de peleas por turnos.
 * Un personaje tiene nombre, vida y daño. Nace con la vida completa, y esa vida inicial es también
 * su máxima.
 * La vida baja cuando recibe daño y sube cuando se cura, pero nunca queda negativa ni supera el máximo.
 * Está vivo mientras le quede vida. Un personaje muerto no se cura y no ataca.
 * Un personaje puede atacar a otro. El que recibe pierde tanta vida como daño reparte el atacante, y el
 * atacante no se lastima. El ataque no ocurre si el atacante está muerto, ni si intenta atacarse a sí
 * mismo, y quien lo intentó tiene que poder enterarse.
 * */

public class Personaje {
	String nombre;
	int vida;
	int danio;
	int vidaActual;
	
	Personaje(String nombre, int vida, int danio){
		this.nombre = nombre;
		this.danio = danio;
		this.vida = vida;
		vidaActual = vida;
	}
	
	boolean atacar(Personaje oponente){
		if(vidaActual <= 0)
			return false;
		
		oponente.vidaActual -= danio;
		if(oponente.vidaActual < 0)
			oponente.vidaActual = 0;
		
		return true;
	}
	
	boolean curarse(int vidaExtra){
		if(vidaActual <= 0)
			return false;
		
		vidaActual += vidaExtra;
		if(vidaActual > vida)
			vidaActual = vida;
		
		return true;
	}
}
