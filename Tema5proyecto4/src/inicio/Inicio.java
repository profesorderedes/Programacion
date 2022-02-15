package inicio;

import java.util.Scanner;

import biblioteca.Autor;
import biblioteca.Libro;

public class Inicio {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		// Preguntar cuántos autores tiene el libro.
		
		System.out.println("***** Biblioteca IES Son Ferrer "
				+ "*****\n");
		System.out.println("Alta de libro");
		System.out.println("=======================");
		System.out.println("¿Cuántos autores tiene el libro?");
		int numAutores = entrada.nextInt();
		
		// Crear un array autores con ese número de posiciones.
		Autor autores[] = new Autor[numAutores];
		
		// Pedir los datos de un autor, crear un objeto Autor 
		// con esos datos, añadirlo al array y repetir 
		// las veces necesarias.
		for (int i = 0; i < autores.length; i++) {
			
			// Pedir datos autor.
			System.out.println("Escribe los datos del autor");

			System.out.println("Nombre:");
			String nombre = entrada.nextLine();

			System.out.println("Email:");
			String email = entrada.nextLine();

			System.out.println("Año:");
			int anyo = entrada.nextInt();
			
			// Crear objeto Autor con los datos
			
			// Añadirlo al array.
			
		}
		
		
		
		
		
		// Pedir el resto de datos del libro.
		
		// Crear un objeto libro con todos los datos recogidos.

		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println("Escribe los datos del autor");
//
//		System.out.println("Nombre:");
//		String nombre = entrada.nextLine();
//
//		System.out.println("Email:");
//		String email = entrada.nextLine();
//
//		System.out.println("Año:");
//		int anyo = entrada.nextInt();
//
//		Autor autor3 = new Autor(nombre, email, anyo);
//		System.out.println(autor3.toString());
//		
//		entrada.nextLine();
//
//		System.out.println("\nEscribe los datos del Libro");
//
//		System.out.println("Título:");
//		String titulo = entrada.nextLine();
//
//		System.out.println("isbn:");
//		String isbn = entrada.nextLine();
//		
//		System.out.println("Año actual:");
//		int anyoActual = entrada.nextInt();
//
//		Libro libro2 = new Libro(titulo, isbn, autor3);
//		Libro.setAnyoActual(anyoActual);
//		
//		System.out.println(libro2.toString());

	}

}