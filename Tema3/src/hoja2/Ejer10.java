package hoja2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		float[] temperaturas = new float[8];
		int posMin;

		for (int i = 0; i < temperaturas.length; i++) {

			System.out.print("\nDame una temperatura (ºC): ");
			temperaturas[i] = input.nextFloat();

		}

		for (int i = 0; i < temperaturas.length - 1; i++) {

			posMin = i;

			for (int j = i + 1; j < temperaturas.length; j++) {

				if (temperaturas[j] < temperaturas[posMin]) {
					posMin = j;
				}

			}

			float temp = temperaturas[posMin];
			temperaturas[posMin] = temperaturas[i];
			temperaturas[i] = temp;

			System.out.println(Arrays.toString(temperaturas));

		}

		System.out.println("\nTemperatura más alta registrada: " + temperaturas[7] + " ºC.");
		System.out.println("Temperatura más baja registrada: " + temperaturas[0] + " ºC.");

	}

}