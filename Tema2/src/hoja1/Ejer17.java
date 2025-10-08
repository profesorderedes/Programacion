package hoja1;

import java.util.Scanner;

public class Ejer17 {

	public static void main(String[] args) {

// Haz un programa que pida un número de mes entre 1 y 12. A continuación
// devolverá elnombre del mes correspondiente

		Scanner entrada = new Scanner(System.in);

		System.out.println("Inserte el número de un mes: ");
		int numero = entrada.nextInt();

		switch (numero) {

		case 1:

			System.out.println("El mes es enero ");
			break;
		case 2:

			System.out.println("El mes es febrero");
			break;
		case 3:

			System.out.println("El mes es marzo");
			break;
		case 4:

			System.out.println("El mes es abril");
			break;
		case 5:

			System.out.println("El mes es mayo");
			break;
		case 6:

			System.out.println("El mes es junio");
			break;
		case 7:

			System.out.println("El mes es julio");
			break;
		case 8:

			System.out.println("El mes es agosto");
			break;
		case 9:

			System.out.println("El mes es septiembre");
			break;
		case 10:

			System.out.println("El mes es octubre");
			break;
		case 11:

			System.out.println("El mes es noviembre");
			break;
		case 12:

			System.out.println("El mes es diciembre");
			break;
		default:

			System.out.println("Inserte un número válido.");
		}

	}

}