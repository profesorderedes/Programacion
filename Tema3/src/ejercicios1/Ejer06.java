package ejercicios1;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float precios[] = new float[10];

		for (int i = 0; i < precios.length; i++) {

			System.out.print("Precio " + (i + 1) + ": ");
			precios[i] = entrada.nextFloat();

		}

		System.out.println("\nLos precios son los siguientes:\n");

		for (int i = 0; i < precios.length; i++) {

			System.out.println(precios[i]);

		}

	}
}