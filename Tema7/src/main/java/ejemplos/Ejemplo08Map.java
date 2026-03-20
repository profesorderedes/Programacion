package ejemplos;

import java.util.HashMap;
import java.util.Map;

public class Ejemplo08Map {

	public static void main(String[] args) {

		Map<String, Integer> calorias = new HashMap<>();

		// Añadimos algunos alimentos.

		calorias.put("Manzana", 100);
		calorias.put("Naranja", 50);
		calorias.put("Sandía", 200);

		verMapa(calorias);

		System.out.println("\nTamaño: " + calorias.size());

		if (calorias.isEmpty()) {
			System.out.println("Está vacío");
		} else {
			System.out.println("No está vacío");
		}

		System.out.println();

		verMapa(calorias);

		calorias.putIfAbsent("Manzana", 125);
		calorias.putIfAbsent("Platano", 150);

		System.out.println();

		verMapa(calorias);

		calorias.replace("Melon", 125);
		calorias.replace("Sandía", 300);

		System.out.println();

		verMapa(calorias);

		calorias.clear();

		System.out.println("\nTamaño: " + calorias.size());

		if (calorias.isEmpty()) {
			System.out.println("Está vacío");
		} else {
			System.out.println("No está vacío");
		}

		System.out.println();

		verMapa(calorias);

	}

	private static void verMapa(Map<String, Integer> mapa) {

		System.out.printf("%-12s %8s\n", "Alimento", "Calorías");
		System.out.printf("%-12s %8s\n", "========", "========");

		for (String alimento : mapa.keySet()) {
			System.out.printf("%-12s %8s\n", alimento, mapa.get(alimento));
		}

	}

}