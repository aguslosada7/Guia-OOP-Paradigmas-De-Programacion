package patrones.ej01;

public class Main {

	public static void main(String[] args) {
		Grupo grupo = new Grupo();
		Rectangulo rectangulo = new Rectangulo(4, 6);
		Circulo circulo = new Circulo(3);
		Triangulo triangulo = new Triangulo(5, 9);
		Cuadrado cuadrado = new Cuadrado(7);
		Circulo circulo2 = new Circulo(2);
		
		grupo.agregarForma(rectangulo);
		grupo.agregarForma(triangulo);
		grupo.agregarForma(circulo);
		grupo.agregarForma(cuadrado);
		grupo.agregarForma(circulo2);
		
		System.out.println(grupo.getArea()); // 24 + 22.5 + 28.274 + 49 + 12.566 = 136.340 (aprox)
		System.out.println(grupo.getCantidadDePomosDeTempera()); // 2
	}

}
