package patrones.ej01;

import java.util.List;
import java.util.ArrayList;

public class Grupo implements FormaGeometrica {
	List<FormaGeometrica> grupo;
	
	public Grupo() {
		grupo = new ArrayList<>();
	}
	
	public void agregarForma(FormaGeometrica forma) {
		grupo.add(forma);
	}
	
	@Override
	public double getArea() {
		double areaTotal = 0;
		
		for(FormaGeometrica forma: grupo) {
			areaTotal += forma.getArea();
		}
		
		return areaTotal;
	}
	
	public int getCantidadDePomosDeTempera() {
		return (int) Math.ceil(getArea()/100);
	}
}
