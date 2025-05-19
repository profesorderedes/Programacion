package comentarios;

import java.util.Scanner;

/**
 * Clase que contiene métodos para leer información de la terminal
 * 
 * <p>
 * Estos métodos se aseguran de devolver valores correctos, repitiendo la
 * lectura de un dato hasta que el usuario lo escriba correctamente.
 * 
 * @see net.iessonferrer.mates.Mates
 * @author David Fernández
 * @version 0.1
 */

public class Consola2 {

	/**
	 * Variable que permite acceder a la terminal del equipo
	 */
	private static Scanner sc = new Scanner(System.in);

	/**
	 * Lee un número entero desde la consola y lo devuelve. Si lo que se escribe no
	 * es un entero, mostrará el mensaje de error y vuelve a repetir la lectura.
	 * 
	 * @param mensajeError Mensaje que va a mostrarse cuando el usuario escriba un
	 *                     dato que no sea entero
	 * @return el número entero escrito por el usuario
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
	 * Lee un número entero desde la consola y lo devuelve. Si lo que se escribe no
	 * es un entero, mostrará un mensaje de error genérico y vuelve a repetir la
	 * lectura.
	 * 
	 * @return el número entero escrito por el usuario.
	 */
	public static int leerInt() {

		return leerInt("Introduce un número entero válido.");

	}

	/**
	 * Lee un número decimal desde la consola y lo devuelve. Si lo que se escribe no
	 * es un número, mostrará el mensaje de error y vuelve a repetir la lectura.
	 * 
	 * @param mensajeError error que se mostrará al no escribir un decimal
	 * @return el número decimal introducido
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
	 * Lee un número decimal desde la consola y lo devuelve. Si lo que se escribe no
	 * es un número, mostrará un mensaje de error genérico y vuelve a repetir la
	 * lectura.
	 * 
	 * @return frase introducida por el usuario.
	 */
	public static double leerDouble() {
		return leerDouble("Introduce un número válido");
	}

	/**
	 * Lee un String desde la consola y lo devuelve. En caso de que el String esté
	 * vacío o sólo tenga espacios, muestra el mensaje de error y repite la
	 * pregunta.
	 * 
	 * @param mensajeError error producido al escribrir numeros en vez de letras
	 * @return frase introducida por el usuario
	 */
	public static String leerString(String mensajeError) {

		while (true) {

			String frase = sc.nextLine();

			if (frase.trim().length() == 0) {
				System.out.println(mensajeError);
			} else {
				return frase;
			}
		}

	}

	/**
	 * Lee un String desde la consola y lo devuelve. En caso de que el String esté
	 * vacío o sólo tenga espacios, muestra un mensaje de error estándar y repite la
	 * pregunta.
	 * 
	 * @return mensaje de error al poner un espacio.
	 */
	public static String leerString() {

		return leerString("Entrada incorrecta: se esperaba algún carácter distinto de espacio.");

	}

}