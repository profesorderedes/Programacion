package inicio;

import java.util.Scanner;

import biblioteca.Autor;
import biblioteca.Libro;

public class Inicio {

	public static void main(String[] args) {

		Autor a1 = new Autor("Miguel de Cervantes");
		Autor a2 = new Autor("Arturo Pérez-Reverte");
		Autor a3 = new Autor("Bram Stoker");

		Autor[] autores1 = { a1, a2, a3 };

		Libro l1 = new Libro("Programación Java", "84-123123-1", autores1);

		System.out.println(l1.toString());
		l1.muestraAutores();

		Autor[] autores2 = { a1 };
		Libro l2 = new Libro("El Quijote", "84-123123-1", autores2);
		System.out.println("\n" + l2.toString());
		l2.muestraAutores();

	}

}
