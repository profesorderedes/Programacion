package hoja2;

import java.util.Scanner;

public class Ejer14 {

	public static void main(String[] args) {

		// Trivial. Escribe una aplicación que haga una pregunta y muestre un menú con
		// cuatro posibles respuestas numeradas. Por ejemplo:

		Scanner sc = new Scanner(System.in);

		int respuesta;

		do {

			System.out.println(
					"¿Quién es el autor de la novela Ready Player One ?\n 1) Douglas Capland\n 2) Isaac Asimov\n 3) Ernest Cline\n 4) Ray Bradbury");
			respuesta = sc.nextInt();

		} while (respuesta < 1 || respuesta > 4);

		if (respuesta != 3) {

			System.out.println("Incorrecto");

		} else {
			System.out.println("Correcto");
		}

	}

}