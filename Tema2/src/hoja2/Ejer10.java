package hoja2;

import java.util.Scanner;

public class Ejer10 {

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

		// Preguntamos al usuario y leemos su respuesta.

		System.out.println("¿Cómo se escribe 30 en hexadecimal?");
		System.out.println("\t1) 1E\n\t2) 2F\n\t3) 33\n\t4) Ninguno de los anteriores");
		System.out.print("> ");

		int choice = input.nextInt();

		// Repetimos la pregunta mientras no escriba un número válido (entre 1 y 4).
		while (choice < 1 || choice > 4) {

			System.out.println("¡Tienes que escribir un número del 1 al 4!");
			System.out.print("> ");
			choice = input.nextInt();

			System.out.println("");

		}

		// Le indicamos al usuario si ha acertado o no.
		if (choice == 1) {
			System.out.println("¡Correcto!");
		} else {
			System.out.println("¡Incorrecto!");
		}

	}

}