package prac1;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		final int NUM_TIEMPOS = 8;
		int tiempo = 0;
		float suma = 0;

		for (int i = 1; i <= NUM_TIEMPOS; i++) {

			System.out.println("Introduzca el tiempo del jugador " + i);
			tiempo = entrada.nextInt();

			suma = suma + tiempo;

		}

		System.out.println("El tiempo total es: " + suma + " segundos");

		System.out.println("\nEl tiempo medio es: " + suma / NUM_TIEMPOS + " segundos");

	}

}
