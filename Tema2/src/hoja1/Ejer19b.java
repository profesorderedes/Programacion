package hoja1;

import java.util.Scanner;

// Ejercicio 19 de la hoja 1 de condicionales.
public class Ejer19b {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("==== CALENDARIO ====");

		System.out.println("Dime un número de mes y te cuento cuántos días tiene:");
		int mes = entrada.nextInt();

		System.out.println("Dime también el año:");
		int anyo = entrada.nextInt();

		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31 días.");
			break;

		case 2:

			// Comprobamos si es bisiesto.
			if (anyo % 4 == 0 && anyo % 100 != 0 || anyo % 400 == 0) {
				System.out.println("29 días.");
			} else {
				System.out.println("28 días.");
			}

			break;

		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30 días.");
			break;

		default:
			System.out.println("El número de mes no es válido.");

		}
	}

}