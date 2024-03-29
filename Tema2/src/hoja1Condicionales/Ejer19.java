package hoja1Condicionales;

import java.util.Scanner;

public class Ejer19 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("       ##### CALENDARIO #####");

		System.out.println("Dime el año:");
		int anyo = entrada.nextInt();

		System.out.println("Dime un número de mes y te diré el número de días que tiene:");
		int mes = entrada.nextInt();

		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31 días");
			break;

		case 2:

			// La segunda condición anyo%100 sobra pero la dejamos para
			// que se entienda mejor.
			if (anyo % 100 != 0 && anyo % 4 == 0 || anyo % 100 == 0 && anyo % 400 == 0) {
				System.out.println("29 días");
			} else {
				System.out.println("28 días");
			}

			break;

		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30 días");
			break;

		default:
			System.out.println("Tienes que escribir un número entre 1 y 12.");
			break;

		}

	}

}
