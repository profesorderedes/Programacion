package ejemplos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ejemplo01ArrayList {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();
		List<String> lista2 = new LinkedList<>();

		// Añadir elementos

		lista.add("Homer Simpson");
		lista.add("Marge Simpson");
		lista.add("Bart Simpson");
		lista.add("Lisa Simpson");
		lista.add("Maggie Simpson");

		lista.add(1, "Flanders");

		// Acceder a elementos.

		for (int i = 0; i < lista.size(); i++) {
			System.out.println(i + ") " + lista.get(i));
		}

		// Recorrer el ArrayList con foreach.

		System.out.println("\nReparto, usando foreach:");
		for (String personaje : lista) {
			System.out.println(personaje);
		}

		// Eliminar el elemento contenido en una posición.

		System.out.println("\nElemento eliminado: " + lista.remove(1));

		// Eliminar un elemento indicando ese elemento.

		boolean resultado = lista.remove("Bart Simpson");
		if (resultado == true) {
			System.out.println("Bart ha sido eliminado.");
		}

	}

}
