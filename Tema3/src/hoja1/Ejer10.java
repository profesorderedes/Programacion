package hoja1;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float[] compra = new float[100];

		System.out.println("Por favor introduzca a continuación el precio de sus productos");

		for (int i = 0; i < compra.length; i++) {

			System.out.println("Precio del producto " + i);
			compra[i] = entrada.nextFloat();

			if (compra[i] == 0) {
				System.out.println("Gracias por su compra.");
				break;
			}

		}

		for (int i = 0; i < compra.length; i++) {

			if (compra[i] == 0) {
				break;
			}
			System.out.println("Precio del producto " + i + ": " + compra[i]);
		}

	}

}