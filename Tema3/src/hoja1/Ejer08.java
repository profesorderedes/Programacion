package hoja1;

import java.util.Scanner;

public class Ejer08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double[] notas = new double[10];

		int i = 0;

		while (i < notas.length) {

			System.out.println("Ingrese el valor de la nota de la materia " + (i + 1) + ":");
			notas[i] = sc.nextDouble();

			if (notas[i] < 0) {

				System.out.println("Error, número negativo.");
				break;

			}

			i++;

		}

		i = 0;

		System.out.println("\nLas notas introducidas son: ");

		while (i < notas.length) {

			System.out.print(notas[i] + ", ");
			i++;

		}

		System.out.println("\nFinalizando...");

	}

}