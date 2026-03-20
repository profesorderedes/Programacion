package ejemplos;

import java.util.HashSet;
import java.util.Set;

public class Ejemplo10 {

	public static void main(String[] args) {

		Set<String> nombres = new HashSet<>();

		nombres.add("Pepe");
		nombres.add("Paco");
		nombres.add("Pedro");
		nombres.add("Pepe");
		nombres.add("Paco");

		System.out.println("Tamaño del conjunto: " + nombres.size());

		System.out.println("\nListado de nombres:");
		for (String nombre : nombres) {
			System.out.println("- " + nombre);
		}

		boolean existe = nombres.contains("Pepe");

		if (existe) {
			System.out.println("\nPepe está en el conjunto.");
		} else {
			System.out.println("\nPepe no está en el conjunto.");
		}

		nombres.remove("Pepe");
		for (String nombre : nombres) {
			System.out.println("- " + nombre);
		}

		nombres.clear();

		System.out.println("\nTamaño del conjunto: " + nombres.size());

	}

}
