package hoja1Condicionales;

import java.util.Scanner;

public class Ejer17 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("##### CALENDARIO #####");

		System.out.println("Dime un número de mes y te diré el nombre de " + "ese mes:");
		int mes = entrada.nextInt();

		switch (mes) {
		case 1:
			System.out.println("Enero");
			break;

		case 2:
			System.out.println("Febrero");
			break;

		case 3:
			System.out.println("Marzo");
			break;

		case 4:
			System.out.println("Abril");
			break;

		case 5:
			System.out.println("Mayo");
			break;

		case 6:
			System.out.println("Junio");
			break;

		case 7:
			System.out.println("Julio");
			break;

		case 8:
			System.out.println("Agosto");
			break;

		case 9:
			System.out.println("Septiembre");
			break;

		case 10:
			System.out.println("Octubre");
			break;

		case 11:
			System.out.println("Noviembre");
			break;

		case 12:
			System.out.println("Diciembre");
			break;

		default:
			System.out.println("Tienes que escribir un número entre 1 y 12.");
			break;

		}

		System.out.println("Gracias por usar el calendario.");

	}

}
