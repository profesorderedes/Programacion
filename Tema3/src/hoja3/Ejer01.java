package hoja3;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String libros[][] = new String[5][4];

		for (int fila = 0; fila < libros.length; fila++) {

			System.out.print("ISBN: ");
			libros[fila][0] = entrada.nextLine();

			System.out.print("Título: ");
			libros[fila][1] = entrada.nextLine();

			System.out.print("Autor: ");
			libros[fila][2] = entrada.nextLine();

			System.out.print("Editorial: ");
			libros[fila][3] = entrada.nextLine();

		}

		System.out.println("ISBN\tTítulo\tAutor\tEditorial\n==================================");

		for (int fila = 0; fila < libros.length; fila++) {

			for (int col = 0; col < libros[col].length; col++) {
				System.out.print(libros[fila][col] + "\t");
			}

			System.out.println();

		}

	}

}