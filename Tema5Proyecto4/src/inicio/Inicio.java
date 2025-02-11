package inicio;

import java.util.Scanner;

import biblioteca.Autor;
import biblioteca.Libro;

public class Inicio {

	public static void main(String[] args) {

		Autor a1 = new Autor();
		Autor a2 = new Autor();
		Autor a3 = new Autor();
		
		Autor[] autores1 = {a1,a2,a3};
		
		Libro l1 = new Libro("Programación Java", "84-123123-1", autores);
		
		System.out.println(l1.toString());
		
	}

}
