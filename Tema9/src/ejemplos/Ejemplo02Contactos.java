package ejemplos;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo02Contactos {

	public static void main(String[] args) {

		List<Contacto> lista = new ArrayList<>();

		Contacto c1 = new Contacto("Tallón", "Alejandro", "555 21 21 21");
		Contacto c2 = new Contacto("Álvaro", "Brayan", "555 15 16 17");
		Contacto c3 = new Contacto("Isern", "Óliver", "555 18 18 18");

		lista.add(c1);
		lista.add(c2);
		lista.add(c3);

		for (Contacto c : lista) {
			System.out.println(c.toString());
		}

		Contacto cEliminar = new Contacto("Tallón", "Alejandro", "555 21 21 21");
		System.out.println(c1.equals(cEliminar));

		lista.remove(cEliminar);

		for (Contacto c : lista) {
			System.out.println(c.toString());
		}

	}

}
