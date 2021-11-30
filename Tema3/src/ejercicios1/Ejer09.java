package ejercicios1;

import java.util.Scanner;

public class Ejer09 {

	public static void main(String[] args) {
		// Escribe un programa que lea desde la consola el enunciado de una pregunta y
		// las cuatro posibles
		// respuestas, guardando los cinco valores en un array llamado test. A
		// continuaci�n los mostrar� c�mo
		// si fuera una pregunta de tipo test. Por ejemplo:

		Scanner entrada = new Scanner(System.in);

		String test[] = new String[5];

		System.out.println("Introduce un enunciado");
		test[0] = entrada.nextLine();

		for (int i = 1; i < test.length; i++) {

			System.out.println("Introduce una respuesta.");
			test[i] = entrada.nextLine();

		}

		System.out.println(test[0]);
		System.out.println("a) " + test[1]);
		System.out.println("b) " + test[2]);
		System.out.println("c) " + test[3]);
		System.out.println("d) " + test[4]);

	}

}