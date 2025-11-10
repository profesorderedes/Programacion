package hoja1;

import java.util.Scanner;

public class Ejer08 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double[] notas = new double[10];

		int i = 0;

		while (i < notas.length) {

			System.out.println("Nota " + (i + 1) + ": ");
			double nota = entrada.nextDouble();

			if (nota < 0) {
				break;
			}

			notas[i] = nota;
			i++;

		}

		System.out.println("\nRecopilación de notas: \n");

		for (i = 0; i < notas.length; i++) {
			System.out.println("> " + notas[i]);
		}

	}

}