package hoja2Bucles;

import java.util.Scanner;

public class Ejer14 {
	public static void main(String[] args) {
		/*
		 * Trivial. Escribe una aplicación que haga una pregunta y muestre un menú con
		 * cuatro posibles respuestas numeradas. Por ejemplo:
		 *
		 * ¿Quién es el autor de la novela "Ready Player One"? 1)Douglas Capland 2)Isaac
		 * Asimov 3)Ernest Cline 4)Ray Bradbury
		 *
		 * Si el número introducido por el usuario no está entre uno y cuatro, se le
		 * volverá a repetir la preguntahasta que lo esté. Finalmente se le dirá si ha
		 * acertado o fallado. Utiliza un bucle do-while.
		 */
		Scanner entrada = new Scanner(System.in);
		int respuesta;
		do {
			System.out.println("¿Quién es el autor de la novela \"Ready Player One\"?");
			System.out.println("1)Douglas Capland");
			System.out.println("2)Isaac Asimov");
			System.out.println("3)Ernest Cline");
			System.out.println("4)Ray Bradbury");
			respuesta = entrada.nextInt();
		} while (respuesta < 1 || respuesta > 4);

		if (respuesta == 3) {
			System.out.println("¡Has acertado!");
		} else {
			System.out.println("¡Has fallado!");
		}

		entrada.close();
	}

}