package ejercicios3;

import java.util.Scanner;

public class Ejer8Carlos {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int respuesta;

		int eleccionMaquina;

		System.out.println("Piedra, Papel o Tijera\n======" + "================");

		System.out.println("Elige:\n1) Piedra\n2) Papel\n" + "3) Tijera");

		respuesta = entrada.nextInt();

		eleccionMaquina = (int) (Math.random() * 3 + 1);

		if (eleccionMaquina == 1) {

			System.out.println("La maquina saca... Piedra");

		} else if (eleccionMaquina == 2) {

			System.out.println("La maquina saca... Papel");

		} else {

			System.out.println("La maquina saca... Tijera");

		}

		if (respuesta == 1 && eleccionMaquina == 3) {

			System.out.println("Ha ganado el jugador.");

		} else if (eleccionMaquina == 1 && respuesta == 3) {

			System.out.println("Ha ganado la maquina.");

		} else if (respuesta == 3 && eleccionMaquina == 2) {

			System.out.println("Ha ganado el jugador.");

		} else if (eleccionMaquina == 3 && respuesta == 2) {

			System.out.println("Ha ganado la maquina.");

		} else if (respuesta == 2 && eleccionMaquina == 1) {

			System.out.println("Ha ganado el jugador.");

		} else if (eleccionMaquina == 2 && respuesta == 1) {

			System.out.println("Ha ganado la maquina.");

		} else {

			System.out.println("¡Ha habido empate!");

		}

	}

}