package hoja2;

import java.util.Scanner;

public class Ejer02b {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double[] alturas = new double[10];
		int altura190 = 0;

		for (int i = 0; i < alturas.length; i++) {

			System.out.println("Introduce la altura (en metros): ");
			alturas[i] = entrada.nextDouble();

			if (alturas[i] > 1.90) {
				altura190++;
			}

		}

		System.out.println("Hay " + altura190 + " personas que superan el 1.90 metros.");

	}

}