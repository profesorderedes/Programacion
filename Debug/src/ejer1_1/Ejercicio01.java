package ejer1_1;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float notas[] = new float[10];

		int posMin = 0;
		int posMax = 0;
		int numAprobados = 0;
		float total = 0;
		int numNotas = 0;

		System.out.println("Introduce tus notas. Cuando ya no haya más notas, escribe -1:");

		for (int i = 0; i < notas.length; i++) {

			System.out.print("Nota " + (i + 1) + ": ");
			notas[i] = entrada.nextFloat();

			if (notas[i] == -1) {
				break;
			}

			numNotas++;

			total = total + notas[i];

			if (notas[i] >= 5) {
				numAprobados++;
			}

		}

		for (int i = 0; i < notas.length; i++) {
			if (notas[i] == -1) {
				break;
			}

			if (notas[i] < notas[posMin]) {

				posMin = i;

			}

			if (notas[i] > notas[posMax]) {

				posMax = i;

			}

		}

		System.out.println("\nNotas introducidas:");
		for (int i = 0; i < notas.length; i++) {

			if (notas[i] == -1) {
				break;
			}

			System.out.print(notas[i] + " ");

		}

		System.out.println("\nNota mínima: " + notas[posMin]);
		System.out.println("Nota máxima: " + notas[posMax]);

		System.out.println("El número de aprobados es " + numAprobados);

		System.out.println("Nota media: " + (total / numAprobados));

	}

}
