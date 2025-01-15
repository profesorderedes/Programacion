package ejercicios;

import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime un año y te dire si es bisiesto o no.");
		int anyo = entrada.nextInt();

		System.out.println(bisiesto(anyo));

	}

	static boolean bisiesto(int anyo) {

		if ((anyo % 4 == 0 && anyo % 100 != 0) || (anyo % 400 == 0)) {

			return true;

		}

		return false;

	}

}