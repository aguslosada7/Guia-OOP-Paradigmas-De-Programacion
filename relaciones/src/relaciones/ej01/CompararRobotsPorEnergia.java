package relaciones.ej01;

import java.util.Comparator;

public class CompararRobotsPorEnergia implements Comparator<Robot> {
	@Override
	public int compare(Robot o1, Robot o2) {
		return Double.compare(o1.getEnergia(), o2.getEnergia());
	}
}
