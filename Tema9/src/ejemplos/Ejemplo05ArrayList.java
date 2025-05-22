package ejemplos;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo05ArrayList {

	public static void main(String[] args) {

		List<String> nombres = new ArrayList<>();

		nombres.add("Lucas");
		nombres.add("José Luis");
		nombres.add("Óscar");
		nombres.add(1, "Jordi");

		// Lucas, Jordi, José Luis, Óscar
		
		System.out.println("Tamaño de la lista: " + nombres.size());
		
		// Borrar una lista completamente.
		
		nombres.clear();
		
		System.out.println("Tamaño de la lista: " + nombres.size());

	}

}








