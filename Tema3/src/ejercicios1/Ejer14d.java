package ejercicios1;

/*
 * Programa que va obteniendo los 100 primeros números primos.
 */
public class Ejer14d {

	public static void main(String[] args) {

		boolean esPrimo = true;
		int numPrimos = 0; // Número de primos encontrados

		System.out.println("Lista de números primos");
		System.out.println("=======================");

		// candidato es el número que vamos a comprobar si es primo.

		int candidato = 2;

		while (numPrimos < 100) {

			// Para cada número candidato a ser primo, empezamos
			// suponiendo que lo es.
			esPrimo = true;

			// Si candidato es primo, lo mostramos.
			for (int i = 2; i < candidato; i++) {

				if (candidato % i == 0) {
					esPrimo = false;
					break;
				}

			}

			if (esPrimo) {
				System.out.println(numPrimos + ") " + candidato);
				numPrimos++;
			}

			candidato++;
		}

	}

}
