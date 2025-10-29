package hoja3;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {

//		2.- Añade al final del programa anterior el código necesario para que indique la puntuación obtenida
//		por el jugador:
//		• Si ha acertado en un intento → Recibe 10 puntos.
//		• Si ha acertado en dos intentos → Recibe 5 puntos.
//		• Si ha acertado en tres intentos → Recibe 2 puntos.
//		• En otro caso → Recibe 0 puntos.

		Scanner input = new Scanner(System.in);

		final int RANDOM_NUM = (int) (Math.random() * 10 + 1);

		int num = 0;
		int intentos = 1;
		int puntos = 0;

		System.out.println(RANDOM_NUM);
		System.out.println("INTENTA ADIVINAR EL NÚMERO SECRETO (1-10)\n----------------------------------------");

		while (intentos <= 3) {
			System.out.print("\nINTENTO\n> ");
			num = input.nextInt();

			if (num == RANDOM_NUM) {
				break;
			}

			intentos++;
		}

		if (num == RANDOM_NUM) {
			System.out.println("¡Has acertado en " + intentos + " intento(s)! ¡Muy bien!");
		} else {
			System.out.println("¡Vaya! No lo has acertado...\nEl número secreto era " + RANDOM_NUM + ".");
		}

		switch (intentos) {
		case 3:
			puntos = 2;
			break;
		case 2:
			puntos = 5;
			break;
		case 1:
			puntos = 10;
			break;
		}

		System.out.println("¡Sacaste " + puntos + " pts!");
	}

}