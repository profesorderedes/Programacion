package ejercicios3;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {

		String libros[][] = new String[5][4];

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce los datos de los libros:");
		System.out.println("==============================");

		for (int fila = 0; fila < libros.length; fila++) {
			System.out.print("\nISBN: ");
			libros[fila][0] = entrada.nextLine();
			System.out.print("Título: ");
			libros[fila][1] = entrada.nextLine();
			System.out.print("Autor: ");
			libros[fila][2] = entrada.nextLine();
			System.out.print("Editorial: ");
			libros[fila][3] = entrada.nextLine();
		}

		System.out.println("\nInformación de los libros: ");
		System.out.println("--------------------------");

		System.out.printf("%-14s %-30s %-25s %-15s\n",
				"ISBN","Título","Autor","Editorial");
	

		for (int fila = 0; fila < libros.length; fila++) {
			System.out.printf("%-14s %-30s %-25s %-15s\n",
					libros[fila][0], 
					libros[fila][1], libros[fila][2],
					libros[fila][3]);
		}

	}

}
