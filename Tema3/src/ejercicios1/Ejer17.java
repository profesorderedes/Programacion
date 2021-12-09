package ejercicios1;

import java.util.Scanner;

//Escribe una aplicación que pida al usuario diez precios de productos. Después devolverá el
//precio total a pagar y el número de productos cuyo precio sea mayor de 10 euros.

public class Ejer17 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double precios[] = new double[10];
		double total = 0;
		int mayor10 = 0;

		System.out.println("Escribe el precio de 10 productos");

		for (int i = 0; i < precios.length; i++) {
			System.out.println("Precio: ");
			precios[i] = entrada.nextDouble();

			total = total + precios[i];

			if (precios[i] > 10) {
				mayor10++;
			}

		}

		System.out.println("En total, debes pagar: " + total + " €");

		if (mayor10 >= 1) {
			System.out.println("Has comprado " + mayor10 + " productos por encima de 10€.");
		}

	}

}