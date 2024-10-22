package hoja2;

import java.util.Scanner;

public class Ejer09 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Inserte el número a dividir");
		int dividendo = entrada.nextInt();

		System.out.println("Inserte el dividendo");
		int divisor = entrada.nextInt();

		while (dividendo >= divisor) {

			dividendo -= divisor;
			System.out.println(dividendo + " - " + divisor + " = " + dividendo);

		}

		System.out.println("El resto será " + dividendo);

	}

}