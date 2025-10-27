package hoja3;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {

// 1.- Escribe un programa que invente un nº aleatorio entre 1 y 10. El usuario tendrá que adivinarlo en
// tres intentos como máximo. Al finalizar el programa se le dirá si ha acertado el número y en cuántos
// intentos lo ha hecho. Utiliza while y break.
// Ayuda: Puedes generar un número aleatorio mayor o igual a 0 y menor que 1 con la orden
// Math.random( ). Si lo multiplicas por 10 y le sumas 1, entonces obtendrás un número entre 1 y 10,
// ambos inclusive:
// (int) (Math.random()*10 + 1)

		Scanner input = new Scanner(System.in);

		final int RANDOM_NUM = (int) (Math.random() * 10 + 1);
		int num = 0;
		int intentos = 1;

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

	}

}