package hoja3;

import java.util.Scanner;

public class Ejer09 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		while (true) {

			System.out.println("TEMPERATURA? ");
			double temperatura = entrada.nextDouble();

			if (temperatura >= 10 && temperatura <= 30) {
				System.out.println("Temperatura normal.\n");
			} else if (temperatura > 30 && temperatura <= 40) {
				System.out.println("Activar ventiladores a media potencia.\n");
			} else if (temperatura > 40 && temperatura <= 50) {
				System.out.println("Activar ventiladores a máxima potencia.\n");
			} else if (temperatura < 0 || temperatura > 50) {
				System.out.println("Límite no aceptable.");
				break;
				// Espacio entre 0 y 10ºC
			} else {
				System.out.println("Revise otra vez la temperatura.\n");
			}

		}

	}

}
