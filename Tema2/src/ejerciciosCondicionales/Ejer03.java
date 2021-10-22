package ejerciciosCondicionales;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Añade un precio a un Producto");

		float precio = entrada.nextFloat();

		if (precio < 5) {

			float resultado = precio + 2;

			System.out.println("La factura de gestion " + resultado);

		}

	}

}