package ejer1_2;

import java.util.Scanner;

public class Actividad01 {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que pida una serie de notas (hasta diez) y las almacene
		 * en un array de diez posiciones llamado notas. Si el número de notas es menor
		 * de diez, se escribirá -1, para terminar la introducción.
		 */

		Scanner sc = new Scanner(System.in);
		double[] notas = new double[10];
		double nota = 0;
		int examenAprobado = 0;
		double suma = 0;
		int numNotas = 0;

		System.out.println("Introduce tus notas. Cuando ya no haya más notas, escribe -1:");

		for (int i = 0; i < notas.length; i++) {

			System.out.print("Nota " + (i + 1) + ": ");
			notas[i] = sc.nextDouble();

			if (notas[i] == -1) {
				break;
			}

			numNotas++;

			if (notas[i] >= 5) {
				examenAprobado++;
			}

			suma = suma + notas[i];

		}

		System.out.println("\nNotas introducidas:");

		for (int i = 0; i < notas.length; i++) {
			if (notas[i] == -1) {
				break;
			}

			System.out.print(notas[i] + " ");
		}

		System.out.println();

		int min = 0;
		int max = 0;

		for (int i = 1; i < notas.length; i++) {

			if (notas[i] == -1) {
				break;
			}

			if (notas[i] < notas[min]) {
				min = i;
			} else if (notas[i] > notas[max]) {
				max = i;
			}

		}

		System.out
				.println("\nLa nota más baja y más alta son " + notas[min] + " y " + notas[max] + ", respectivamente.");

		System.out.println("\nHas aprobado " + examenAprobado + " exámenes.");

		System.out.println("\nTu nota media ha sido: " + suma / numNotas);

	}

}
