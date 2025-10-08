package hoja1;

import java.util.Scanner;

public class Ejer15 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime un número del mes");
		int mes = entrada.nextInt();

		if (mes >= 1 && mes <= 4) {
			if (mes == 1) {

				System.out.println("El primer mes del año es Enero.");
			} else if (mes == 2) {

				System.out.println("El segundo mes del año es Febrero.");
			} else if (mes == 3) {

				System.out.println("El tercer mes del año es Marzo.");
			} else if (mes == 4) {

				System.out.println("El cuarto mes del año es Abril.");
			}
		}

	}

}