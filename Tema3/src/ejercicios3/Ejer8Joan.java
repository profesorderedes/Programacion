package ejercicios3;

import java.util.Scanner;

public class Ejer8Joan {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int cpu = (int) (Math.random() * 3 + 1);
		System.out.println(
				"Piedra, Papel o Tijera\n=======" + "=========\nElige:\n" + "1 - Piedra\n2 - Papel\n3 - Tijera");

		int jugador = entrada.nextInt();

		while (jugador < 1 || jugador > 3) {
			System.out.println("Selecciona un numero " + "entre el 1 y el 3.");
			jugador = entrada.nextInt();
		}

		switch (cpu) {
		case 1:
			System.out.println("La máquina saca: Piedra");
			break;
		case 2:
			System.out.println("La máquina saca: Papel");
			break;
		case 3:
			System.out.println("La máquina saca: Tijera");
			break;
		}

		if (jugador == cpu) {
			System.out.println("Empate.");
		} else if (jugador - cpu == 1 || jugador - cpu == -2) {
			System.out.println("Has ganado.");
		} else {
			System.out.println("Has perdido.");
		}

	}
}