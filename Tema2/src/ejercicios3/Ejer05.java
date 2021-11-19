package ejercicios3;

import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num = 1;

		do {

			System.out.println("\nDime un número y te mostraré la tabla de multiplicar del 1 al 10");

			num = entrada.nextInt();

			for (int i = 1; i <= 10; i++) {

				System.out.println(num + " x " + i + " = " + num * i);

			}

		} while (num != 0);

	}

}