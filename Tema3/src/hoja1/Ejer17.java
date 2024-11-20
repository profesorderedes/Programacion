package hoja1;

import java.util.Scanner;

public class Ejer17 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double[] precios = new double[10];
		int mayor = 0;
		double total = 0;

		for (int i = 0; i < precios.length; i++) {

			System.out.println("¿Cuánto te ha costado el producto?");
			precios[i] = entrada.nextDouble();

			total = total + precios[i];

			if (precios[i] > 10) {
				mayor++;
			}

		}

		System.out.println("Tienes que pagar " + total);
		System.out.println("Hay " + mayor + " productos que valen más de 10 euros.");

	}

}