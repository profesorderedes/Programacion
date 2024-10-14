package ejercicios;

import java.util.Scanner;

public class Ejer18 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("==== CALENDARIO ====");

		System.out.println("Dime un número de mes y te cuento cuántos días tiene:");
		int mes = entrada.nextInt();

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
			System.out.println("28 días.");
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
