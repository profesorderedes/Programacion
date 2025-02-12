package ejer1_6;

import java.util.Scanner;

public class Ejer01 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double[] notas = new double[10];

		int posMin = 0;
		int posMax = 0;
		int numNotas = 0;
		int aprobado = 0;
		double total = 0;

		System.out.println("Introduce tus notas. Cuando ya no haya más notas, escribe -1:");

		for (int i = 0; i < notas.length; i++) {

			System.out.print("Nota " + (i + 1) + ":");
			notas[i] = entrada.nextDouble();

			if (notas[i] == -1) {
				break;
			}

			numNotas++;

			if (notas[i] < notas[posMin]) {
				posMin = i;
			} else if (notas[i] > notas[posMax]) {
				posMax = i;
			}
			total = total + notas[i];

		}

		for (int i = 0; i < numNotas; i++) {

			if (notas[i] >= 5) {
				aprobado++;
			}
		}

		System.out.println("\nNotas introducidas:");
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] == -1) {
				break;
			}
			System.out.print(notas[i] + " ");

		}

		System.out.println(
				"\n\nLas notas más baja y más alta son " + notas[posMin] + " " + notas[posMax] + ", respectivamente.");

		System.out.println("\nHas aprobado " + aprobado + " exámenes.");

		System.out.println("\nTu nota media ha sido: " + total / numNotas);

	}
}
