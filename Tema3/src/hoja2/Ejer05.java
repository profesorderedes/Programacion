package hoja2;

import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		double[] temperaturas = { 15, 16.1, 16, 15.4, 15, 14, 10.2, 11, 11.5, 10, 10.1, 9.8, 9, 6 };
		double min = temperaturas[0];
		int posMin = 0;

		double max = temperaturas[0];
		int posMax = 0;

		for (int i = 1; i < temperaturas.length; i++) {

			if (temperaturas[i] < min) {
				min = temperaturas[i];
				posMin = i;
			} else if (temperaturas[i] > max) {
				max = temperaturas[i];
				posMax = i;
			}

		}

		System.out.println("La temperatura mínima es " + min + "ºC. En la posición " + posMin + ".");
		System.out.println("La temperatura máxima es " + max + "ºC. En la posición " + posMax + ".");

	}

}