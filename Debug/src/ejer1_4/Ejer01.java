package ejer1_4;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float[] notas = new float[10];

		float max = 0;
		float min = 0;
		float total = 0;
		float media = 0;
		int aprobados = 0;

		System.out.println("Introduce tus notas. Cuando ya no haya más notas, escribe -1:");

		for (int i = 0; i < notas.length; i++) {
			System.out.print("Nota " + (i + 1) + ": ");
			notas[i] = entrada.nextFloat();

			if (notas[i] < 0) {
				break;
			}

			total += notas[i];
			media = total / notas.length;
		}

		System.out.println("\nNotas introducidas:");
		for (int i = 0; i < notas.length; i++) {

			if (notas[i] < notas[(int) min]) {
				min = i;
			} else if (notas[i] > notas[(int) max]) {
				max = i;
			}

			if (notas[i] >= 5 && notas[i] <= 10) {
				aprobados++;
			}

			if (notas[i] <= 0) {
				continue;
			}

			System.out.print(notas[i] + " ");
		}

		System.out.println("\n\nLas notas más baja y más alta son " + min + " y " + max + ", respectivamente.");
		System.out.println("\nHas aprobado " + aprobados + " exámenes.");
		System.out.println("\nTu nota media ha sido: " + media);

	}

}
