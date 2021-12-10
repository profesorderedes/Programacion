package ejercicios2;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int votos[] = new int[6];

		for (int i = 0; i < votos.length; i++) {

			System.out.println("¿Cuántos votos ha tenido el " + (i + 1) + " partido?");
			votos[i] = entrada.nextInt();

		}

		int posMin = 0;
		int posMax = 0;

		for (int i = 1; i < votos.length; i++) {

			if (votos[i] > votos[posMax]) {
				posMax = i;
			}

			if (votos[i] < votos[posMin]) {
				posMin = i;
			}

		}

		System.out.println(
				"El partido con más votos ha sido el " + (posMax + 1) + " con un total de " + votos[posMax] + " votos");
		System.out.println("El partido con menos votos ha sido el " + (posMin + 1) + " con un total de " + votos[posMin]
				+ " votos");

	}

}