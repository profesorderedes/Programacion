package ejemplosListas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ejemplo03ArrayList {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();

		// Añadir elementos.

		lista.add("Homer Simpson");
		lista.add("Marge Simpson");
		lista.add("Bart Simpson");
		lista.add("Lisa Simpson");
		lista.add("Maggie Simpson");
		lista.add(1, "Flanders");

		// Sustituir un elemento por otro (set).

		System.out.println("Eliminado: " + lista.set(0, "Apu"));

		for (String personaje : lista) {
			System.out.println(personaje);
		}

		// Comprobar si un personaje está en la lista.

		boolean contiene = lista.contains("Lisa Simpson");

		if (contiene) {
			System.out.println("Está dentro de la lista.");
		} else {
			System.out.println("No está dentro de la lista.");
		}

		// Buscar un personaje en la lista.

		System.out.println("Maggie está en la posición " + lista.indexOf("Maggie Simpson"));
		System.out.println("El Sr Burns está en la posición " + lista.indexOf("Sr Burns"));

		// Comprobar si la lista está vacía.

		if (lista.isEmpty()) {
			System.out.println("Lista vacía.");
		} else {
			System.out.println("Lista no vacía");
		}

		// Borrar la lista completamente.

		lista.clear();

		if (lista.isEmpty()) {
			System.out.println("Lista vacía.");
		} else {
			System.out.println("Lista no vacía");
		}

	}

}
