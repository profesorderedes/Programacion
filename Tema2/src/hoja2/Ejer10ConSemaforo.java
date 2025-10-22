package hoja2;

import java.util.Scanner;

public class Ejer10ConSemaforo {

	public static void main(String[] args) {

// Escribe una aplicación que haga una pregunta y muestre un menú con cuatro posibles
// respuestas numeradas.

// Si el número introducido por el usuario no está entre uno y cuatro, se le volverá a repetir la pregunta
// hasta que lo esté. Finalmente se le dirá si ha acertado o fallado.
// Preguntamos al usuario y vemos su respuesta.

		Scanner entrada = new Scanner(System.in);

		boolean preguntar = false;

		System.out.println("¿Cómo se escribe 30 en hexadecimal?");
		System.out.println("\t1) 1E\n\t2) 2F\n\t3) 33\n\t4) Ninguno de los anteriores");
		int num = entrada.nextInt();

		if (num < 1 || num > 4) {

			preguntar = true;

		}

// Repetimos la pregunta mientras no escriba un numero valido.

		while (preguntar) {

			System.out.println("¡¡Solo valen números del 1 al 4!!");
			num = entrada.nextInt();

			if (num >= 1 && num <= 4) {

				preguntar = false;

			}

		}

		if (num == 1) {

			System.out.println("¡Has acertado!");
		} else {

			System.out.println("Has fallado. \n:)");
		}

	}

}