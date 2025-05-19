package comentarios;

import java.util.Scanner;

/**
 * 
 * Clase que contiene metodos para leer informacion de la terminal.
 * <p>
 * 
 * Estos metodos se aseguran de devolver valores correctos , repitiendo la
 * lectura hasta que el usuario lo escriba correctamente.
 *
 * @see net.iessonferrer.mates.Mates
 * @author Yago Lopez
 * @version 0.1
 */
public class Consola3 {

	/**
	 * 
	 * Variable que permite acceder a la terminal del equipo.
	 * 
	 */
	private static Scanner sc = new Scanner(System.in);

	/**
	 * 
	 * Lee un número entero desde la consola y lo devuelve. Si lo que se escribe no
	 * es un entero, mostrará el mensaje de error y vuelve a repetir la lectura.
	 * 
	 * @param mensajeError Mensaje que va a mostrarse cuando el usuario escriba un
	 *                     dato que no sea entero
	 * 
	 * @return el numero entero escrito por el usuario
	 * 
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
	 * 
	 * Lee un número entero desde la consola y lo devuelve. Si lo que se escribe no
	 * es un entero, mostrará un mensaje de error genérico y vuelve a repetir la
	 * lectura.
	 * 
	 * @return el numero entero escrito por el usuario
	 * 
	 */
	public static int leerInt() {

		return leerInt("Introduce un número entero válido.");

	}

	/**
	 * Lee un número decimal desde la consola y lo devuelve. Si lo que se escribe no
	 * es un número, mostrará el mensaje de error y vuelve a repetir la lectura.
	 * 
	 * @param mensajeError Mensaje que se mostrara si el usuario introduce un dato
	 *                     incorrecto
	 * 
	 * @return el numero decimal escrito por el usuario
	 * 
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
	 * 
	 * Lee un número decimal desde la consola y lo devuelve. Si lo que se escribe no
	 * es un número, mostrará un mensaje de error genérico y vuelve a repetir la
	 * lectura.
	 * 
	 * @return el numero decimal escrito por el usuario
	 * 
	 */
	public static double leerDouble() {

		return leerDouble("Introduce un número válido");

	}

	/**
	 * Lee un String desde la consola y lo devuelve. En caso de que el String esté
	 * vacío o sólo tenga espacios, muestra el mensaje de error y repite la
	 * pregunta.
	 * 
	 * @param mensajeError Mensaje que se mostrara si el usuario introduce un dato
	 *                     incorrecto
	 * 
	 * @return la cadena escrita por el usuario
	 * 
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
	 * 
	 * Lee un String desde la consola y lo devuelve. En caso de que el String esté
	 * vacío o sólo tenga espacios, muestra un mensaje de error estándar y repite la
	 * pregunta.
	 * 
	 * @return la cadena escrita por el usuario
	 * 
	 */
	public static String leerString() {

		return leerString("Entrada incorrecta: se esperaba algún carácter distinto de espacio.");

	}

}