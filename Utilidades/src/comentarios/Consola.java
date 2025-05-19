package comentarios;

import java.util.Iterator;

import java.util.Scanner;

/**
 * Clase que contiene métodos para leer información en la terminal.
 *
 * <p>
 * Estos métodos se aseguran de devolver valores correctos, repitiendo la
 * lectura de un dato hasta que el usuario lo escriba correctamente.
 *
 * @see net.iessonferrer.mates.Mates
 * @author Ruth Collado
 * @version 0.1
 */

public class Consola {

	/**
	 * Variable que permite acceder a la terminal del equipo.
	 */
	static private Scanner sc = new Scanner(System.in);

	/**
	 * Lee un número entero desde la consola y lo devuelve. Si lo que se escribe no
	 * es un entero mostrará mensaje de error y vuelve a repetir la lectura.
	 * 
	 * @param mensajeError Mensaje que va a mostrarse cuando el usuario escriba un
	 *                     dato que no sea entero.
	 * @return el número entero escrito por el usuario.
	 */
	public static int leerInt(String mensajeError) {

		while (!sc.hasNextInt()) {

			System.out.println(mensajeError);
			sc.nextLine();

		}

		int num = sc.nextInt();
		sc.nextLine();

		return num;

	}

	/**
	 *  Lee un número entero desde la consola y lo devuelve. Si lo que se escribe no
	 * es un entero mostrará un mensaje de error predefinido y vuelve a repetir la lectura.
	 * 
	 * @return el número entero escrito por el usuario.
	 */
	public static int leerInt() {
		return leerInt("Introduce un número entero válido.");
	}

	/**
	 * Lee un número decimal desde la consola y lo devuelve. Si lo que se escribe no
	 * es un decimal mostrará un mensaje de error y se vuelve a repetir la lectura.
	 * 
	 * @param mensajeError
	 * @return el número decimal escrito por el usuario.
	 */
	public static double leerDouble(String mensajeError) {

		while (!sc.hasNextDouble()) {

			System.out.println(mensajeError);
			sc.nextLine();

		}

		double num = sc.nextDouble();
		sc.nextLine();

		return num;

	}

	/**
	 * En caso de no querer introducir un mensaje personalizado, se muestra un
	 * mensaje de error por default.
	 * 
	 * @return el método leerDouble() con un mensaje de error por defecto.
	 */
	public static double leerDouble() {
		return leerDouble("Introduce un número decimal válido.");
	}

	/**
	 * Lee una cadena desde la consola y lo devuelve. Si el usuario solo introduce
	 * espacios o una cadena vacía, mostrará un mensaje de error y se vuelve a
	 * repetir la lectura.
	 * 
	 * @param mensajeError
	 * @return la cadena escrita por el usuario.
	 */
	public static String leerString(String mensajeError) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			boolean error = false;

			String frase = sc.nextLine();
			int contador;

			// Quita los espacios de delante y el final con trim() y luego verifica si la
			// longitud de la frase es 0 con .length.

			if (frase.trim().length() == 0) {
				System.out.println(mensajeError);

			} else {
				return frase;
			}

		}

	}

	/**
	 * En caso de no querer introducir un mensaje personalizado, se muestra un
	 * mensaje de error por default.
	 * 
	 * @return el método leerString() con un mensaje de error por defecto.
	 */
	public static String leerString() {
		return leerString("Entrada incorrecta: se esperaba algún carácter distinto de espacio.");
	}

}