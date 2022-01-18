package ejercicios3;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {

		final float CONDICION_REBAJA = 50;

		Scanner entrada = new Scanner(System.in);
		float precios[] = new float[5];
		float precio;
		float suma = 0;

		System.out.println("Caja registradora");
		System.out.println("====================");
		for (int i = 0; i < precios.length; i++) {

			System.out.print("Precio " + i + ": ");
			precio = entrada.nextFloat();

			if (precio < 0) {
				break;
			} else if (suma > CONDICION_REBAJA) {
				precios[i] = precio * 0.9f;
				System.out.println("Artículo rebajado.");
			} else {
				precios[i] = precio;
			}

			suma = suma + precio;
			System.out.println("suma = " + suma);

		}

	}

}
