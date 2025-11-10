package hoja1;

import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduzca las órdenes para el robot:\n");

		String[] ordenes = new String[1000];

		// fin indica la posición donde empiezan los arrays.
		int fin = 0;

		for (int i = 0; i < ordenes.length; i++) {

			System.out.println("Orden nº " + (i + 1) + ": ");
			ordenes[i] = entrada.nextLine();

			if (ordenes[i].equals("ejecutar")) {
				break;
			}

			fin++;

		}

		for (int i = 0; i < fin; i++) {

			System.out.println("> " + (i + 1) + ": " + ordenes[i] + ".");

		}

	}

}