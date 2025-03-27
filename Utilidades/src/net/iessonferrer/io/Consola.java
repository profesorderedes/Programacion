package net.iessonferrer.io;

import java.util.Scanner;

public class Consola {

	private static Scanner sc = new Scanner(System.in);

	public static int leerInt(String mensajeError) {

		while (!sc.hasNextInt()) {

			System.out.println(mensajeError);
			sc.nextLine();

		}

		int num = sc.nextInt();
		sc.nextLine();

		return num;

	}

	public int leerInt() {

		return leerInt("Introduce un número entero válido.");

	}

}