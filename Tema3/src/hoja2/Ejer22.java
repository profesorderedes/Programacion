package hoja2;

import java.util.Scanner;

public class Ejer22 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String[][] alumnos = new String[3][4];

		for (int fila = 0; fila < alumnos.length; fila++) {

			System.out.println();

			System.out.print("Nombre: ");
			alumnos[fila][0] = entrada.nextLine();

			System.out.print("Nota de éxamenes: ");
			alumnos[fila][1] = entrada.nextLine();

			System.out.print("Nota de trabajos: ");
			alumnos[fila][2] = entrada.nextLine();

			System.out.print("Nota de actitud: ");
			alumnos[fila][3] = entrada.nextLine();

		}

		System.out.println("\nNotas de evaluación");
		System.out.println("=======================================");

		for (int fila = 0; fila < alumnos.length; fila++) {

			System.out.println();

			String nombre = alumnos[fila][0];

			double examen = Double.parseDouble(alumnos[fila][1]);
			double trabajo = Double.parseDouble(alumnos[fila][2]);
			double actitud = Double.parseDouble(alumnos[fila][3]);

			double notaFinal = (examen * 0.6) + (trabajo * 0.3) + (actitud * 0.1);

			System.out.println("La nota final de " + nombre + " es un " + notaFinal + ".");

		}

	}

}