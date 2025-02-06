package inicio;

import java.util.Scanner;

import biblioteca.Autor;
import biblioteca.Libro;

public class Inicio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Libro l1 = new Libro();
		Autor a1 = new Autor();
		System.out.println("Intoduce los datos del autor:");

		System.out.print("Nombre: ");
		String nombre = sc.nextLine();
		a1.setNombre(nombre);

		System.out.print("Email: ");
		a1.setEmail(sc.nextLine());

		System.out.print("Fecha de nacimiento: ");
		a1.setFechaNacimiento(sc.nextInt());

		System.out.println("Introduce los datos del libro");

		System.out.print("Titulo: ");
		String titulo = sc.nextLine();
		l1.setTitulo(titulo);

		System.out.print("ISBN: ");
		l1.setIsbn(sc.nextLine());

		l1.setAutor(nombre);

		System.out.println(a1.toString());
		System.out.println(l1.toString());
	}

}
