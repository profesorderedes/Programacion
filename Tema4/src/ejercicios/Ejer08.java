package ejercicios;

import java.util.Scanner;

public class Ejer08 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dame un valor a: ");
		int a = entrada.nextInt();

		System.out.println("Dame un valor b: ");
		int b = entrada.nextInt();

		System.out.println("Dame un valor c: ");
		int c = entrada.nextInt();

		System.out.println("Resultado ecuación 1: " + solucion1(a, b, c));
		System.out.println("Resultado ecuación 2: " + solucion2(a, b, c));

	}

	static double solucion1(int a, int b, int c) {

		return (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);

	}

	static double solucion2(int a, int b, int c) {

		return (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

	}

}