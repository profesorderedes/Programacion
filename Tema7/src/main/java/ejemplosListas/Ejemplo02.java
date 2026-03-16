package ejemplosListas;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo02 {

	public static void main(String[] args) {

		List<Persona> personas = new ArrayList<>();

		Persona p1 = new Persona("Pedro", "Martínez", "10200200T");
		Persona p2 = new Persona("Miguel", "López", "21930190T");
		Persona p3 = new Persona("Manuel", "Lozano", "31290110T");

		personas.add(p1);
		personas.add(p2);
		personas.add(p3);

		for (Persona p : personas) {
			System.out.println(p.toString());
		}

		personas.remove(p1);

		System.out.println();
		for (Persona p : personas) {
			System.out.println(p.toString());
		}

	}

}
