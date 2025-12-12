package hoja1;

import java.util.Arrays;

// Programa que rellene un array llamado primos con los 100 primeros números primos.

public class Ejer14d {

	public static void main(String[] args) {

		int[] primos = new int[100];
		
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
				primos[numPrimos] = num;
				numPrimos++;
			}

			num++;

		} while (numPrimos < 100);
		
		System.out.println("Primeros 100 primos: " + Arrays.toString(primos));

	}

}