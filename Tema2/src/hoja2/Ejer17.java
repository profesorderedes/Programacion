package hoja2;

import java.util.Scanner;

public class Ejer17 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Dime un número");
		int numero = teclado.nextInt();

		for (int i = 1; i <= 10; i++) {

			int operacion = numero * i;

			System.out.println(numero + "*" + i + "=" + operacion);

		}

	}

}