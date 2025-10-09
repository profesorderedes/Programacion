package hoja1;

import java.util.Scanner;

public class Ejer20 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Inserte dos valores, que luego se utilizarán en una operación matemática.");
		double valor1 = entrada.nextDouble();
		double valor2 = entrada.nextDouble();

		System.out.println("Elija una de estas operaciones:");
		System.out.println("1) Suma ");
		System.out.println("2) Resta");
		System.out.println("3) Multiplicación");
		System.out.println("4) División");

		int operacion = entrada.nextInt();

		switch (operacion) {

		case 1:

			System.out.println("El resultado de la suma es " + (valor1 + valor2) + ".");
			break;
		case 2:

			System.out.println("El resultado de la resta es " + (valor1 - valor2) + ".");
			break;
		case 3:

			System.out.println("El resultado de la multiplicación es " + (valor1 * valor2) + ".");
			break;
		case 4:

			System.out.println("El resultado de la división es " + (valor1 / valor2) + ".");
		}

	}

}