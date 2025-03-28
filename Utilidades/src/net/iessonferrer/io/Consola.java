package net.iessonferrer.io;

import java.util.Scanner;

public class Consola {

	private static Scanner sc = new Scanner(System.in);

	// Lee un número entero desde la consola y lo devuelve. Si lo que se escribe no
	// es un entero, mostrará el mensaje de error y vuelve a repetir la lectura.
	public static int leerInt(String mensajeError) {

		while (!sc.hasNextInt()) {

			System.out.println(mensajeError);
			sc.nextLine();

		}

		int num = sc.nextInt();
		sc.nextLine();

		return num;

	}

	// Lee un número entero desde la consola y lo devuelve. Si lo que se escribe no
	// es un entero, mostrará un mensaje de error genérico y vuelve a repetir la
	// lectura.
	public int leerInt() {

		return leerInt("Introduce un número entero válido.");

	}

	// Lee un número decimal desde la consola y lo devuelve. Si lo que se escribe no
	// es un número, mostrará el mensaje de error y vuelve a repetir la lectura.
	public static double leerDouble(String mensajeError) {

		while (!sc.hasNextDouble()) {

			System.out.println(mensajeError);
			sc.nextLine();

		}

		double num = sc.nextDouble();
		sc.nextLine();

		return num;
	}

	// Lee un número decimal desde la consola y lo devuelve. Si lo que se escribe no
	// es un número, mostrará un mensaje de error genérico y vuelve a repetir la
	// lectura.
	public double leerDouble() {
		return leerDouble("Introduce un número válido");
	}

}