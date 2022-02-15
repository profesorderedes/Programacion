package inicio;

import java.util.Scanner;

import biblioteca.Autor;
import biblioteca.Libro;

public class Inicio {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe los datos del autor");

		System.out.println("Nombre:");
		String nombre = entrada.nextLine();

		System.out.println("Email:");
		String email = entrada.nextLine();

		System.out.println("Año:");
		int anyo = entrada.nextInt();

		Autor autor3 = new Autor(nombre, email, anyo);
		System.out.println(autor3.toString());
		
		entrada.nextLine();

		System.out.println("\nEscribe los datos del Libro");

		System.out.println("Título:");
		String titulo = entrada.nextLine();

		System.out.println("isbn:");
		String isbn = entrada.nextLine();
		
		System.out.println("Año actual:");
		int anyoActual = entrada.nextInt();

		Libro libro2 = new Libro(titulo, isbn, autor3);
		Libro.setAnyoActual(anyoActual);
		
		System.out.println(libro2.toString());

	}

}