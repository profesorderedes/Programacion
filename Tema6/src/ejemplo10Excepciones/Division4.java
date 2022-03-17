package ejemplo10Excepciones;

import java.util.Scanner;

public class Division4 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime un número y dividiré 20 " + "entre él");
		System.out.print("Número: ");

		String numero = entrada.nextLine();

		dividir(numero);

	}

	public static void dividir(String numero) {

		// Abrimos un bloque try{} antes de las instrucciones
		// que sabemos que pueden dar error.
		try {

			// Si numero es una cadena que no puede convertirse
			// a entero, se lanzará una excepción de tipo
			// NumberFormatException. El programa saltará al
			// catch correspondiente.
			int num = Integer.parseInt(numero);

			// Si num es cero, al dividir se lanzará una
			// excepción de tipo ArithmeticException.
			// El programa saltará al catch correspondiente.
			System.out.println("\nLa división de 20 entre " + num + " da " + 20 / num);

			return;

		} catch (NumberFormatException ex) {

			// Si ha ocurrido una excepción de tipo
			// NumberFormatException, se mostrará el siguiente
			// mensaje.
			System.out.println("¡Debes introducir un número " + "entero!");

		} catch (ArithmeticException ex) {

			// Si ha ocurrido una excepción de tipo
			// ArithmeticException, se mostrará el siguiente
			// mensaje.
			System.out.println("¡No se puede dividir entre 0!");

		} catch (Exception ex) {

			// Si ocurriera una excepción distinta de las dos
			// anteriores, se mostraría el siguiente mensaje
			// genérico.
			System.out.println("Se ha producido un error " + "indeterminado.");

		} finally {

			// Las instrucciones que estén dentro del
			// bloque finally siempre se ejecutarán,
			// tanto si se ha producido una excepción
			// como si no. Incluso aunque hubiera un return
			// antes del finally.
			System.out.println("Gracias por dividir.");

		}

	}

}
