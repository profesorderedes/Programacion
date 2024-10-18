package hoja1;

import java.util.Scanner;

public class Ejer14 {

	public static void main(String[] args) {

		// Crea una aplicación que pida el número de mes y devuelva el nombre del mes
		// (basta que lo haga para los meses de enero a abril).

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime un número del mes");
		int mes = entrada.nextInt();

		if (mes == 1) {

			System.out.println("enero");

		} else if (mes == 2) {

			System.out.println("febrero");

		} else if (mes == 3) {

			System.out.println("marzo");

		} else if (mes == 4) {

			System.out.println("abril");

		} else if (mes == 5) {

			System.out.println("mayo");

		} else if (mes == 6) {

			System.out.println("junio");

		} else if (mes == 7) {

			System.out.println("julio");

		} else if (mes == 8) {

			System.out.println("agosto");

		} else if (mes == 9) {

			System.out.println("septiembre");

		} else if (mes == 10) {

			System.out.println("octubre");

		} else if (mes == 11) {

			System.out.println("noviembre");

		} else if (mes == 12) {

			System.out.println("diciembre");

		}

	}

}