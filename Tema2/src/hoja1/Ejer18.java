package hoja1;

import java.util.Scanner;

public class Ejer18 {

	public static void main(String[] args) {

// Crea un programa que pida un número de mes entre 1 y 12. A continuación devolverá el
// número de días de ese mes. Supón que no existen años bisiestos.

		Scanner input = new Scanner(System.in);

		System.out.println("Introduce el número de un mes (1-12)");
		int mes = input.nextInt();

		switch (mes) {

		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:

			System.out.println("Ese mes tiene 31 días");
			break;
		case 2:

			System.out.println("Ese mes tiene 28 días");
			break;
		default:

			System.out.println("Ese mes tiene 30 días");
		}

	}

}