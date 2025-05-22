package ejemplos;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo03ArrayList {

	public static void main(String[] args) {

		List<String> nombres = new ArrayList<>();

		nombres.add("Lucas");
		nombres.add("José Luis");
		nombres.add("Óscar");
		nombres.add(1, "Jordi");

		// Lucas, Jordi, José Luis, Óscar
		
		// Sustituir un elemento por otro.
		String eliminado = nombres.set(2, "Alejandro");
		System.out.println("Se ha eliminado a " + eliminado);
		
		// Lucas, Jordi, Alejandro, Óscar
		
		System.out.println(nombres.toString());
		
		// Añadir un elemento en la posición 2.
		nombres.add(2, "Brayan");
		
		// Lucas, Jordi, Brayan, Alejandro, Óscar
		System.out.println(nombres.toString());
		
		// Averiguar si un elemento está en la lista.
		boolean esta = nombres.contains("Óliver");
		System.out.println("¿Contiene a Óliver? " + esta);
		
		esta = nombres.contains("Alejandro");
		System.out.println("¿Contiene a Alejandro? " + esta);

	}

}
