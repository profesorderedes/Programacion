package ejemplo05Excepciones;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Programa para dividir 20 entre un nº");
		System.out.println("Escribe un nº entero: ");
		String numero = entrada.nextLine();

		try {

			int num = Integer.parseInt(numero);
			System.out.println("La división de 20 entre " + num + " es " + 20 / num);

		} catch (NumberFormatException | ArithmeticException ex) {

			System.out.println("No se puede hacer la división. Tenías que escribir un número entero distinto de cero.");
			return;

		} catch (Exception e) {

			System.out.println("Error. No se ha podido hacer la división.");

		} finally {

			// Ocurra lo que ocurra en el try, este bloque finally se va a
			// ejecutar. Da igual si se produce una excepción o no.
			System.out.println("Esta instrucción está dentro del finally y se va a ejecutar sí o sí.");

		}

		System.out.println("Fin");

	}

}
