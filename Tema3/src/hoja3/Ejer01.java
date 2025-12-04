package hoja3;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {

// 1.- En una biblioteca pública necesitan un programa para ir rellenando las fichas de los libros. Los
// datos a guardar de cada libro son: ISBN, título, autor y editorial.
// Crea un programa que pida por consola 5 registros con los datos anteriores y los guarde en un array
// llamado libros. Después de introducidos, deberá listar en pantalla los datos con el formato:
// ISBN Título Autor Editorial

		Scanner input = new Scanner(System.in);

		String[] titulosDatos = { "ISBN", "TÍTULO", "AUTOR", "EDITORIAL" };
		String[][] libros = new String[5][4];

		System.out.println("TOMA DE DATOS\n=============\n");

		for (int fila = 0; fila < libros.length; fila++) {

			System.out.println("Libro " + (fila + 1));

			for (int j = 0; j < libros[0].length; j++) {

				System.out.print("\t" + titulosDatos[j] + ": ");
				libros[fila][j] = input.nextLine();

			}

		}

		System.out.println("\n MUESTRA DE DATOS\n========================");

		for (int fila = 0; fila < libros.length; fila++) {

			System.out.println("\nLibro " + (fila + 1) + ":");

			for (int column = 0; column < libros[0].length; column++) {
				System.out.println("- " + titulosDatos[column] + ": " + libros[fila][column]);
			}

		}

	}

}