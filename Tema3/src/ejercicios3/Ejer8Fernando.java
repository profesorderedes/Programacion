package ejercicios3;

import java.util.Scanner;

public class Ejer8Fernando {

	public static void main(String[] args) {

		// Piedra Papel Tijera

		Scanner entrada = new Scanner(System.in);

		int ordenador = (int) (Math.random() * 3) + 1;

		String seleccionOrdenador = "";

		if (ordenador == 1) {

			seleccionOrdenador = "Piedra";

		} else if (ordenador == 2) {

			seleccionOrdenador = "Papel";

		} else if (ordenador == 3) {

			seleccionOrdenador = "Tijera";

		}

		System.out.println("¿Qué sacarás? ¿Piedra, Papel " + "o Tijera?");

		String jugador = entrada.nextLine();

		System.out.println("Tu selección es " + jugador);

		System.out.println("La selección del ordenador es " + seleccionOrdenador);

		if (jugador.equals("Piedra")) {

			if (seleccionOrdenador.equals("Piedra")) {

				System.out.println("Empate.");

			} else

			if (seleccionOrdenador.equals("Papel")) {

				System.out.println("¡Has perdido!");

			} else

			if (seleccionOrdenador.equals("Tijera")) {

				System.out.println("¡Has ganado!");

			}

		}

		if (jugador.equals("Papel")) {

			if (seleccionOrdenador.equals("Piedra")) {

				System.out.println("¡Has ganado!");

			}

			if (seleccionOrdenador.equals("Papel")) {

				System.out.println("Empate.");

			}

			if (seleccionOrdenador.equals("Tijera")) {

				System.out.println("¡Has perdido!");

			}

		}

		if (jugador.equals("Tijera")) {

			if (seleccionOrdenador.equals("Piedra")) {

				System.out.println("¡Has perdido!");

			}

			if (seleccionOrdenador.equals("Papel")) {

				System.out.println("¡Has ganado!");

			}

			if (seleccionOrdenador.equals("Tijera")) {

				System.out.println("Empate.");

			}

		}

	}

}