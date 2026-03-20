package ejemplos;

import java.util.HashMap;
import java.util.Map;

public class Ejemplo06Map {

	public static void main(String[] args) {

		/*
		 * dni1 -> nombre1 dni2 -> nombre2
		 */
		Map<String, String> empleados = new HashMap<>();

		// Añadir datos

		empleados.put("12000000T", "Luisa Pérez");
		empleados.put("15000000Y", "Manuel López");
		empleados.put("20000000R", "Ramón Sánchez");

		// Ver el contenido del mapa.

		System.out.println(empleados);

		// Consultar el mapa.

		System.out.println(empleados.get("15000000Y"));

		// Eliminar un elemento del mapa.

		empleados.remove("20000000R");

		System.out.println(empleados.get("20000000R"));

		// Recorrer el mapa.

		for (String clave : empleados.keySet()) {
			System.out.println("Clave: " + clave + "; Valor: " + empleados.get(clave));
		}

		// Recorrer los valores del mapa.

		System.out.println();
		for (String valor : empleados.values()) {
			System.out.println(valor);
		}

		// Averiguar si una clave está en el mapa.

		boolean claveExistente = empleados.containsKey("23000000T");

		if (claveExistente) {
			System.out.println("Hay un empleado con DNI 23000000T");
		} else {
			System.out.println("No hay un empleado con DNI 23000000T");
		}

		// Averiguar si un valor está en el mapa.

		String nombre = "Luisa Pérez";
		boolean valorExistente = empleados.containsValue(nombre);

		if (valorExistente) {
			System.out.println("Hay un empleado llamado " + nombre);
		} else {
			System.out.println("No hay un empleado llamado " + nombre);
		}

	}

}
