package hoja1;

import java.util.Scanner;

public class Ejer19 {

	public static void main(String[] args) {

// Modifica el programa anterior para que pida el año en curso y el número de mes. Y devuelva el
// número de días de ese mes (ahora sí debes tener en cuenta el asunto de los años bisiestos).

		Scanner input = new Scanner(System.in);

		System.out.println("Introduce el año");
		int year = input.nextInt();

		System.out.println("Introduce el número de un mes (1-12)");
		int mes = input.nextInt();

// Se asume que los valores introducidos son válidos

		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:

			System.out.println("Ese mes tiene 31 dias");
			break;

		default:

			System.out.println("Ese mes tiene 30 dias");

		case 2:

			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {

				System.out.println("El segundo mes es febrero, tiene 29 dias.");

			} else {

				System.out.println("El segundo mes es febrero, tiene 28 dias.");

			}

			break;

		}

	}

}