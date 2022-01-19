package ejercicios2;

import java.util.Scanner;

public class Ejer07 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int espectadores[] = { 2_000_000, 2500000, 3100000, 3000000, 1200000, 1800000, 2050000 };

		int posMax = 0;
		int posMin = 0;

		for (int pos = 0; pos < espectadores.length; pos++) {

			if (espectadores[pos] > espectadores[posMax]) {

				posMax = pos;

			}

			if (espectadores[pos] < espectadores[posMin]) {

				posMin = pos;

			}

		}

		System.out.println("El día con más espectadores es el " + (posMax + 1) + " de la semana con : "
				+ espectadores[posMax] + " visitas.");

		System.out.println("El día con menos espectadores es " + (posMin + 1) + " de la semana con : "
				+ espectadores[posMin] + " visitas.");

	}

}