package hoja3;

import java.util.Scanner;

public class Ejer09b {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double temperatura = 20;
		while (temperatura >= 0 && temperatura <= 50) {

			System.out.println("TEMPERATURA? ");
			temperatura = entrada.nextDouble();

			if (temperatura >= 10 && temperatura <= 30) {
				System.out.println("Temperatura normal.\n");
			} else if (temperatura > 30 && temperatura <= 40) {
				System.out.println("Activar ventiladores a media potencia.\n");
			} else if (temperatura > 40 && temperatura <= 50) {
				System.out.println("Activar ventiladores a máxima potencia.\n");
			}

		}

		System.out.println("Temperatura fuera de rango.");

	}

}
