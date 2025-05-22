package ejemplos;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo04ArrayList {

	public static void main(String[] args) {

		List<String> nombres = new ArrayList<>();

		nombres.add("Lucas");
		nombres.add("José Luis");
		nombres.add("Óscar");
		nombres.add(1, "Jordi");

		// Lucas, Jordi, José Luis, Óscar

		int pos = nombres.indexOf("José Luis");
		System.out.println("\nPosición en la lista ocupada por José Luis: " + pos);

		pos = nombres.indexOf("Emilio");
		System.out.println("\nPosición en la lista ocupada por Emilio: " + pos);

		nombres.add("Lucas");
		nombres.add("Lucas");

		// Lucas, Jordi, José Luis, Óscar, Lucas, Lucas

		pos = nombres.lastIndexOf("Lucas");
		System.out.println("\nLa última posición de Lucas en la lista es " + pos);
		// Saber si la lista está vacía.

		System.out.println("\n¿Está la lista vacía? " + nombres.isEmpty());

		int totalNombres = nombres.size();
		for (int i = 1; i <= totalNombres; i++) {
			nombres.remove(0);
		}

		System.out.println("\n¿Está la lista vacía? " + nombres.isEmpty());

	}

}
