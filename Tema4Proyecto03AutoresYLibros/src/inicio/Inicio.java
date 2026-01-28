package inicio;

import biblioteca.Autor;
import biblioteca.Libro;

public class Inicio {

	public static void main(String[] args) {

		Autor autor1 = new Autor("Arturo Pérez-Reverte", "perezreverte@gmail.com", 1955);
		Autor autor2 = new Autor("Francisco de Quevedo");
		
		System.out.println(autor1.toString());
		System.out.println(autor2.toString());
		
		Libro libro1 = new Libro("La tabla de Flandes", "84-7812811-2", autor1);
		Libro.setAnyoActual(2026);
		
		System.out.println(libro1.toString());
		
		Libro libro2 = new Libro("A una nariz");
		System.out.println(libro2.toString());

	}

}
