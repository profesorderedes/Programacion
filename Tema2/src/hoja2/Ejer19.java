package hoja2;

import java.util.Scanner;

// 19.- Crea un programa que solicite al usuario los precios de cuatro objetos 
// y devuelva el precio total.

public class Ejer19 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe cuatro precios y te los sumaré:");

		float total = 0;

		for (int i = 1; i <= 4; i++) {

			System.out.print("Precio " + i + ": ");
			float precio = entrada.nextFloat();

			total = total + precio;

		}

		System.out.println("\nLa suma total es: " + total + " €.");

	}

}
