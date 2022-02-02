package ejercicios3;

import java.util.Scanner;

public class Ejer8Jorge {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int eleccion = 0;
		int aleatorio = 0;

		System.out.println("Piedra, Papel o Tijera ");
		System.out.println("===========================\n");
		System.out.println("Elige: \n");
		System.out.println("1) piedra\n" + "2) papel\n" 
		+ "3) tijera ");
		eleccion = entrada.nextInt();

		aleatorio = (int) (Math.random() * 3 + 1);

//		System.out.println(aleatorio);

		if (aleatorio == eleccion) {
			System.out.println("Empate");
		} else if (aleatorio == 2 && eleccion == 1) {
			System.out.println("Gana la maquina");
		} else if (aleatorio == 3 && eleccion == 1) {
			System.out.println("Ganaste");
		} else if (aleatorio == 3 && eleccion == 2) {
			System.out.println("Gana la maquina");
		} else if (aleatorio == 1 && eleccion == 2) {
			System.out.println("Ganaste");
		} else if (aleatorio == 1 && eleccion == 3) {
			System.out.println("Gana la maquina");
		} else if (aleatorio == 2 && eleccion == 3) {
			System.out.println("Ganaste");
		}

	}

}