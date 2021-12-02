package ejercicios1;

/*
 * Programa que va obteniendo los 100 primeros números primos.
 */
public class Ejer14d {

	public static void main(String[] args) {

		boolean esPrimo = true;

		System.out.println("Lista de números primos");
		System.out.println("=======================");

		// candidato es el número que vamos a comprobar si es primo.
		for (int candidato = 2; candidato <= 100; candidato++) {

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
				System.out.println(candidato);
			}

		}

	}

}
