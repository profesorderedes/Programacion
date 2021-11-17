package ejercicios2;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int aleatorio = (int) (Math.random() * 10 + 1);
		System.out.println(aleatorio);

		System.out.println("¡ADIVINA EL NÚMERO ENTRE 1 Y 10!");

		int num;
		int i = 1;

		do {

			System.out.print("Número: ");
			num = entrada.nextInt();

			if (num == aleatorio) {
				System.out.println("¡¡Has ganado!!");
				break;
			} else {
				System.out.println("Te quedan " + (3 - i) + " intentos.");
			}

			i++;

		} while (i <= 3);

		System.out.println("\nGracias por jugar.");

	}

}
