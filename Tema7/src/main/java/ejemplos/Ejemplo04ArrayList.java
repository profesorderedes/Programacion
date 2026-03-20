package ejemplos;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo04ArrayList {

	public static void main(String[] args) {

		List<Libro> libros = new ArrayList<>();

		libros.add(new Libro("Skibidi toilet", "Brainrot master", "67-67-67"));
		libros.add(new Libro("El arte del ninjask", "Assasino capuchino", "49-49-49"));
		libros.add(new Libro("6767676767!!!!", "sixseven kid", "33-33-33"));
		libros.add(new Libro("El arte de pudrir el cerebro", "Brainrot master", "69-69-69"));

		libros.add(2, new Libro("Skibidi toilet 2 La venganza", "Brainrot master", "05-05-05"));

		verLista(libros);

		libros.remove(4);

		verLista(libros);
		// libros.clear();

		libros.set(1, new Libro("Minecraft la guia de crafteo", "Mojang", "22-22-22"));

		verLista(libros);

		libros.add(new Libro("Skibidi toilet", "Brainrot master", "67-67-67"));

		verLista(libros);

		if (libros.isEmpty()) {
			System.out.println("Lista de libros vacia.");
		} else {
			System.out.println("Lista de libros no vacia.");
		}

		if (libros.get(0).equals(libros.get(4))) {
			System.out.println("Libros iguales");
		} else {
			System.out.println("Libros distintos");
		}

	}

	private static void verLista(List<Libro> libros) {
		System.out.println();
		for (Libro libro : libros) {
			System.out.println(
					"Titulo: " + libro.getTitulo() + " Autor: " + libro.getAutor() + " ISBN: " + libro.getIsbn());
		}
	}

}