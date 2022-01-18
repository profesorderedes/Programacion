package ejercicios3;

import java.util.Scanner;

public class Ejer5b {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		float precios[] = new float[50];
		final int TOPE = 50;
		float total = 0;

		System.out.println("Caja registradora:");
		System.out.println("=====================");

		for (int i = 0; i < precios.length; i++) {
			System.out.println("Precio " + " " + (i + 1) + " :");
			precios[i] = entrada.nextFloat();

			if (precios[i] < 0) {
				break;
			} else if (total > TOPE) {
				total = total + precios[i] * 0.9F;
			} else {
				total = total + precios[i];
			}
		}

		System.out.println("Ticket de la compra.");
		for (int i = 0; i < precios.length; i++) {
			if (precios[i] < 0) {
				break;
			} else {
				System.out.println(precios[i]);
			}

		}
		System.out.println("Total a pagar: " + total + "\nGracias por la compra.");
	}

}