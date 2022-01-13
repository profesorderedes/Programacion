package ejercicios2;

import java.util.Scanner;

public class Ejer22 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String alumnos[][] = new String[3][4];

		for (int fila = 0; fila < alumnos.length; fila++) {

			System.out.println("Introducción de notas; ");
			System.out.println("\n=============================");

			System.out.println("Nombre: ");
			alumnos[fila][0] = entrada.nextLine();

			System.out.println("Exámenes: ");
			alumnos[fila][1] = entrada.nextLine();

			System.out.println("Trabajos: ");
			alumnos[fila][2] = entrada.nextLine();

			System.out.println("Actitud: ");
			alumnos[fila][3] = entrada.nextLine();

		}

		System.out.println("\nNotas de evaluación;");
		System.out.println("==========================");

		for (int i = 0; i < alumnos.length; i++) {
			float total = 0;
			total = (50 * Float.parseFloat(alumnos[i][1]) 
					+ 40 * Float.parseFloat(alumnos[i][2])
					+ 10 * Float.parseFloat(alumnos[i][3])) 
						/ 100;

			System.out.println(alumnos[i][0] + ": " + total);
		}
	}

}