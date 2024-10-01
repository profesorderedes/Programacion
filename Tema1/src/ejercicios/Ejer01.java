package ejercicios;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {

		// Pedir dos números y multiplicarlos.

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe un número:");
		float num1 = entrada.nextFloat();

		System.out.println("Escribe otro número:");
		float num2 = entrada.nextFloat();

		System.out.println("El resultado de multiplicar " + num1 + " por " + num2 + " es " + num1 * num2);
	}

}
