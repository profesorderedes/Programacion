package hoja1;

import java.util.Scanner;

public class Ejer14 {

	public static void main(String[] args) {

// Crea una aplicación que pida el número de mes y devuelva el nombre del mes (basta que lo
// haga para los meses de enero a abril.

		Scanner input = new Scanner(System.in);

		System.out.println("Introduce el número de un mes (1-12)");
		int mes = input.nextInt();

		if (mes == 1) {

			System.out.println("El primer mes es enero");
		} else if (mes == 2) {

			System.out.println("El segundo mes es febrero");
		} else if (mes == 3) {

			System.out.println("El tercer mes es marzo");
		} else if (mes == 4) {

			System.out.println("El cuarto mes es abril");
		} else {

			System.out.println("Otros meses...");
		}

	}

}