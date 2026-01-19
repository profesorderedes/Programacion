package utilidades;

import java.util.Scanner;

public class Consola {

	private static Scanner entrada = new Scanner(System.in);

	public static int leerInt(String mensajeError) {

		while (!entrada.hasNextInt()) {

			System.out.println(mensajeError);
			entrada.nextLine();

		}

		int num = entrada.nextInt();

		entrada.nextLine();

		return num;
	}

	public static int leerInt() {

		return leerInt("Entrada incorrecta: se esperaba un número entero.");
	}

	public static int leerInt(String mensajeError, int min, int max) {

		int num;

		do {

			num = leerInt(mensajeError);

			if (num < min || num > max) {
				System.out.println("El número no puede ser menor que " + min + " ni mayor que " + max + ".");
			}

		} while (num < min || num > max);

		return num;
	}

	public static double leerDouble(String mensajeError) {

		while (true) {

			if (!entrada.hasNextDouble()) {

				System.out.println(mensajeError);
				entrada.nextLine();
			} else {

				double num = entrada.nextDouble();
				entrada.nextLine();
				return num;
			}
		}
	}

	public static double leerDouble() {

		return leerDouble("Entrada incorrecta: se esperaba un número.");
	}

	public static String leerString() {
		
		return entrada.nextLine();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
