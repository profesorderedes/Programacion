package hoja1;

// Programa que nos calcula los primeros 100 números primos.

public class Ejer14c {

	public static void main(String[] args) {

		int numPrimos = 0;
		int num = 2;

		do {

			boolean numeroPrimo = true;

			for (int i = 2; i < num; i++) {

				if (num % i == 0) {
					numeroPrimo = false;
					break;
				}

			}

			if (numeroPrimo) {
				System.out.println("Primo nº " + (numPrimos + 1) + ": " + num);
				numPrimos++;
			}

			num++;

		} while (numPrimos < 100);

	}

}