package ejemplos;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo01ArrayList {

	public static void main(String[] args) {

		List<String> nombres = new ArrayList<>();

		nombres.add("Lucas");
		nombres.add("José Luis");
		nombres.add("Óscar");
		nombres.add(1, "Jordi");

		// Lucas, Jordi, José Luis, Óscar

//		for(int i=0; i < nombres.size(); i++) {
//			System.out.println(i + " " + nombres.get(i));
//		}

		for (String nombre : nombres) {
			System.out.println(nombre);
		}

		System.out.println("Borrando la posición 1...");
		nombres.remove(1);

		System.out.println(nombres.toString());

		nombres.remove("Lucas");
		System.out.println(nombres.toString());

	}

}
