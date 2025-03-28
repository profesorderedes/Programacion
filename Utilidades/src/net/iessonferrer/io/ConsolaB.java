package net.iessonferrer.io;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsolaB {
	private static Scanner entrada = new Scanner(System.in);

	public static int leerInt(String mensajeError) {

		while (true) {

			try {
				int edad = entrada.nextInt();
				return edad;
			} catch (InputMismatchException ime) {
				System.out.println(mensajeError);
				entrada.nextLine();
			}

		}

	}

	public int leerInt() {

		return leerInt("Introduce un número entero válido.");

	}
	
	public static double leerDouble(String mensajeError) {
		
		while (true) {
			try {
				return Double.parseDouble(entrada.nextLine());
			} catch (NumberFormatException nfe) {
				System.out.println(mensajeError);
			}
		}
	}

	public static double leerDouble() {
		return leerDouble("Introduce un numero entero válido.");
	}
}