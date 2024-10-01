package ejercicios;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {

		// Programa que hace la división entera entre dos números
		// (devuelve el cociente y el resto).

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe un número:");
		int num1 = entrada.nextInt();

		System.out.println("Escribe otro número:");
		int num2 = entrada.nextInt();

		System.out.println("Al hacer la división entera obtenemos:");
		System.out.println("Cociente: " + num1 / num2);
		System.out.println("Resto: " + num1 % num2);

	}

}
