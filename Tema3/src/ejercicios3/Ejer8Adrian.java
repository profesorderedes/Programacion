package ejercicios3;

import java.util.Scanner;

public class Ejer8Adrian {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int numElegido;

		int numRandom;

		boolean seguirJugando = true;

		while (seguirJugando) {

			System.out.println(
					"¡Vamos a jugar al piedra papel o tijera, elige una opcion!\n\n1) Piedra\n2) Papel\n3) Tijera");

			numElegido = input.nextInt();

			numRandom = (int) (Math.random() * 3 + 1);

			switch (numRandom) {

			case 1: {

				System.out.println("La máquina saca... Piedra");

				break;

			}

			case 2: {

				System.out.println("La máquina saca... Papel");

				break;

			}

			case 3: {

				System.out.println("La máquina saca... Tijera");

				break;

			}

			}

			if (numElegido == numRandom) {

				System.out.println("¡Ha habido un empate!");

			}

			else if (numElegido == 1 && numRandom == 2 || numElegido == 2 && numRandom == 3
					|| numElegido == 3 && numRandom == 1) {

				System.out.println("¡Has perdido!");

			}

			else {

				System.out.println("¡Has ganado!");

			}

			System.out.println("¿Quieres seguir jugando? Responde con \"si\" o \"no\"");

			String preguntarUsuario = input.next();

			if (preguntarUsuario.toLowerCase().equals("si"))
				seguirJugando = true;
			else
				seguirJugando = false;

		}

	}

}