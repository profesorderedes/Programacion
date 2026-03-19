package ejemplosListas;

import java.util.HashMap;
import java.util.Map;

public class Ejemplo07 {

	public static void main(String[] args) {

		/*
		 * dni1 -> nombre1 dni2 -> nombre2
		 */
		Map<String, String> empleados = new HashMap<>();

		// Añadir datos

		empleados.put("12000000T", "Luisa Pérez");
		empleados.put("15000000Y", "Manuel López");
		empleados.put("20000000R", "Ramón Sánchez");
		
		// Ver el número de entradas almacenadas.
		
		System.out.println("Hay " + empleados.size() + " empleados.");
		
		// Averiguar si un mapa está vacío.
		
		boolean vacio = empleados.isEmpty();
		
		if(vacio) {
			System.out.println("El mapa está vacío.");
		}else {
			System.out.println("El mapa no está vacío.");
		}
		
		// Vaciar un mapa.
		
		empleados.clear();
		
		if(empleados.isEmpty()) {
			System.out.println("El mapa está vacío.");
		}else {
			System.out.println("El mapa no está vacío.");
		}
		
		// Métodos replace y putIfAbsent.
		
		// put() sobreescribe el valor si la clave ya existía.
		empleados.put("15000000Y", "Carlos Sogorb");
		
		System.out.println(empleados.get("15000000Y"));
		
		// putIfAbsent() no sobreescribe el valor si la clave ya existía.
		empleados.putIfAbsent("15000000Y", "Lucas Ramírez");
		
		System.out.println(empleados.get("15000000Y"));
		
		// replace() sirve para cambiar un valor cuya clave exista previamente.
		// Si la clave no existe, no lo añade, no hace nada.
		
		empleados.replace("18000000Y", "Perico Palotes");
		System.out.println(empleados.get("18000000Y"));
		
		
		
		
		
		
		
		

	}

}





