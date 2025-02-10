package ejer1_4;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float[] notas = new float[10];

		int max = 0;
		int min = 0;
		float total = 0;
		int numNotas = 0;
		int aprobados = 0;

		System.out.println("Introduce tus notas. Cuando ya no haya más notas, escribe -1:");

		for (int i = 0; i < notas.length; i++) {
			System.out.print("Nota " + (i + 1) + ": ");
			notas[i] = entrada.nextFloat();

			if (notas[i] == -1) {
				break;
			}

			total += notas[i];
			numNotas++;

		}

		System.out.println("\nNotas introducidas:");
		for (int i = 0; i < notas.length; i++) {

			if (notas[i] == -1) {
				break;
			}

			if (notas[i] < notas[min]) {
				min = i;
			} else if (notas[i] > notas[max]) {
				max = i;
			}

			if (notas[i] >= 5 && notas[i] <= 10) {
				aprobados++;
			}

			System.out.print(notas[i] + " ");
		}

		System.out.println(
				"\n\nLas notas más baja y más alta son " + notas[min] + " y " + notas[max] + ", respectivamente.");
		System.out.println("\nHas aprobado " + aprobados + " exámenes.");
		System.out.println("\nTu nota media ha sido: " + (total / numNotas));

	}

}
