package hoja2;

import java.util.Scanner;

public class Ejer22 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String alumnos[][] = new String[3][4];

		System.out.println("Introducción de notas");
		System.out.println("=======================================");

		for (int fila = 0; fila < alumnos.length; fila++) {

			System.out.print("Nombre: ");
			alumnos[fila][0] = entrada.nextLine();

			System.out.print("Exámenes: ");
			alumnos[fila][1] = entrada.nextLine();

			System.out.print("Trabajos: ");
			alumnos[fila][2] = entrada.nextLine();

			System.out.print("Actitud: ");
			alumnos[fila][3] = entrada.nextLine();

		}

		double media = 0;

		System.out.println("Nota de evaluación");
		System.out.println("========================================");

		for (int fila = 0; fila < alumnos.length; fila++) {

			media = (50 * Double.parseDouble(alumnos[fila][1]) 
					+ 40 * Double.parseDouble(alumnos[fila][2])
					+ 10 * Double.parseDouble(alumnos[fila][3])) / 100;

			System.out.println(alumnos[fila][0] + ": " + media);

		}

	}

}