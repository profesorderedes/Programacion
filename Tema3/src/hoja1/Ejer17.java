package hoja1;

import java.util.Scanner;

public class Ejer17 {

	public static void main(String[] args) {

		double[] precios = new double[10];

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduzca 10 precios.");
		
		double total = 0;

		int precio10 = 0;

		for (int i = 0; i < precios.length; i++) {

			System.out.print("> ");
			precios[i] = entrada.nextDouble();

			total = total + precios[i];

			if (precios[i] > 10) {
				precio10++;
			}

		}

		System.out.println("El total a pagar es " + total + ".\n" + precio10 + " productos han superado los 10€.");

	}

}