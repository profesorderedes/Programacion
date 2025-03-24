package ejemplo05Excepciones;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Programa para dividir 20 entre un nº");
		System.out.println("Escribe un nº entero: ");
		String numero = entrada.nextLine();

		// Colocamos las instrucciones que pensamos que pueden dar error
		// en el bloque try.
		try {

			int num = Integer.parseInt(numero);
			System.out.println("La división de 20 entre " + num + " es " + 20 / num);
			// Con la instrucción throw podemos lanzar la excepción que queramos para hacer
			// pruebas.
			// throw new Exception();

		} catch (NumberFormatException nfe) {

			// Este bloque catch se ejecutará si dentro del try se
			// ha producido una NumberFormatException.
			System.out.println("No se puede hacer la división. Tenías que escribir un número entero.");

			// Podemos obtener información de la variable nfe recibida en
			// el catch.
			// nfe.printStackTrace();
			// System.out.println(nfe.toString());
			System.out.println(nfe.getMessage());

		} catch (ArithmeticException ae) {

			// Este bloque catch se ejecutará si dentro del try se
			// ha producido una ArithmeticException.
			System.out.println("No se puede dividir entre cero.");

		} catch (Exception e) {

			// Este bloque catch se ejecutará si dentro del try se
			// ha producido una excepción de un tipo que no aparece
			// en los catch anteriores.
			System.out.println("Error. No se ha podido hacer la división.");

		}
		

		// Tanto si se ha producido una excepción en el try como si no,
		// el programa continúa fuera del bloque try-catch.
		System.out.println("Fin");

	}

}
