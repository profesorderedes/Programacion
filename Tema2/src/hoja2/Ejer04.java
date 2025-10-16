package hoja2;

import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce un número entre el 1 y el 5.");
		int num = entrada.nextInt();

		while (num != 3) {

			System.out.println("Introduce otro número.");
			num = entrada.nextInt();

		}

		System.out.println("¡Enhorabuena, has acertado!");

	}

}