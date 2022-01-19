package ejercicios2;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double estaturas[] = new double[10];
		boolean estaturaEncontrada = false;

		for (int i = 0; i < estaturas.length; i++) {
			System.out.println("Dime tu estatura: ");
			estaturas[i] = entrada.nextDouble();
		}

		for (int i = 0; i < estaturas.length; i++) {
			if (estaturas[i] > 1.90) {
				estaturaEncontrada = true;
				break;
			}

		}

		if (estaturaEncontrada) {
			System.out.println("Hay al menos una estatura " + "mayor de 1,90m.");
		} else {
			System.out.println("Todas las estaturas son " + "menores de 1,90m.");
		}

	}

}