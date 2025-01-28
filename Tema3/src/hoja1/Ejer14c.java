package hoja1;

// Programa que te muestra en la terminal los números primos entre 2 y 100.
public class Ejer14c {

	public static void main(String[] args) {

		boolean esPrimo;

		System.out.println("Lista de números primos comprendidos entre 2 y 100");
		System.out.println("==================================================\n");

		// Generamos números entre 2 y 100. Para cada número,
		// comprobaremos si es primo o compuesto.
		for (int num = 2; num <= 100; num++) {

			// Comprobamos si num es primo o no.

			esPrimo = true; // Suponemos que num es primo

			// Vamos probando a dividir num entre todos los enteros entre 2
			// y num-1.
			for (int i = 2; i < num; i++) {

				// Intentamos dividir num entre i. i va a ir tomando
				// todos los valores entre 2 y num (sin incluir num).
				// Si una de las divisiones da resto 0, el número
				// automáticamente es compuesto.
				if (num % i == 0) {
					esPrimo = false;
					break;
				}

			}

			// Si, tras el bucle interno, ninguna división ha dado resto 0,
			// la variable esPrimo habrá conservado su valor inicial,
			// true.
			if (esPrimo) {
				System.out.println(num);
			}

		}

	}

}
