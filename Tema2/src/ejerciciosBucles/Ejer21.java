package ejerciciosBucles;

import java.util.Scanner;

public class Ejer21 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int num;

		System.out.println("TABLAS DE MULTIPLICAR\n=====================");

		for (int i = 1; i < 6; i++) {

			System.out.print("Número: ");
			num = entrada.nextInt();

			if (num == 1) {
				System.out.println("No seas tonto");
				continue;
			}

			for (int j = 1; j <= 10; j++) {
				System.out.println(num + " x " + j + " = " + num * j);
			}

		}

	}

}