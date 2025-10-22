package hoja2;

import java.util.Scanner;

public class Ejer10c {

	public static void main(String[] args) {

// Trivial. Escribe una aplicación que haga una pregunta y muestre un menú con
// cuatro posibles respuestas numeradas. Por ejemplo:
// ¿Cómo se escribe 30 en hexadecimal?
// 1) 1E
// 2) 2F
// 3) 33
// 4) Ninguno de los anteriores.

// Si el número introducido por el usuario no está entre uno y cuatro, se le volverá a repetir la pregunta
// hasta que lo esté. Finalmente se le dirá si ha acertado o fallado

		Scanner input = new Scanner(System.in);

		boolean unoAlCuatro = false;

		System.out.println("¿Cómo se escribe 30 en hexadecimal?");
		System.out.println("\t1) 1E\n\t2) 2F\n\t3) 33\n\t4) Ninguno de los anteriores");

		int choice = 1;

		do {

			System.out.print("> ");
			choice = input.nextInt();

			if (choice < 1 || choice > 4) {

				System.out.println("\nEso no es una opción válida.");

			} else {

				unoAlCuatro = true;

			}

		} while (unoAlCuatro != true);

		if (choice == 1) {

			System.out.println("\nCorrecto!");

		} else {

			System.out.println("\nIncorrecto!");

		}

	}

}