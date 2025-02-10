package inicio;

import java.util.Scanner;

import biblioteca.Autor;
import biblioteca.Libro;

public class Inicio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Intoduce los datos del autor:");

		System.out.print("Nombre: ");
		String nombre = sc.nextLine();

		System.out.print("Email: ");
		String email = sc.nextLine();

		System.out.print("Fecha de nacimiento: ");
		int fechaNacimiento = sc.nextInt();

		Autor a1 = new Autor(nombre, email, fechaNacimiento);

		System.out.println("\n" + a1.toString());

		System.out.println("\nIntroduce los datos del libro");

		sc.nextLine();

		System.out.print("Titulo: ");
		String titulo = sc.nextLine();

		System.out.print("ISBN: ");
		String isbn = sc.nextLine();

		Libro l1 = new Libro(titulo, isbn, a1);

		System.out.println("\n" + l1.toString());

		System.out.println("\n*** Constructores alternativos ***\n");

		Autor a2 = new Autor(nombre);
		System.out.println(a2.toString());

		Libro l2 = new Libro(titulo);
		System.out.println("\n" + l2.toString());

	}

}
