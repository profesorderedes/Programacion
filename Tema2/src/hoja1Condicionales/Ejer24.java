package hoja1Condicionales;

import java.util.Scanner;

public class Ejer24 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime la edad: ");
		int edad = entrada.nextInt();

		boolean mayorDeEdad;

		mayorDeEdad = (edad < 18) ? false : true;
		System.out.println("mayorDeEdad: " + mayorDeEdad);

	}

}