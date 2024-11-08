package hoja1;

import java.util.Scanner;

public class Ejer07 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double[] notas = new double[10];
		int i = 0;

		while (i < notas.length) {

			System.out.print("Introduce la nota " + i + ": ");
			notas[i] = entrada.nextDouble();
			i++;

		}

		i = 0;

		while (i < notas.length) {

			System.out.println(notas[i]);
			i++;

		}

	}

}
