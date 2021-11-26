package ejercicios1;

import java.util.Scanner;

public class Ejer07 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		double notas[] = new double[10];
		int i = 0;
		int j = 0;

		while (i < notas.length) {

			System.out.print("Nota número " + (i + 1) + ": ");
			notas[i] = entrada.nextDouble();

			i++;

		}

		System.out.println("\n" + "NOTAS GUARDADAS\n========================");

		while (j < notas.length) {
			System.out.println("La nota número " + (j + 1) + " es: " + notas[j]);
			j++;
		}

	}

}