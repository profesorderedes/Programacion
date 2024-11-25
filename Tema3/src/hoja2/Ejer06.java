package hoja2;

import java.util.Arrays;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int[] votos = new int[6];

		System.out.println("Dime los votos de seis partidos");

		// Leemos el array de votos.
		for (int i = 0; i < votos.length; i++) {
			votos[i] = teclado.nextInt();
		}

		// Inicializamos min y max, una vez que el array está lleno.
		int min = votos[0];
		int posMin = 0;
		int max = votos[0];
		int posMax = 0;

		for (int i = 1; i < votos.length; i++) {

			if (votos[i] < min) {

				min = votos[i];
				posMin = i;

			} else if (votos[i] > max) {

				max = votos[i];
				posMax = i;

			}

		}

		System.out.println("El mayor numero de votos es " + max + " y su posicion es " + posMax);
		System.out.println("El menor numero de votos es " + min + " y su posicion es " + posMin);

	}

}