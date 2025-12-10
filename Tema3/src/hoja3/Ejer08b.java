package hoja3;

import java.util.Scanner;

public class Ejer08b {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String[] opciones = { "Piedra", "Papel", "Tijera" };

		// 0 = empate
		// 1 = gana el jugador
		// 2 = gana la máquina
		// fila = jugador, col = máquina
		// @formatter:off
		int[][] resultados = { 
				{ 0, 2, 1 }, 
				{ 1, 0, 2 }, 
				{ 2, 1, 0 } 
		};
		// @formatter:on

		System.out.println("Piedra, Papel o Tijera");
		System.out.println("=======================");

		System.out.println("Elige:\n1) Piedra\n2) Papel\n3) Tijera");
		int num = entrada.nextInt();

		int numOrdenador = (int) (Math.random() * 3) + 1;

		System.out.println("La máquina saca... " + opciones[numOrdenador - 1]);

		if (resultados[num - 1][numOrdenador - 1] == 1) {
			System.out.println("¡Gana el jugador!");
		} else if (resultados[num - 1][numOrdenador - 1] == 2) {
			System.out.println("¡Gana la máquina!");
		} else {
			System.out.println("¡Empate!");
		}

	}

}