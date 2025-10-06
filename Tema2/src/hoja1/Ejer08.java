package hoja1;

import java.util.Scanner;

public class Ejer08 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Cómo se dice ordenador en inglés?");
		String palabra = entrada.nextLine();

		if (palabra.equals("computer")) {

			System.out.println("¡Enhorabuena!");

		} else {

			System.out.println("¡La próxima vez será!");

		}

	}

}