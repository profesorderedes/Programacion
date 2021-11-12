package ejerciciosBucles;

import java.util.Scanner;

public class Ejer20 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe tu numero secreto");

		int secreto = entrada.nextInt();

		for (int i = 1; i <= 10; i++) {

			if (secreto == 6) {

				System.out.println("Felicidades");
				break;

			} else if (i <= 9) {

				System.out.println("Vuelve a introducir el numero secreto");
				secreto = entrada.nextInt();

			} else {
				
				System.out.println("Has perdido");
				
			}

		}

	}
}
