package ejer1_3;

import java.util.Scanner;

public class Ejer01 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double notas[] = new double[10];
		double total = 0;
		int numAprobados = 0;
		int numNotas = 0;
		System.out.println("Introduce tus notas. Cuando ya no haya más notas, escribe -1");

		for (int i = 0; i < notas.length; i++) {
			System.out.print("Nota " + (i + 1) + ": ");
			notas[i] = entrada.nextDouble();

			if (notas[i] == -1) {
				break;
			}

			total = total + notas[i];
			numNotas++;
			if (notas[i] >= 5) {
				numAprobados++;
			}
		}

		int posMin = 0;
		int posMax = 0;

		for (int i = 0; i < numNotas; i++) {
			if (notas[i] < notas[posMin]) {
				posMin = i;
			} else if (notas[i] > notas[posMax]) {
				posMax = i;
			}

		}

		System.out.println("\nNotas introducidas: ");

		for (int i = 0; i < numNotas; i++) {
			System.out.print(notas[i] + " ");
		}

		System.out.println("\nLa nota más baja y más alta son " + notas[posMin] + " y " + notas[posMax]);
		double mediaNotas = total / numNotas;
		System.out.println("Tu nota media ha sido: " + mediaNotas);
	}
}
