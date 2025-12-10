package hoja3;

import java.util.Scanner;

public class Ejer08a {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String[] opciones = { "Piedra", "Papel", "Tijera" };

		System.out.println("Piedra, Papel o Tijera");
		System.out.println("=======================");

		System.out.println("Elige:\n1) Piedra\n2) Papel\n3) Tijera");

		int num = entrada.nextInt();

		int numOrdenador = (int) (Math.random() * 3) + 1;

		System.out.println("La máquina saca... " + opciones[numOrdenador - 1]);

		if (num == 1 && numOrdenador == 2) {

			System.out.println("¡Gana la máquina!");

		} else if (num == 1 && numOrdenador == 3) {

			System.out.println("¡Has ganado!");

		} else if (num == 2 && numOrdenador == 1) {

			System.out.println("¡Has ganado!");

		} else if (num == 2 && numOrdenador == 3) {

			System.out.println("¡Gana la máquina!");

		} else if (num == 3 && numOrdenador == 1) {

			System.out.println("¡Gana la máquina!");

		} else if (num == 3 && numOrdenador == 2) {

			System.out.println("¡Has ganado!");

		} else {

			System.out.println("¡Ha habido empate!");

		}

	}

}