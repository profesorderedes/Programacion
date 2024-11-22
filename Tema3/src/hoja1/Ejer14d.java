package hoja1;

// Programa que te muestra en la terminal los 100 primeros números primos.
public class Ejer14d {

	public static void main(String[] args) {

		boolean esPrimo;
		int contadorPrimos = 1;
		
		System.out.println("Lista de los 100 primeros números primos");
		System.out.println("========================================\n");

		// Generamos números entre 2 y 100. Para cada número,
		// comprobaremos si es primo o compuesto.
		int num = 2;
		while(contadorPrimos <= 100) {

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
				System.out.println(contadorPrimos + ") "  + num);
				contadorPrimos++;
			}
			
			num++;

		}
	}
}
