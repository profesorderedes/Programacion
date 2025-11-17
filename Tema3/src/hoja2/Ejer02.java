package hoja2;

import java.util.Iterator;
import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double[] alturas = new double[10];
		boolean encontrado = false;

		for (int i = 0; i < alturas.length; i++) {

			System.out.println("Introduce la altura (en metros): ");
			alturas[i] = entrada.nextDouble();

		}

		for (int i = 0; i < alturas.length; i++) {

			if (alturas[i] > 1.90) {
				System.out.println("Hay al menos una altura mayor de 1.90 metros.");
				encontrado = true;
				break;
			}

		}

		if (!encontrado) {
			System.out.println("No se ha encontrado a nadie que mida más de 1.90 m.");
		}

	}

}