package ejercicios2;

import java.util.Scanner;

public class Ejer08 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int humedad[] = { 45, 40, 40, 40, 37, 35, 39, 39, 45, 50, 
				55, 60, 65, 70, 70, 75, 75, 72, 65, 60, 55, 50, 
				50, 45 };

		int posMin = 0;
		int posMax = 0;

		for (int i = 1; i < humedad.length; i++) {

			if (humedad[i] < humedad[posMin]) {

				posMin = i;

			} else if (humedad[i] > humedad[posMax]) {

				posMax = i;

			}

		}

		System.out.println("La humedad menor es de " 
		+ humedad[posMin] + "% y se ha encontrado a las " 
				+ posMin + "h");
		System.out.println("La humedad mayor es de " 
				+ humedad[posMax] + "% y se ha encontrado a las " 
				+ posMax + "h");

	}
}