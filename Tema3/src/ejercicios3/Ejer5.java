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
		
		// Leemos los precios.
		for (int i = 0; i < precios.length; i++) {

			System.out.print("Precio " + i + ": ");
			precio = entrada.nextFloat();

			
			if (precio < 0) {
				// Si el precio es negativo, hemos terminado.
				break;
			} else if (suma > CONDICION_REBAJA) {
				// Si la suma acumulada pasa de 50 euros,
				// guardamos el precio rebajado.
				precios[i] = precio * 0.9f;
				System.out.println("Artículo rebajado.");
			} else {
				// Por defecto, guardamos el precio tal cual.
				precios[i] = precio;
			}

			suma = suma + precios[i];
			System.out.println("suma = " + suma);

		}

	}

}
