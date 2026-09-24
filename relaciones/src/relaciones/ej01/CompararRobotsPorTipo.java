package relaciones.ej01;

import java.util.Comparator;

public class CompararRobotsPorTipo implements Comparator<Robot> {
	@Override
	public int compare(Robot o1, Robot o2) {		
		int prioridadTipoDeRobot1 = o1.getTipoDeRobot().getPrioridad();
		int prioridadTipoDeRobot2 = o2.getTipoDeRobot().getPrioridad();
		int res = Integer.compare(prioridadTipoDeRobot1, prioridadTipoDeRobot2);
		
		if(res == 0) {
			res = Integer.compare(o1.getCodigo(), o2.getCodigo());
		}
		
		return res;
	}
}
