package colecciones.ej06;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

/*
 * Un programa necesita llevar un registro de los estudiantes y sus respectivas notas en un curso. Escriba un programa que utilice un
 * HashMap para almacenar el nombre del estudiante como clave y un arreglo de notas como valor. El programa debe permitir agregar nuevas
 * notas y mostrar el promedio de notas de un estudiante específico.
 * Ahora diseñe una función que permita invertir el mapa: queremos el listado de estudiantes por promedio. Ante un mismo promedio, debe
 * devolver todos los estudiantes que lo hayan obtenido.
 * */

public class RegistroDeEstudiantes {
	Map<String, List<Double>> registro;
	
	public RegistroDeEstudiantes() {
		registro = new HashMap<>();
	}
	
	public void agregarNota(String nombre, double nota) {
		if(nota >= 1 && nota <= 10) {
			List<Double> listaNueva = registro.getOrDefault(nombre, new ArrayList<>());
			listaNueva.add(nota);
			registro.put(nombre, listaNueva);
		}
	}
	
	public double getPromedio(String nombre) {
		double promedio = 0;
		int cantidadDeNotas = registro.getOrDefault(nombre, new ArrayList<>()).size();
		
		if(cantidadDeNotas > 0) {
			for(double nota: registro.get(nombre))
				promedio += nota;
			
			promedio /= cantidadDeNotas;
		}

		return promedio;
	}
	
	public List<String> obtenerListadoDeEstudiantesPorPromedio(double promedio){
		List <String> listado = new ArrayList<>();
		
		if(promedio > 0 && promedio <= 10) {
			for(String nombre: registro.keySet()) {
				if(getPromedio(nombre) == promedio)
					listado.add(nombre);
			}
		}
		
		return listado;
	}
}
