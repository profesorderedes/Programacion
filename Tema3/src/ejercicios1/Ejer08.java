package ejercicios1;

import java.util.Scanner;

public class Ejer08 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		double notas[] = new double[10];
		int i = 0;

		while (i < notas.length) {
			System.out.println("Dime tus notas\n " + (i + 1) + " : ");
			notas[i] = entrada.nextInt();

			if (notas[i] < 0) {
				break;
			}
			i++;
		}

		System.out.println("Las notas son: ");
		i = 0;
		while (i < notas.length) {

			if (notas[i] >= 0) {
				System.out.println("nota " + (i + 1) + ": " + notas[i]);
			} else {
				break;
			}
			i++;
		}

	}
}