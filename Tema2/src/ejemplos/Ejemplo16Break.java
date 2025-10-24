package ejemplos;

import java.util.Scanner;

public class Ejemplo16Break {

	public static void main(String[] args) {

		// Programa que pregunta diez números pero termina si el número escrito
		// es 0.

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe diez números, por favor:");
		for (int i = 1; i <= 10; i++) {

			System.out.print("Número " + i + ": ");
			int num = entrada.nextInt();

			// Si num es cero, terminamos el bucle inmediatamente.
			if (num == 0) {
				break;
			}

		}

		System.out.println("Gracias por escribir estos números.");

	}

}
