package ejerciciosCondicionales;

import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe un mes del año: ");
		int mes = entrada.nextInt();

		if (mes >= 1 && mes <= 12) {

			System.out.println("Mes correcto");

		} else {

			System.out.println("Mes no válido");
		}
	}

}