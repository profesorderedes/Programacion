package gestionGastos;

import java.util.Scanner;

/**
 * Clase que contiene métodos útiles para leer datos de la terminal.
 * 
 * @author Primero de DAW
 * @version 0.1
 */
public class Consola {

	/**
	 * Variable que nos sirve para leer desde la terminal.
	 */
	private static Scanner entrada = new Scanner(System.in);

	/**
	 * Lee un número entero escrito por terminal. Muestra el mensaje de error
	 * recibido como parámetro, y repite el proceso, mientras el usuario no escriba
	 * un número entero.
	 * 
	 * @param mensajeError Mensaje que aparece cuando el usuario escribe algo
	 *                     distinto a un número entero.
	 * @return El número introducido por el usuario.
	 */
	public static int leerInt(String mensajeError) {

		while (!entrada.hasNextInt()) {

			System.out.println(mensajeError);
			entrada.nextLine();

		}

		int num = entrada.nextInt();

		entrada.nextLine();

		return num;
	}

	/**
	 * Lee un número entero escrito por terminal. Muestra un mensaje de error
	 * predeterminado, y repite el proceso, mientras el usuario no escriba un número
	 * entero.
	 * 
	 * @return El número introducido por el usuario.
	 */
	public static int leerInt() {

		return leerInt("Entrada incorrecta: se esperaba un número entero.");
	}

	/**
	 * Lee un número entero escrito por terminal. Muestra el mensaje de error
	 * recibido como parámetro, y repite el proceso, mientras el usuario no escriba
	 * un número entero comprendido entre los valores min y max (recibidos como
	 * parámetros).
	 * 
	 * @param mensajeError Mensaje que aparece cuando el usuario escribe algo
	 *                     distinto a un número entero comprendido entre los valores
	 *                     min y max.
	 * @param min          Valor mínimo que puede tomar el número leído.
	 * @param max          Valor máximo que puede tomar el número leído.
	 * @return El número introducido por el usuario.
	 */
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

	/**
	 * Lee un número escrito por terminal. Muestra el mensaje de error recibido como
	 * parámetro, y repite el proceso, mientras el usuario no escriba un número.
	 * 
	 * @param mensajeError Mensaje que aparece cuando el usuario escribe algo
	 *                     distinto a un número.
	 * @return El número introducido por el usuario.
	 */
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

	/**
	 * Lee un número escrito por terminal. Muestra un mensaje de error
	 * predeterminado, y repite el proceso, mientras el usuario no escriba un
	 * número.
	 * 
	 * @return El número introducido por el usuario.
	 */
	public static double leerDouble() {

		return leerDouble("Entrada incorrecta: se esperaba un número.");
	}

	/**
	 * Lee una cadena escrita por terminal. Muestra un mensaje de error
	 * predeterminado, y repite el proceso, mientras el usuario no escriba nada o
	 * sólo escriba espacios.
	 * 
	 * @return La cadena introducida por el usuario.
	 */
	public static String leerString() {

		String cadena = entrada.nextLine();

		while (cadena.trim().equals("")) {
			System.out.println("Entrada incorrecta: se esperaba alguna cadena no vacía.");
			cadena = entrada.nextLine();
		}

		return cadena;
	}

}
