package relaciones.ej01;

import java.util.Comparator;

public class CompararRobotsPorPotencia implements Comparator<Robot> {
	@Override
	public int compare(Robot o1, Robot o2) {
		return Double.compare(o2.getPotencia(), o1.getPotencia());
	}
}
