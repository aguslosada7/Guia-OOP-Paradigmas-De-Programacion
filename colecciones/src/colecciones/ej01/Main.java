package colecciones.ej01;

public class Main {

	public static void main(String[] args) {
		Paquete p1 = new Paquete(123, "Caseros", "Rafael Castillo", 33);
		Paquete p2 = new Paquete(456, "Random Hospital", "Raccoon City", 9.09);
		Paquete p3 = new Paquete(789, "Hogwarts", "Privet Drive 4", 87);
		Registro registro = new Registro();
		
		registro.agregarPaquete(p1);
		registro.agregarPaquete(p2);
		registro.agregarPaquete(p3);
		
		registro.mostrarPaquetesQueSuperanUnPeso(20);
	}

}
