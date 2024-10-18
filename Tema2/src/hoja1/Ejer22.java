package hoja1;

import java.util.Scanner;

public class Ejer22 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe un número entero, entre el 1 y el 10");

		if (entrada.hasNextInt()) {

			int numEnt = entrada.nextInt();

			if (numEnt >= 1 && numEnt <= 10) {
				System.out.println(numEnt + ", es un número entero.");
			} else {
				System.out.println("Había que escribir un número del 1 al 10.");
			}

		} else {

			System.out.println("Error");

		}

	}

}