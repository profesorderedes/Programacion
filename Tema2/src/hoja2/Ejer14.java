package hoja2;

import java.util.Scanner;

public class Ejer14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int respuesta = 0;

		do {

			System.out.println("¿Qué campeón es support en el lol?");
			System.out.println("1.- Soraka");
			System.out.println("2.- Kayn");
			System.out.println("3.- Ahri");
			System.out.println("4.- Aatrox");

			respuesta = sc.nextInt();

		} while (respuesta < 1 || respuesta > 4);

		if (respuesta == 1) {

			System.out.println("Acertaste.");

		} else {

			System.out.println("Te equivocaste.");

		}

	}

}