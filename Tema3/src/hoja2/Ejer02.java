package hoja2;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double[] estatura = new double[10];
		boolean personaAlta = false;

		for (int i = 0; i < estatura.length; i++) {

			System.out.println("ESTATURA EN METROS: ");
			estatura[i] = entrada.nextDouble();

			if (estatura[i] > 1.90) {
				personaAlta = true;
				System.out.println("Hay una persona con estatura mayor a 1.90 metros.");
				break;
			}

		}

		if (!personaAlta) {
			System.out.println("No hay ninguna persona con estatura mayor a 1.90 metros.");
		}

	}

}