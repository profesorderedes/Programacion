package ejercicios;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {

		// Pedir dos números y mostrar el resto de su división.

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe un número:");
		int num1 = entrada.nextInt();

		System.out.println("Escribe otro número:");
		int num2 = entrada.nextInt();

		System.out.println("El resto de dividir " + num1 + " entre " + num2 
				+ " es " + num1 % num2);

	}

}
