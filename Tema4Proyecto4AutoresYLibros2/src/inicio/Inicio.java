package inicio;

import biblioteca.Autor;
import biblioteca.Libro;

public class Inicio {

	public static void main(String[] args) {

		Autor autor1 = new Autor("Arturo Pérez-Reverte", "perezreverte@gmail.com", 1955);

		Autor[] autores = { autor1 };

		Libro libro1 = new Libro("La tabla de Flandes", "84-7812811-2", autores);
		Libro.setAnyoActual(2026);

		System.out.println(libro1.toString());

		// Damos de alta el libro "Java essentials" con tres autores.
		Autor autor2 = new Autor("Dr. Lawrence G. Decamora III", "decamora@gmail.com", 1965);
		Autor autor3 = new Autor("Michelle C. Decamora", "decamorac@gmail.com", 1980);

		Autor[] autoresJava = { autor2, autor3 };
		Libro libro2 = new Libro("Java essentials", "84-12121-4", autoresJava);

		System.out.println(libro2.toString());

		libro2.muestraAutores();

	}

}
