package hoja3;

import java.util.Scanner;

public class Ejer12 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double presion;

		do {
			System.out.print("Introduce el valor de presión: ");
			presion = entrada.nextDouble();

			if (presion >= 1.0 && presion <= 1.7) {
				System.out.println("Presión normal.");
			} else if (presion > 1.7) {
				System.out.println("Presión excesiva, hay riego de explosión.");
			} else if (presion < 1.0) {
				System.out.println("Presión baja, riego de vertido.");
			}

		} while (presion >= 0.4 && presion <= 2.5);

		System.out.println("La presión se encuentra fuera del rango seguro.");

	}
}