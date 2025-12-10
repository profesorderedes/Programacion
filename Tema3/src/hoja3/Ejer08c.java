package hoja3;

import java.util.Scanner;

public class Ejer08c {

	public static void main(String[] args) {

		System.out.println("Piedra, Papel o Tijera\n======================\nElige:\n1) Piedra\n2) Papel\n3) Tijera");

		int maquina;

		Scanner entrada = new Scanner(System.in);

		String nombrem = "";

		int jugador = entrada.nextInt();

		if (jugador < 1 || jugador > 3) {

			System.out.println("Número no válido.");
			return;

		}

		maquina = (int) (Math.random() * 3 + 1);

		if (maquina == 1) {

			nombrem = "Piedra";

		} else if (maquina == 2) {

			nombrem = "Papel";

		} else if (maquina == 3) {

			nombrem = "Tijera";

		}

		System.out.println("La máquina saca..." + nombrem);

		if (jugador == maquina) {

			System.out.println("¡Ha habido un empate!");

		} else if (jugador == 1 && maquina == 2) {

			System.out.println("¡Ha ganado la máquina!");

		} else if (jugador == 2 && maquina == 3) {

			System.out.println("¡Ha ganado la máquina!");

		}else if (jugador == 3 && maquina == 1) {

			System.out.println("¡Ha ganado la máquina!");

		}else if (jugador == 3 && maquina == 2) {

			System.out.println("¡Ha ganado el jugador!");

		}else if (jugador == 1 && maquina == 3) {

			System.out.println("¡Ha ganado el jugador!");

		} else if (jugador == 2 && maquina == 1) {

			System.out.println("¡Ha ganado el jugador!");

		}

	}

}