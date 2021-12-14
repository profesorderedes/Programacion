package ejercicios2;

import java.util.Scanner;

public class Ejer07 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int espectadores[] = new int[7];

		for (int i = 0; i < espectadores.length; i++) {

			System.out.println("Espectadores del º" + (i + 1) + " de la semana");

			espectadores[i] = entrada.nextInt();

		}

		int espectMax = 0;

		int especMin = 0;

		for (int i = 0; i < espectadores.length; i++) {

			if (espectadores[i] > espectMax) {

				espectMax = i;

			}

			if (espectadores[i] < especMin) {

				especMin = i;

			}

		}

		System.out.println("El dia con mas espectadores es º" + (espectMax + 1) + " de la semana con : "
				+ espectadores[espectMax] + " visitas.");

		System.out.println("El dia con menos espectadores es º" + (especMin + 1) + " de la semana con : "
				+ espectadores[especMin] + " visitas.");

	}

}