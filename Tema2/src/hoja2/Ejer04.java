package hoja2;

import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("NÚMERO DEL 1 AL 5: ");
		int num = entrada.nextInt();

		while (num != 3) {

			System.out.println("INTRODUZCA UN NÚMERO DENTRO DEL 1 AL 5");
			num = entrada.nextInt();

		}

		System.out.println("¡FELICIDADES!");

	}

}