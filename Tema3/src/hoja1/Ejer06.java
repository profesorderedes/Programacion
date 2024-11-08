package hoja1;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {

// Escribe un programa que pida por consola los precios de diez productos y los guarde en un array.

// Haz que después se muestren todos los valores mediante un bucle for

		Scanner sc = new Scanner(System.in);

		double[] precios = new double[10];

		System.out.println("Escribe el nombre de 10 productos");

		for (int i = 0; i < precios.length; i++) {

			precios[i] = sc.nextDouble();

		}

		for (int i = 0; i < precios.length; i++) {

			System.out.println(precios[i]);

		}

	}

}