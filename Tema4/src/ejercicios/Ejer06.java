package ejercicios;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe un número y te mostraré " + "su cuadrado: ");

		double numero = entrada.nextInt();

		double resultado = cuadrado(numero);

		System.out.println(resultado);

	}

	static double cuadrado(double numero) { // Método

		return Math.pow(numero, 2);

	}

}