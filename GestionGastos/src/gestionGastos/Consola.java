package completo.gestionGastos.parteF;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * Clase que contiene métodos estáticos para una lectura fácil de la terminal.
 * 
 * @author Carlos Sogorb
 * @version 0.2
 */
public class Consola {

	private static Scanner entrada = new Scanner(System.in, StandardCharsets.UTF_8);

	// Lee un número entero desde la terminal y lo devuelve. Si lo que se introduce
	// no es un entero, muestra el mensaje de error que se le ha pasado como
	// parámetro.
	public static int leerInt(String mensajeError) {

		while (!entrada.hasNextInt()) {
			System.out.println(mensajeError);
			entrada.nextLine();
		}

		int num = entrada.nextInt();

		entrada.nextLine();

		return num;

	}

	// Lee un número entero desde la terminal y lo devuelve. Si lo que se introduce
	// no es un entero, muestra un mensaje de error estándar: "Entrada incorrecta:
	// se esperaba un número entero.".
	public static int leerInt() {

		return leerInt("Entrada incorrecta: se esperaba un número entero.");

	}

	// Lee un número entero desde la terminal y lo devuelve. Si lo que se introduce
	// no es un entero, o es un entero fuera del rango indicado [min, max], muestra
	// el mensaje de error que se le ha pasado como parámetro.
	public static int leerInt(String mensajeError, int min, int max) {

		int num;

		while (true) {

			while (!entrada.hasNextInt()) {
				System.out.println(mensajeError);
				entrada.nextLine();
			}

			num = entrada.nextInt();

			entrada.nextLine();

			if (num >= min && num <= max) {
				break;
			}

			System.out.println(mensajeError);

		}

		return num;

	}

	// Lee un número decimal desde la terminal y lo devuelve. Si lo que se introduce
	// no es un número, muestra el mensaje de error que se le ha pasado como
	// parámetro.
	public static double leerDouble(String mensajeError) {

		while (!entrada.hasNextDouble()) {
			System.out.println(mensajeError);
			entrada.nextLine();
		}

		double num = entrada.nextDouble();

		entrada.nextLine();

		return num;

	}

	// Lee un número decimal desde la terminal y lo devuelve. Si lo que se introduce
	// no es un número, muestra un mensaje de error estándar: "Entrada incorrecta:
	// se esperaba un número.".
	public static double leerDouble() {

		return leerDouble("Entrada incorrecta: se esperaba un número.");

	}

	// Lee una cadena de texto (no vacía) desde la terminal y la devuelve. Si la
	// cadena está vacía o sólo contiene espacios, muestra el mensaje de error que
	// se le ha pasado como parámetro.
	public static String leerString(String mensajeError) {

		String cadena = entrada.nextLine();

		while (cadena.trim().equals("")) {
			System.out.println(mensajeError);
			cadena = entrada.nextLine();
		}

		return cadena;

	}

	// Lee una cadena de texto (no vacía) desde la terminal y la devuelve. Si la
	// cadena está vacía o sólo contiene espacios, muestra un mensaje de error
	// estándar: "Entrada incorrecta: se esperaba algún carácter distinto de
	// espacio.".
	public static String leerString() {
		return leerString("Entrada incorrecta: se esperaba algún carácter distinto de espacio.");
	}
}
