package hoja3;

import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime un número.");
		int numero = entrada.nextInt();

		System.out.println("Números entre el 500 y el " + numero);

		do {
			System.out.println(numero);
			numero = numero + 1;
		} while (numero <= 500);

	}
}
