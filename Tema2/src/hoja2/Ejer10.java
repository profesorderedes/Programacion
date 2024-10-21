package hoja2;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Consideramos un número válido si está entre 1 y 4.
		boolean numeroValido = false;

		// Este bucle repite la pregunta hasta que el usuario escriba un
		// número entre 1 y 4.
		int respuesta = 0;
		while (!numeroValido) {

			System.out.println(
					"¿Cómo se escribe 30 en hexadecimal?" + "\n1) 1E \n2) 2F \n3) 33 \n4) Ninguno de los anteriores.");
			respuesta = entrada.nextInt();

			if (respuesta >= 1 && respuesta <= 4) {
				numeroValido = true;
			}

		}

		// Comprobamos si la respuesta ha sido correcta.
		if (respuesta == 1) {
			System.out.println("Has acertado.");
		} else {
			System.out.println("Has fallado. La respuesta era 1E.");
		}

	}

}
