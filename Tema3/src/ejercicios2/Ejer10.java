package ejercicios2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		float temperaturas[] = new float[8];
		int posMin;
		float aux;

		// Leemos las temperaturas.

		for (int i = 0; i < temperaturas.length; i++) {
			System.out.print("Temperatura: ");
			temperaturas[i] = entrada.nextFloat();
		}

		System.out.println(Arrays.toString(temperaturas));

		// Ordenamos el array.

		for (int i = 0; i < temperaturas.length - 1; i++) {

			posMin = i;
			for (int j = i + 1; j < temperaturas.length; j++) {

				if (temperaturas[j] < temperaturas[posMin]) {

					posMin = j;

				}

			}

			aux = temperaturas[posMin];
			temperaturas[posMin] = temperaturas[i];
			temperaturas[i] = aux;

			// Para ver cómo va quedando el array.
			System.out.println(Arrays.toString(temperaturas));

		}

		// Mostramos el contenido del array usando la clase
		// Arrays.
		System.out.println("\nLas temperaturas, de menor a mayor, son:");
		System.out.println(Arrays.toString(temperaturas));

		// Indicamos la mínima y máxima temperatura.
		System.out.print("\nTemperatura mínima: " + temperaturas[0]);
		System.out.print("\nTemperatura máxima: " + temperaturas[temperaturas.length - 1]);

	}

}
