package ejercicios;

import java.util.Scanner;

public class Ejer09 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dame un valor x: ");
		int x = entrada.nextInt();

		System.out.println("Dame un valor y: ");
		int y = entrada.nextInt();

		System.out.println("El número más grande es: " + max(x, y));
		System.out.println("El número más pequeño es: " + min(x, y));

	}

	static int max(int x, int y) {

		if (x >= y) {
			return x;
		}

		return y;

	}

	static int min(int x, int y) {

		if (x <= y) {
			return x;
		}
		
		return y;

	}

}