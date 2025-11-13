package hoja2;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {

// 6.- Escribe una aplicación que vaya preguntando los votos de seis partidos políticos en unas
// elecciones y guardándolos en un array. Al acabar, dirá cuál ha sido el menor número de votos y cuál
// el mayor, así como las posiciones del array que ocupan estos partidos.

		Scanner input = new Scanner(System.in);

		int[] votos = new int[6];
		int posMin = 0, posMax = 0;

		for (int i = 0; i < votos.length; i++) {

			System.out.println("¿Cuántos votos ha obtenido el partido político nº " + (i + 1) + "?");
			votos[i] = input.nextInt();

		}

		for (int i = 1; i < votos.length; i++) {

			if (votos[i] < votos[posMin]) {
				posMin = i;
			} else if (votos[i] > votos[posMax]) {
				posMax = i;
			}

		}

		System.out.println("\nEl partido político con más votos era el partido " + (posMax + 1)
				+ "\n(en el array es el " + posMax + ").\n¡Han obtenido " + votos[posMax] + " votos!");

		System.out.println("\nEl partido político con menos votos era el partido " + (posMin + 1)
				+ "\n(en el array es el " + posMin + ").\n¡Han obtenido " + votos[posMin] + " voto(s)!");

	}

}