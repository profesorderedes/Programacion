package hoja1;

// Programa que te muestra en la terminal los números primos entre 2 y 100.
public class Ejer14b {

	public static void main(String[] args) {

		boolean esPrimo;
		// Generamos números entre 2 y 100.
		for (int num = 2; num <= 100; num++) {

			System.out.println(num);

			// Comprobamos si num es primo o no.

			esPrimo = true; // Suponemos que num es primo

			// Vamos probando a dividir num entre todos los enteros entre 2
			// y num-1.
			for (int i = 2; i < num; i++) {

				System.out.println("   Probamos a dividir por " + i);

				// Intentamos dividir num entre i. i va a ir tomando
				// todos los valores entre 2 y num (sin incluir num).
				// Si una de las divisiones da resto 0, el número
				// automáticamente es compuesto.
				if (num % i == 0) {
					System.out.println("Es compuesto");
					esPrimo = false;
					break;
				}

			}

			// Si, tras el bucle interno, ninguna división ha dado resto 0,
			// la variable esPrimo habrá conservado su valor inicial,
			// true.
			if (esPrimo) {
				System.out.println("Es primo");
			}

		}

	}

}
