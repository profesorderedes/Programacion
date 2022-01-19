package ejercicios3;

import java.util.Scanner;

public class Ejer7 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int tiempos[] = new int[15];

		int pedidoTarde = 0;

		System.out.println("Tiempo de los pedidos");

		System.out.println("=========================");

		for (int i = 0; i < tiempos.length; i++) {

			System.out.println("¿Cúanto ha tardado tu pedido nº" +

					(i + 1) + "?");

			tiempos[i] = entrada.nextInt();

			if (tiempos[i] > 30) {

				pedidoTarde++;

			}

		}

		System.out
				.println("Han fallado " + pedidoTarde + " pedidos, un " + ((pedidoTarde * 100) / tiempos.length) + "%");

	}

}